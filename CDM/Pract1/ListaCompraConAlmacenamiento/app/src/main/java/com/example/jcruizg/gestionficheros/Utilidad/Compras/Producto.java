package com.example.jcruizg.gestionficheros.Utilidad.Compras;

import java.io.Serializable;

/************************************************************************************************
 *
 *** CLASE DE UTILIDAD PARA LA DEFINICIÓN DE PRODUCTO
 *
 ************************************************************************************************/

public class Producto implements Serializable {

    //
    // ATRIBUTOS DE UN PRODUCTO
    //
    private String nombre;
    private String lugarDeCompra;
    private int necesidad;

    public Producto(){
        nombre = null;
        lugarDeCompra = null;
        necesidad = -1;
    }

    public Producto(String nom, String lug, int nec){
        nombre = nom;
        lugarDeCompra = lug;
        necesidad = nec;
    }

    //
    // METODOS DE ACCESO A LOS ATRIBUTOS PRIVADOS DEL PRODUCTO
    //

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarDeCompra() {
        return lugarDeCompra;
    }

    public void setLugarDeCompra(String lugarDeCompra) {
        this.lugarDeCompra = lugarDeCompra;
    }

    public int getNecesidad() {
        return necesidad;
    }

    public void setNecesidad(int necesidad) {
        this.necesidad = necesidad;
    }


}
