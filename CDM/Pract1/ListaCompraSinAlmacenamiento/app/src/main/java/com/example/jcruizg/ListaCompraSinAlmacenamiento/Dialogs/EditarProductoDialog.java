package com.example.jcruizg.ListaCompraSinAlmacenamiento.Dialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

import com.example.jcruizg.ListaCompraSinAlmacenamiento.Adapters.MiCustomAdapter;
import com.example.jcruizg.ListaCompraSinAlmacenamiento.R;
import com.example.jcruizg.ListaCompraSinAlmacenamiento.Utilidad.Compras.Compra;
import com.example.jcruizg.ListaCompraSinAlmacenamiento.Utilidad.Compras.Producto;

import java.util.Arrays;
import java.util.List;

/************************************************************************************************
 *
 *** DIALOG PERSONALIZADO QUE YA FUÉ UTILIZADO EN LOS EJEMPLOS CENTRADOS EN COMPONENTES VISUALES.
 *   EN NUESTRO CASO, EL EDITARPRODUCTODIALOG ESTÁ DISEÑADO PARA PERMITIR QUE EL USUARIO INTRODUZCA
 *   LA INFORMACIÓN NECESARIA PARA CREAR UN PRODUCTO, ES DECIR, SU NOMBRE, LUGAR Y URGENCIA DE COMPRA.
 *
 ************************************************************************************************/

public class EditarProductoDialog extends Dialog implements View.OnClickListener {

    public Context c;
    public MiCustomAdapter adapter;
    public Button btnSi, btnNo;
    public int posicion;

    public EditarProductoDialog(Context ctx, MiCustomAdapter a, int p) {
        super(ctx);
        // TODO Auto-generated constructor stub
        this.c = ctx;
        this.adapter = a; //AL INSTANCIAR EL DIALOG SOLICITAMOS UNA REFERENCIA AL ADAPTER QUE CONTIENE LOS DATOS A PROCESAR
        this.posicion = p; //DE TODOS LOS PRODUCTOS DE LA LISTA NOS INTERESARÁ SÓLO EL QUE NOS MARCA EL PARÁMETRO P
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.anyadir_producto);
        btnSi = (Button) findViewById(R.id.btn_SI);
        btnNo = (Button) findViewById(R.id.btn_NO);
        btnSi.setOnClickListener(this); // LA CLASE IMPLEMENTA EL METODO ONCLICK QUE PROCESARÁ LA PULSACIÓN EN EL BOTÓN
        btnNo.setOnClickListener(this); // LA CLASE IMPLEMENTA EL METODO ONCLICK QUE PROCESARÁ LA PULSACIÓN EN EL BOTÓN


        EditText nombreProducto = findViewById(R.id.et_nombreProducto);
        Spinner spLugar = findViewById(R.id.sp_lugarCompra);
        RadioGroup rgNecesidad = findViewById(R.id.rg_necesidad);

        Producto producto = adapter.getCompra().getListaDeProductos().get(posicion); //OBTENCIÓN DEL PRODUCTO A EDITAR

        nombreProducto.setText(producto.getNombre());
        List<String> lugaresCompra = Arrays.asList(c.getResources().getStringArray(R.array.lugares_compra)); //LEEMOS LOS LUGARES DE COMPRA DEL ARRAY lugares_compra
        for (int i=0; i< lugaresCompra.size(); i++) {
            if (lugaresCompra.get(i).equals(producto.getLugarDeCompra())){
                spLugar.setSelection(i); //PASAMOS LOS DISTINTOS LUGARES DE COMPRA AL SPINNER QUE LOS MOSTRARÁ
                break;
            }
        }
        //
        // ACTUALIZAMOS EL NIVEL DE NECESIDAD ACTUAL DEL PRODUCTO POR SI EL USUARIO LA DESEARA MODIFICAR
        //
        switch(producto.getNecesidad()){
            case R.drawable.necesario:
                rgNecesidad.check(R.id.rb_necesario);
                break;
            case R.drawable.poco_necesario:
                rgNecesidad.check(R.id.rb_pocoNecesario);

                break;
            case R.drawable.nada_necesario:
                rgNecesidad.check(R.id.rb_nadaNecesario);

                break;
            case R.drawable.muy_necesario:
            default:
                rgNecesidad.check(R.id.rb_muyNecesario);
                break;
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_SI: //EL USUARIO VALIDA LA PETICIÓN DE EDICIÓN
                Compra c = adapter.getCompra();
                EditText nombreProducto = findViewById(R.id.et_nombreProducto);
                Spinner spLugar = findViewById(R.id.sp_lugarCompra);
                RadioGroup rgNecesidad = findViewById(R.id.rg_necesidad);

                String nombre = nombreProducto.getText().toString();
                String lugar = spLugar.getSelectedItem().toString();
                int necesidad;
                switch (rgNecesidad.getCheckedRadioButtonId()) {
                    case R.id.rb_necesario:
                        necesidad = R.drawable.necesario;
                        break;
                    case R.id.rb_pocoNecesario:
                        necesidad = R.drawable.poco_necesario;
                        break;
                    case R.id.rb_nadaNecesario:
                        necesidad = R.drawable.nada_necesario;
                        break;
                    case R.id.rb_muyNecesario:
                    default:
                        necesidad = R.drawable.muy_necesario;
                        break;
                }
                c.getListaDeProductos().set(posicion, new Producto(nombre, lugar, necesidad)); //REEMPLAZAMOS EL ELEMENTO EN LA POSICIÓN POR EL NUEVO PRODUCTO
                adapter.notifyDataSetChanged(); // NOTIFICAMOS AL ADAPTER EL CAMBIO PARA QUE ACTUALICE LA VISTA DEL LISTVIEW
                break;
            case R.id.btn_NO: // EL USUARIO CANCELA LA PETICIÓN DE EDICIÓN
                dismiss();
                break;
            default:
                break;
        }
        dismiss();
    }
}
