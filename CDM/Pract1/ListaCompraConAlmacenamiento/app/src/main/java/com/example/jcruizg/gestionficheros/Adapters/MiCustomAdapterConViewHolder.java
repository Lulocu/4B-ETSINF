package com.example.jcruizg.gestionficheros.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jcruizg.gestionficheros.R;
import com.example.jcruizg.gestionficheros.Utilidad.Compras.Compra;
import com.example.jcruizg.gestionficheros.Utilidad.Compras.Producto;

import java.util.ArrayList;

/*******************************************************************************************
 *
 *** ESTA CLASE ESPECIALIZA MICUSTOMADAPTER PARA QUE UTILIZA UN VIEWHOLDER
 *   EL USO DE HOLDERS ES RECOMENDADO POR GOOGLE PARA OPTIMIZAR LOS ACCESOS A LAS LISTVIEW
 *
 ********************************************************************************************/
public class MiCustomAdapterConViewHolder extends MiCustomAdapter {

    //
    // UN VIEWHOLDER NO ES OTRA COSA QUE UNA CLASE CAPAZ DE CONTENER UNA REFERENCIA A TODOS LOS VIEWS
    // NECESARIOS PARA MOSTRAR UN ELEMENTO DE LA LISTA, UN PRODUCTO EN NUESTRO CASO
    //
    private class Contenedor{
        TextView tvProducto;
        TextView tvLugarDeCompra;
        ImageView ivNecesidad;
        TextView tvNecesidad;
    }

    public MiCustomAdapterConViewHolder(Context context, ArrayList<Producto> productos) {
        super(context,productos);
    }


    public MiCustomAdapterConViewHolder(Context context, Compra c) {
        super(context,c);
    }

    //
    // SOBREESCRIBIMOS EL METODO GETVIEW PARA QUE, CONTRARIAMENTE A LO QUE HACE MICUSTOMADAPTER, AHORA SE UTILICE
    // EL VIEWHOLDER QUE SE HA DEFINIDO
    //
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        Contenedor contenedor = new Contenedor();
        Producto producto = compra.getListaDeProductos().get(position);

        //
        // EL SECRETO ESTÁ EN INSTANCIAR UN VIEWHOLDER (LLAMADO CONTENEDOR EN NUESTRO EJEMPLO) Y GUARDARLO COMO TAG DEL VIEW QUE
        // REPRESENTA A CADA ELEMENTO DE LA LISTA. ASÍ NO SERÁ NECESARIO HACER LAS LLAMADAS A FINDVIEWBYID CADA VEZ QUE EJECUTEMOS
        // EL MÉTODO GETVIEW (DE HECHO SÓLO SE HARÁN LA PRIMERA VEZ, CUANDO VIEW==NULL). ASÍ EL ACCESO A LOS VIEWS CONTENIDOS EN EL
        // VIEWHOLDER (CONTENEDOR EN NUESTRO EJEMPLO) SERÁ DIRECTO, CON LO QUE GANAREMOS MUCHO TIEMPO Y GLOBALMENTE ACELERAREMOS
        // MUCHO EL DIBUJADO DE LOS VIEWS EN LA LISTA. ESTA OPTIMIZACIÓN ES FUNDAMENTAL SI LA LISTA TIENE MUCHOS ELEMENTOS.
        //

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.lista_compra_item_2, null);
            contenedor.tvProducto = (TextView) view.findViewById(R.id.tv_producto);
            contenedor.tvLugarDeCompra = (TextView) view.findViewById(R.id.tv_lugarCompra);
            contenedor.ivNecesidad = (ImageView) view.findViewById(R.id.iv_necesidad);
            contenedor.tvNecesidad = (TextView) view.findViewById(R.id.tv_necesidad);
            view.setTag(contenedor);
        }

        contenedor = (Contenedor)view.getTag();
        contenedor.tvProducto.setText(producto.getNombre());
        contenedor.tvLugarDeCompra.setText(producto.getLugarDeCompra());
        int necesidad = producto.getNecesidad();
        contenedor.ivNecesidad.setImageResource(necesidad);
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
        contenedor.tvNecesidad.setText(msgNecesidad);
        return view;
    }

}

