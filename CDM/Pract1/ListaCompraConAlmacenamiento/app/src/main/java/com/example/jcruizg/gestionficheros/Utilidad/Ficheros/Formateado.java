package com.example.jcruizg.gestionficheros.Utilidad.Ficheros;

import android.util.Log;

import com.example.jcruizg.gestionficheros.R;
import com.example.jcruizg.gestionficheros.Utilidad.Compras.Compra;
import com.example.jcruizg.gestionficheros.Utilidad.Compras.Producto;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/************************************************************************************************
 *
 *** CLASE DE UTILIDAD EN LA QUE DERIVAMOS EL PROCESAMIENTO DE DATOS FORMATEADOS EN XML
 *
 ************************************************************************************************/

public class Formateado{
    //
    // TRANSFORMA UN PRODUCTO EN UN STRING CON FORMATO XML QUE LO REPRESENTA
    //
    public static String aXML(Producto p) {
        String retStr = "\t<producto>\n";
        retStr += "\t\t<nombre>" + p.getNombre() + "</nombre>\n";
        retStr += "\t\t<lugar_compra>" + p.getLugarDeCompra() + "</lugar_compra>\n";
        retStr += "\t\t<necesidad>" + p.getNecesidad() + "</necesidad>\n";
        retStr += "\t</producto>\n";
        return retStr;
    }
    //
    // TRANSFORMA UNA COMPRA EN UN STRING CON FORMATO XML QUE LA REPRESENTA
    //
    public static String aXML(Compra c) {
        String retStr = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<compra>\n";
        for (Producto p: c.getListaDeProductos()){
            retStr += aXML(p);
        }
        retStr += "</compra>\n";
        return retStr;
    }

    //
    // PROCESAMIENTO DE UNA COMPRA EXPRESADA EN FORMATO XML
    // SE RETORNA UN OBJETO DE TIPO COMPRA
    //
    public static Compra desdeXML(String compraStr){
        XmlPullParserFactory parserFactory;
        try {
            parserFactory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = parserFactory.newPullParser();
            InputStream is = new ByteArrayInputStream(compraStr.getBytes(StandardCharsets.UTF_8));;
            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
            parser.setInput(is, null);
            Log.d("[XMLParsing]:"," Processing parsing");

            return processParsing(parser);

        } catch (XmlPullParserException e) {
            Log.d("[XMLParsing:Exception]:",e.toString());
            return null;

        } catch (IOException e) {
            Log.d("[XMLParsing:Exception]:",e.toString());
            return null;
        }
    }

    static final String nombre_TAG = "nombre";
    static final String lugar_TAG = "lugar_compra";
    static final String necesidad_TAG = "necesidad";
    static final String producto_TAG = "producto";
    static final String TAG_PARSING_XML = "[XMLParsing]";

    //
    // LOS DISTINTOS TAGS DEL XML A PROCESAR SON INTERPRETADOS POR UN XmlPullParser EN ESTE MÉTODO
    //
    private static Compra processParsing(XmlPullParser parser) throws IOException, XmlPullParserException{
        Compra compra = new Compra();
        Producto producto=null;

        int eventType = parser.getEventType();

        while (eventType != XmlPullParser.END_DOCUMENT) {
            String name = null;
            switch (eventType) {
                case XmlPullParser.START_DOCUMENT:
                    break;
                case XmlPullParser.START_TAG:
                    name = parser.getName();
                    if (name.equalsIgnoreCase(producto_TAG)) { //NUEVO PRODUCTO
                        Log.d(TAG_PARSING_XML, "Creando nuevo producto");
                        producto = new Producto();
                    } else if (producto != null) {
                        if (name.equalsIgnoreCase(nombre_TAG)) { //NOMBRE DEL PRODUCTO
                            producto.setNombre(parser.nextText());
                            Log.d(TAG_PARSING_XML, "> Nombre: "+producto.getNombre());

                        } else if (name.equalsIgnoreCase(lugar_TAG)) { // LUGAR DE COMPRA
                            producto.setLugarDeCompra(parser.nextText());
                            Log.d(TAG_PARSING_XML, "> Lugar: "+producto.getLugarDeCompra());

                        } else if (name.equalsIgnoreCase(necesidad_TAG)) { //NIVEL DE NECESIDAD DE LA COMPRA
                            int necesidad = Integer.parseInt(parser.nextText());
                            switch(necesidad){
                                case R.drawable.muy_necesario:
                                case R.drawable.nada_necesario:
                                case R.drawable.necesario:
                                case R.drawable.poco_necesario:
                                    Log.d(TAG_PARSING_XML, "> Necesidad conocida");
                                    break;
                            }
                            producto.setNecesidad(necesidad);
                        }
                    }
                    break;
                case XmlPullParser.END_TAG:
                    name = parser.getName();
                    if (name.equalsIgnoreCase(producto_TAG)) { //FIN DE PROCESAMIENTO DEL PRODUCTO
                        if (producto != null) {
                            compra.anyadeProducto(producto);
                            Log.d(TAG_PARSING_XML, "Añadiendo nuevo producto"); //AÑADIENDO PRODUCTO A LA LISTA DE LA COMPRA
                        }
                    }
                    break;

            }
            eventType = parser.next();
        }

        return compra;
    }
}
