package com.example.jcruizg.comunicacioneshttp.Utilidad.Divisas;

import android.util.Log;

import java.util.HashMap;

/**********************************************************************************************************
 *
 ** Clase abstracta que nos permitirá definir una jerarquía de proveedores de divisas.
 *
 **********************************************************************************************************/
abstract public class ProveedorDeDivisas {

    //
    // PROVEE UN MÉTODO PARA PODER VISUALIZAR EL CONTENIDO DE UN HASH DE DIVISAS (CLASE HASHDIVISAS)
    //
    public void printDivisas(HashDivisas divisas){
        for (HashMap.Entry<String, Divisa> entry : divisas.dameHash().entrySet()) {
            Divisa d = entry.getValue();
            Log.d("[printDivisas]:", "Divisa = " + d.getNombre() + ", Cambio = " + d.getCambio().getValor());
        }
    }
    //
    // MÉTODO ABSTRACTO QUE TODO PROVEEDOR DE DIVISAS DEBE OFRECER
    //
    abstract public HashDivisas obtenerDivisas();
}
