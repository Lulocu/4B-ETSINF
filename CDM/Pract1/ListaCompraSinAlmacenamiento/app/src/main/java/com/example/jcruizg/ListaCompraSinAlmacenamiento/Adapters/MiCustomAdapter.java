package com.example.jcruizg.ListaCompraSinAlmacenamiento.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jcruizg.ListaCompraSinAlmacenamiento.R;
import com.example.jcruizg.ListaCompraSinAlmacenamiento.Utilidad.Compras.Compra;
import com.example.jcruizg.ListaCompraSinAlmacenamiento.Utilidad.Compras.Producto;

import java.util.ArrayList;

/********************************************************************
 *
 *** ADAPTER PERSONALIZADO YA UTILIZADO EN LOS EJEMPLOS DE LISTVIEW
 *
 ********************************************************************/
public class MiCustomAdapter extends BaseAdapter {

    // Declare Variables
    Context context = null;

    //
    // TODO ADAPTER DEBE GESTIONAR EL CONJUNTO DE DATOS QUE VA A AYUDAR A MOSTRAR, LA LISTA DE LA COMPRA EN NUESTRO CASO
    //
    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    Compra compra = null;

    public MiCustomAdapter(Context context, ArrayList<Producto> productos) {
        this.context = context;
        compra.setListaDeProductos(productos);
    }


    public MiCustomAdapter(Context context, Compra c) {
        this.context = context;
        this.compra = c;
    }

    /**********************************************************
     *
     *** MÉTODOS A SOBREESCRIBIR EN TODO ADAPTER
     *
     ***********************************************************/
    @Override
    public int getCount() {
        return compra.getListaDeProductos().size();
    }

    @Override
    public Object getItem(int position) {
        return compra.getListaDeProductos().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    //
    // GETVIEW GESTIONA LA CREACIÓN DE LOS ELEMENTOS QUE MOSTRARÁ EL LISTVIEW
    //
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.lista_compra_item, null); // INFLADO DEL LAYOUT
        }

        //
        // OBTENCIÓN DE LAS REFERENCIAS A LOS VIEWS CONTENIDOS EN EL LAYOUT QUE SIRVE PARA MOSTRAR CADA PRODUCTO (ELEMENTO DEL LISTVIEW)
        //
        Producto producto = compra.getListaDeProductos().get(position);
        TextView tvProducto = (TextView) view.findViewById(R.id.tv_producto);
        TextView tvLugarDeCompra = (TextView) view.findViewById(R.id.tv_lugarCompra);
        ImageView ivNecesidad = (ImageView) view.findViewById(R.id.iv_necesidad);
        TextView tvNecesidad = (TextView) view.findViewById(R.id.tv_necesidad);

        //
        // ACTUALIZACIÓN DE LOS VALORES A MOSTRAR PARA CADA PRODUCTO TENIENDO EN CUENTA LOS CONTENIDOS EN EL PRODUCTO
        // QUE ALMACENA EN LA LISTA DE LA COMPRA QUE GESTIONA EL ADAPTER
        //
        tvProducto.setText(producto.getNombre());
        tvLugarDeCompra.setText(producto.getLugarDeCompra());
        int necesidad = producto.getNecesidad();
        ivNecesidad.setImageResource(necesidad);
        String msgNecesidad="Desconocida";
        switch(necesidad){
            case R.drawable.muy_necesario:
                msgNecesidad="Muy necesario";
                break;
            case R.drawable.necesario:
                msgNecesidad="Necesario";
                break;
            case R.drawable.poco_necesario:
                msgNecesidad="Poco necesario";
                break;
            case R.drawable.nada_necesario:
                msgNecesidad="Nada necesario";
                break;
            default:
                break;
        }
        tvNecesidad.setText(msgNecesidad);
        return view;
    }

}

