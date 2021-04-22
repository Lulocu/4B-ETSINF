package com.example.jcruizg.comunicacioneshttp.Utilidad.Divisas;

import android.content.Context;
import android.util.Log;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**********************************************************************************************************
 *
 ** ESTE PROVEEDOR DE DIVISAS ESTÁ DISEÑADO PARA OBTENER LAS DIVISAS DE UN FICHERO XML Y PROCESARLO PARA
 *  OBTENER UN HASH DE DIVISAS (HASHDIVISAS)
 *
 **********************************************************************************************************/

public class ProveedorDeDivisasEnFormatoXML extends ProveedorDeDivisas {

    Context ctx = null;
    String origenDatos = null;

    public ProveedorDeDivisasEnFormatoXML(Context c, String oD){
        ctx = c;
        origenDatos = oD;
    }
    public ProveedorDeDivisasEnFormatoXML(String oD) {
        ctx = null;
        origenDatos = oD;
    }
    public ProveedorDeDivisasEnFormatoXML(){
        ctx = null;
        origenDatos = null;
    }
    //
    // PODEMOS OBTENER LA INFORMACIÓN DESDE UN ASSET O FICHERO LOCAL O DESDE UN STRING
    // COMO EL CONTEXTO SÓLO ES NECESARIO A LA HORA DE ACCEDER AL ASSET, LA CLASE SE HA
    // DISEÑADO ASUMIENDO QUE SI SE PROPORCIONA UN CONTEXTO ES PORQUE EL ORIGEN DE DATOS
    // ES UN FICHERO ALMACENADO COMO ASSET EN LA APP
    //
    public HashDivisas obtenerDivisas() {
        if (ctx!=null) return obtenerDivisas_desdeAsset(ctx, origenDatos);
        else return obtenerDivisas_desdeString(origenDatos);
    }
    //
    // ESTE ES EL MÉTODO QUE OBTIENE LOS DATOS DESDE UN FICHERO ALMACENADO COMO ASSET
    //
     public HashDivisas obtenerDivisas_desdeAsset(Context ctx, String fileName) {
        try {
            InputStream is = ctx.getAssets().open(fileName);
            return procesaXML(is);
        } catch (IOException e) {
            Log.d("[_desdeAsset]", e.toString());
            return null;
        }
    }
    //
    // ESTE MÉTODO OBTIENE EL HASH DE DIVISAS DESDE UN STRING CON FORMAO XML
    //
     public HashDivisas obtenerDivisas_desdeString(String str) {
        InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
        return procesaXML(is);
    }

    //
    // MÉTODO RESPONSABLE DEL PROCESAMIENTO DEL XML CON EL FORMATO QUE PROPORCIONA EL BCE
    //
    HashDivisas procesaXML(InputStream is) {

        if (is != null) {
            XmlPullParserFactory parserFactory;
            try {
                parserFactory = XmlPullParserFactory.newInstance();
                XmlPullParser parser = parserFactory.newPullParser();

                parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
                parser.setInput(is, null);
                Log.d("[XMLParsing]:", " Processing parsing");

                return procesa(parser); //PROCESAMIENTO DEL CONTENIDO DEL XML

            } catch (XmlPullParserException e) {

                Log.d("[procesaXML:Ex]", e.toString());

            } catch (IOException e) {

                Log.d("[procesaXML:Ex]", e.toString());

            } finally {
            }
        }

        return null;
    }
    //
    // MÉTODO RESPONSABLE DEL PROCESAMIENTO DEL CONTENIDO DEL XML
    //

    protected HashDivisas procesa(XmlPullParser parser) throws IOException, XmlPullParserException {

        HashDivisas divisas = new HashDivisas();
        divisas.anyadeDivisa(new Divisa("EUR", 1.0));

        int eventType = parser.getEventType();

        while (eventType != XmlPullParser.END_DOCUMENT) {
            String eltName = null;
            switch (eventType) {
                case XmlPullParser.START_TAG:
                    eltName = parser.getName();
                    Log.d("[XMLParsing]:", " Current element " + eltName + "");
                    if ("Cube".equals(eltName)) {
                        String currencyName = parser.getAttributeValue(null, "currency"); //MONEDA IDENTIFICADA
                        String currencyRate = parser.getAttributeValue(null, "rate"); //RECUPERAMOS LA TASA DE CAMBIO
                        if ((currencyName != null) && (currencyRate != null)) {
                            Log.d("[XMLParsing]:", " Attributes [" + currencyName + "," + currencyRate + "]");
                            divisas.anyadeDivisa(new Divisa(currencyName, Double.valueOf(currencyRate).doubleValue())); //EN CUANTO TENEMOS MONEDA Y CAMBIO GENERAMOS UNA DIVISA
                        }
                    }
                    break;
            }

            eventType = parser.next();
        }
        return divisas;
    }

}