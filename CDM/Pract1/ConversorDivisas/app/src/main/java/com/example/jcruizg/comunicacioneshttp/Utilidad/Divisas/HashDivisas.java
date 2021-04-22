package com.example.jcruizg.comunicacioneshttp.Utilidad.Divisas;

import java.io.Serializable;
import java.util.HashMap;
/**********************************************************************************************************
 *
 ** EN LUGAR DE TRABAJAR CON DIVISAS TRABAJAREMOS CON UN HASH DE DIVISAS, YA QUE ESTO NOS FACILITARÁ EL
 *  OBTENER LA TASA DE CAMBIO ASOCIADA A UNA DIVISA A PARTIR DEL NOMBRE DE LA MISMA, QUE SERÁ LO QUE LA
 *  INFORMACIÓN CON LA QUE TRABAJARÁ LA APP.
 *
 **********************************************************************************************************/
 public class HashDivisas implements Serializable {
     public HashMap<String, Divisa> getHash() {
         return hash;
     }

     public void setHash(HashMap<String, Divisa> hash) {
         this.hash = hash;
     }

     private HashMap<String, Divisa> hash;

    public HashDivisas() {
        hash = new HashMap<String, Divisa>();
    }

    public Divisa dameDivisa(String key){
        return hash.get(key);
    }

    public void anyadeDivisa(Divisa d){
        hash.put(d.getNombre(),d);
    }

    public void eliminaDivisa(Divisa d){
        hash.remove(d.getNombre());
    }

    public HashMap<String, Divisa> dameHash(){
        return hash;
    }
}
