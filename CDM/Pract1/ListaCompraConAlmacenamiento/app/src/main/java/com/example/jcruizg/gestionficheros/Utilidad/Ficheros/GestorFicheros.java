package com.example.jcruizg.gestionficheros.Utilidad.Ficheros;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/************************************************************************************************
 *
 *** CLASE DE UTILIDAD EN LA QUE DERIVAREMOS EL PROCESAMIENTO DE TODAS LAS
 *   OPERACIONES DE LECTURA Y ESCRITURA SOBRE FICHEROS
 *
 ************************************************************************************************/
public class GestorFicheros {

    static String TAG_WRITE_READ_FILE="[WRITE_READ_FILE]";

    //
    // LECTURA DE DATOS. LA PROCEDENCIA DE LOS MISMOS ES TRANSPARENTE A ESTA CLASE DE UTILIDAD.
    // LO QUE SE RECIBE ES UN OBJETO DE TIPO FILE QUE DEBE REPRESENTAR EL FICHERO A PROCESAR
    //

    static public String leerDatos(File file) {
        StringBuffer retBuf = new StringBuffer();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            retBuf.append(leerDatos(fileInputStream));
        } catch (IOException ex) {
            Log.e(TAG_WRITE_READ_FILE, ex.getMessage(), ex);
        } finally {
            return retBuf.toString();
        }
    }

    static public String leerDatos(FileInputStream fileInputStream)
    {
        StringBuffer retBuf = new StringBuffer();

        try {
            if (fileInputStream != null) {
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                String lineData = bufferedReader.readLine();
                while (lineData != null) {
                    retBuf.append(lineData);
                    lineData = bufferedReader.readLine();
                }
            }
        }catch(IOException ex) {
            Log.e(TAG_WRITE_READ_FILE, ex.getMessage(), ex);
        }finally
        {
            return retBuf.toString();
        }
    }

    //
    // ESCRITURA DE DATOS. SE SUMINISTRAN LOS DATOS A ESCRIBIR Y UN OBJETO DE TIPO FILE QUE DEBE
    // HABER SIDO YA INICIALIZADA PARA APUNTAR AL FICHERO EN EL QUE SE DESEA ESCRIBIR
    //
    static public void escribirDatos(File file, String datos)
    {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            escribirDatos(fileOutputStream, datos);
            fileOutputStream.close();
        }catch(FileNotFoundException ex) {
            Log.e(TAG_WRITE_READ_FILE, ex.getMessage(), ex);
        }catch(IOException ex) {
            Log.e(TAG_WRITE_READ_FILE, ex.getMessage(), ex);
        }
    }

    static public void escribirDatos(FileOutputStream fileOutputStream, String data)
    {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            bufferedWriter.write(data);

            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
        }catch(FileNotFoundException ex) {
            Log.e(TAG_WRITE_READ_FILE, ex.getMessage(), ex);
        }catch(IOException ex) {
            Log.e(TAG_WRITE_READ_FILE, ex.getMessage(), ex);
        }
    }
}
