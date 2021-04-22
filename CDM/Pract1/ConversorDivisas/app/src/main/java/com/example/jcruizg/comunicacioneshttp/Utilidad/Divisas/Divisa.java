package com.example.jcruizg.comunicacioneshttp.Utilidad.Divisas;

import java.io.Serializable;

/**********************************************************************************************************
 *
 ** LA DIVISA SE DEFINE A TRAVÉS DE UN NOMBRE Y UN CAMBIO DE LA MISMA CON RESPECTO AL EURO. ESTA ES LA
 *  INFORMACIÓN QUE SUMINISTRA EL BANCO CENTRAL EUROPEO (BCE).
 *
 **********************************************************************************************************/
public class Divisa implements Serializable {
    private Cambio cambio = null;
    private String nombre = null;

    //
    // EL CAMBIO ES A SU VEZ UNA CLASE QUE NOS OFRECE EL MÉTODO CONVIERTE, PARA CONVERTIR UN MONTANTE
    // EN OTRO EQUIVALENTE APLICANDO EL CAMBIO QUE SE SUMINISTRE
    //
    public class Cambio {
        //
        // La clase cambio está diseñada para que todos los cambios tomo como referencia
        // la misma moneda, en nuestro caso el EURO
        //
        private double valor = 1.0;

        public Cambio(double d){
            setValor(d);
        }
        public Cambio(){
            setValor(1.0);
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double rate) {
            this.valor = rate;
        }
        //
        // METODO DE CONVERSIÓN DEL VALOR SUMINISTRADO APLICANDO A VALOR EL CAMBIO SUMINISTRADO Y
        // TENIENDO EN CUENTA EL CAMBIO ACTUAL.
        // NOTA: TODOS LOS CAMBIOS SE EXPRESAN CON RESPECTO AL EURO
        //
        public double convierte(double valor, Cambio other){
            return ((valor*other.getValor())/this.getValor());
        }

    }

    public Divisa(){
        cambio = null;
        nombre = null;
    }

    public Divisa(String n, double c){
        cambio = new Cambio(c);
        nombre = n;
    }

    public boolean esUtilizable(){
        return ((cambio!=null)&&(nombre!=null));
    }

    public String getNombre(){
        return nombre;
    }

    public void setCambio(double c){
        cambio = new Cambio(c);
    }

    public void setNombre(String n){
        nombre = n;
    }

    public void actualizaDivisa(String n, double c){
        cambio = new Cambio(c);
        nombre = n;
    }

    public Cambio getCambio(){
        return cambio;
    }

    //
    // EL METODO DE CONVERSIÓN DE LA CLASE Divisa PERMITE CONVERTIR UN VALOR DE UNA DIVISA A OTRA.
    // EN LA PRÁCTICA, LA CONVERSIÓN ES UNA CUESTIÓN DE CONVERSIÓN APLICANDO LOS CAMBIOS EXISTENTES
    // POR TANTO, LA CONVERSIÓN ACABA DELEGÁNDOSE EN LA CLASE CAMBIO
    //
    public double convierte(double valor, Divisa otra){
        return cambio.convierte(valor, otra.getCambio());
    }

}
