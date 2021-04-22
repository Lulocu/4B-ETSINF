package com.example.jcruizg.gestionficheros.Utilidad.Compras;

import java.util.ArrayList;
import java.util.Iterator;

/************************************************************************************************
 *
 *** CLASE DE UTILIDAD PARA LA GESTIÓN DE UNA COMPRA
 *
 ************************************************************************************************/

public class Compra {

    private ArrayList<Producto> listaDeProductos = null; //LISTA DE PRODUCTOS INCLUIDOS EN LA COMPRA


    public Compra(){
        listaDeProductos = new ArrayList<Producto>();
    }

    public Compra(Compra c){
        this.setListaDeProductos(c.getListaDeProductos());
    }

    public ArrayList<Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(ArrayList<Producto> listaDeProductos) {
        this.listaDeProductos = new ArrayList<>(listaDeProductos);
    }

    //
    // AÑADER PRODUCTOS
    //
    public void anyadeProducto(Producto p){
        listaDeProductos.add(p);
    }

    public void anyadeProducto(String nombre, String lugar, int necesidad){
        anyadeProducto(new Producto(nombre, lugar, necesidad));
    }

    //
    // ELIMINACIÓN DE PRODUCTO
    //
    public void eliminaProducto(Producto toDelete) {
        eliminaProductoPorNombre(toDelete.getNombre());
    }

    public void eliminaProductoPorNombre(Producto toDelete) {
        eliminaProductoPorNombre(toDelete.getNombre());
    }

    public void eliminaProductoPorNombre(String nombre) {
        Iterator i = listaDeProductos.iterator();
        while (i.hasNext()) {
            if (((Producto)i.next()).getNombre().equals(nombre)) i.remove();
        }
    }

    public void eliminaProductoPorPosicion(int p) {
        getListaDeProductos().remove(p);
    }

    public void eliminaProductosPorLugar(String lugar) {
        Iterator i = listaDeProductos.iterator();
        while (i.hasNext()) {
            Producto p = (Producto)i.next();
            if (p.getLugarDeCompra().equals(lugar)) i.remove();
        }
    }
    public void eliminaProductosPorNivelDeNecesidad(int nivelDeNecesidad) {
        Iterator i = listaDeProductos.iterator();
        while (i.hasNext()) {
            Producto p = (Producto)i.next();
            if (p.getNecesidad()==nivelDeNecesidad) i.remove();
        }
    }

    //
    // COMPROBAR SI UN PRODUCTO YA EXISTE EN LA COMPRA EN CURSO
    //
    public boolean yaExiste(Producto p){
        return yaExiste(p.getNombre());
    }

    public boolean yaExiste(String p) {
        Iterator i = listaDeProductos.iterator();
        while (i.hasNext()) {
            if (((Producto)i.next()).getNombre().equals(p)) return true;
        }
        return false;
    }

    //
    // OBTENER LAS COMPRAS A REALIZAR EN UN LUGAR CONCRETO
    //
    public Compra compraPorLugar(String lugar){
        Compra subCompra = new Compra();

        Iterator i = listaDeProductos.iterator();
        while (i.hasNext()) {
            Producto p = (Producto)i.next();
            if (p.getLugarDeCompra().equals(lugar))
                subCompra.anyadeProducto(p.getNombre(),lugar, p.getNecesidad());
        }
        return subCompra;
    }

    //
    // OBTENER LAS COMPRAS A QUE HAY QUE REALIZAR EN BASE A UN NIVEL DE NECESIDAD CONCRETO
    //
    public Compra compraPorNivelDeNecesidad(int nivelDeNecesidad){
        Compra subCompra = new Compra();

        Iterator i = listaDeProductos.iterator();
        while (i.hasNext()) {
            Producto p = (Producto)i.next();
            if (p.getNecesidad()==nivelDeNecesidad)
                subCompra.anyadeProducto(p.getNombre(),p.getLugarDeCompra(), nivelDeNecesidad);
        }
        return subCompra;

    }
}
