package com.example.jcruizg.comunicacioneshttp.Utilidad.Divisas;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/**********************************************************************************************************
 *
 ** Esta clase está diseñada para proporcionar DIVISAS (su nombre y su cambio con respecto al euro).
 *  La divisas se recuperarán a través de un servicio que a tal efecto provee el Banco Central Europeo (BCE)
 *  Como el nombre de la clase indica la recuperación de la información ser realizará vía HTTP.
 *  La clase especializa al proveedor de divisas que trabaja con XML. Esto le permite utilizar los métodos
 *  de tratamiento de procesamiento de las divisas en XML que proporciona dicha clase.
 *
 **********************************************************************************************************/
public class ProveedorDeDivisasPorHTTPS extends ProveedorDeDivisasEnFormatoXML{
    //
    // ESTE MÉTODO SE CONECTA AL SERVIDOR DEL BANCO CENTRAL EUROPEO (BCE)
    // URL: https://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml?60634aa4076cc20682405e0785c50d27
    // OBTIENE UN FICHERO CON FORMATO XML QUE OFRECE LAS TASAS DE CONVERSION ENTRE LAS 32 DIVISAS INTERNATIONALES MÁS RELEVANTES Y EL EURO
    //
    @Override
     public HashDivisas obtenerDivisas() {

        return super.obtenerDivisas_desdeString(obtenerStringConDivisas()); //RETORNAMOS UN STRING CON TODA LA INFORMACIÓN RECIBIDA
    }

    public String obtenerStringConDivisas(){
        StringBuffer retBuf = new StringBuffer();

        try {
            URL url = new URL("https://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml?60634aa4076cc20682405e0785c50d27"); //CONECTAMOS CON EL SERVIDOR DEL BCE
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("GET"); //OBTENEMOS LAS DIVISAS MEDIANTE UNA PETICIÓN GET
            connection.setDoInput(true);

            InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            //
            // PROCESO DE LECTURA DEL XML CON LAS TASAS DE CAMBIO DE LAS DIVISAS
            //
            String lineaDatos = bufferedReader.readLine();
            while (lineaDatos != null) {
                retBuf.append(lineaDatos);
                lineaDatos = bufferedReader.readLine();
            }

            connection.disconnect(); //CERRAMOS LA CONEXIÓN

        }catch(IOException e) {
            e.printStackTrace();
        }finally{
            return retBuf.toString(); //RETORNAMOS UN STRING CON TODA LA INFORMACIÓN RECIBIDA
        }

    }

    //
    // REALIZAMOS LA MISMA OPERACIÓN, PERO UTILIZANDO VOLLEY EN ESTE CASO
    // EL MODELO DE PROGRAMACIÓN CAMBIA YA QUE LA PETICIÓN ES ASÍNCRONA. POR TANTO, LA ACTIVIDAD QUE REALIZARÁ LA PETICIÓN
    // DEBERÁ PROPORCIONAR UN RESPONSELISTENER Y UN ERRORLISTENER. EL PRIMERO RECIBIRÁ LA RESPUESTA DE LA PETICIÓN SI ÉSTA
    // FUNCIONA CORRECTAMENTE. EN CASO CONTRARIO, SE ACTIVARÁ EL ERRORLISTENER PARA NOTIFICAR EL PROBLEMA.
    //
     public void obtenerDivisas(RequestQueue requestQueue, Response.Listener<String> responseListener, Response.ErrorListener errorListener) {
        try {
            URL url = new URL("https://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml?60634aa4076cc20682405e0785c50d27");

            // Initialize a new StringRequest
            StringRequest stringRequest = new StringRequest(
                    Request.Method.GET,
                    url.toString(),
                    responseListener,
                    errorListener
            );

            // Add StringRequest to the RequestQueue
            requestQueue.add(stringRequest);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }


}
