package com.example.jcruizg.comunicacioneshttp.Utilidad.Divisas;

/* As returned by request https://api.exchangeratesapi.io/latest */
/*{"date":"2018-10-18","rates":{"BGN":1.9558,"CAD":1.5009,"BRL":4.2453,"HUF":322.42,"DKK":7.4606,"JPY":129.44,"ILS":4.2009,"TRY":6.419,"RON":4.6683,"GBP":0.87843,"PHP":62.137,"HRK":7.421,"NOK":9.4598,"USD":1.1505,"MXN":21.8143,"AUD":1.6119,"IDR":17480.12,"KRW":1306.55,"HKD":9.0192,"ZAR":16.4104,"ISK":136.8,"CZK":25.863,"THB":37.512,"MYR":4.7821,"NZD":1.7522,"PLN":4.2989,"SEK":10.333,"RUB":75.505,"CNY":7.9835,"SGD":1.5863,"CHF":1.1451,"INR":84.685},"base":"EUR"}*/


/**********************************************************************************************************
 *
 ** ESTE PROVEEDOR DE DIVISAS NO LAS OBTINENE DE NINGUNA FUENTE EXTERNA, LAS GENERA ÉL PARTIENDO A TRAVÉS
 *  ESTÁTICAMENTE MÉTODO obtenerDivisas
 *
 **********************************************************************************************************/
public class ProveedorDeDivisasFake extends ProveedorDeDivisas {
    //
    // EL MÉTODO PROPORCIONA UN CONJUNTO ESTÁTICO DE DIVISAS (para hacer pruebas)
    //
    public HashDivisas obtenerDivisas(){
        HashDivisas divisas = new HashDivisas();
        divisas.anyadeDivisa(new Divisa("EUR", 1.0));
        divisas.anyadeDivisa(new Divisa("USD",1.1505));
        divisas.anyadeDivisa(new Divisa("JPY", 129.44));
        return divisas;
    }

}
