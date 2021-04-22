package com.example.jcruizg.ListaCompraSinAlmacenamiento.Activities.ListView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jcruizg.ListaCompraSinAlmacenamiento.Adapters.MiCustomAdapterConViewHolder;
import com.example.jcruizg.ListaCompraSinAlmacenamiento.Dialogs.EditarProductoDialog;
import com.example.jcruizg.ListaCompraSinAlmacenamiento.R;
import com.example.jcruizg.ListaCompraSinAlmacenamiento.Utilidad.Compras.Compra;
import com.example.jcruizg.ListaCompraSinAlmacenamiento.Utilidad.Compras.Producto;

/*************************************************************************************
 *
 ** ESTA ACTIVIDAD HACE LO MISMO QUE HACE LVconCustomAdapterActivity, PERO CON LA GRAN
 *  DIFERENCIA DE OFRECER UN MENU AL USUARIO CON TRES OPCIONES: BORRAR TODA LA LISTA,
 *  AÑADIR UN PRODUCTO O RECARGAR LA LISTA CON LA LISTA ORIGINAL QUE APARECE AL ARRANCAR
 *  LA APP.
 *  ADEMÁS MOSTRAMOS CÓMO UTILIZAR LOS DIALOGOS EN LAS APPS.
 *  FINALMENTE RECOMENDAMOS EXAMINAR EL CÓDIGO DE MiCustomAdapterConViewHolder QUE
 *  SOPORTA EL PATRÓN HOLDER PARA LA GESTIÓN DE LOS VIEWS ASOCIADOS A CADA UNO DE LOS
 *  ELEMENTOS DE LA LISTA. EL USO DE ESTE PATRÓN OPTIMIZA MUCHÍSIMO LA EJECUCIÓN DEL
 *  REFRESCO DE UNA LISTA, YA QUE ACELERA EN VARIOS ÓRDENES DE MAGNITUD EL PROCESAMIENTO DE
 *  LOS DISTINTOS VIES DE CADA ELEMENTO DE LA LISTA.

 */
public class LVConMenusActivity extends AppCompatActivity {
    protected MiCustomAdapterConViewHolder adapter = null;
    protected int posicion = -1;

    final int ANYADIR_PRODUCTO_REQUEST = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list_view);
        TextView tv = findViewById(R.id.tv_description);
        String msgDescriptivo = "Se incluye un Menu con 3 iconos (borrar todo, añadir producto y recargar lista original)." +
                "La pulsación larga permite ahora editar o borrar el producto seleccionado.";
        tv.setText(msgDescriptivo);
        ListView lv = findViewById(R.id.lv_simpleLV);
        adapter = new MiCustomAdapterConViewHolder(this, creaCompraFalsa()); // CREAMOS ARTIFICALMENTE UNA LISTA DE LA COMPRA
        lv.setAdapter(adapter);

        //
        // AHORA CUANDO EL USUARIO REALICE UNA PULSACIÓN LARGA SOBRE UN ITEM LE DAREMOS LA OPCIÓN DE EDITARLO O BORRARLO
        // ESO LO HAREMOS UTILIZANDO UN AlertDialog
        //
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {

                posicion = i;
                AlertDialog.Builder builder = new AlertDialog.Builder(LVConMenusActivity.this);
                builder.setTitle(R.string.msg_editarBorrar);
                AlertDialog dialog;

                String[] accion = {"Editar", "Borrar"}; //ACCIONES QUE OFRECEMOS AL USUARIO
                //SÓLO PERMITIMOS QUE SE ELIJA UNA DE LAS DOS OPCIONES
                builder.setSingleChoiceItems(accion, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) { //EL -1 SIGNIFICA QUE NINGUNA ACCIÓN APARECERÁ COMO SELECCIONADA POR DEFECTO
                        switch(which){
                            case 0:
                                //Editar producto
                                editarProducto(posicion);
                                dialog.dismiss(); //TRAS TRATAR LA PULSACIÓN CERRAMOS EL DIALOG
                                break;
                            case 1:
                                //Borrar producto
                                borrarProducto(posicion);
                                dialog.dismiss(); //TRAS TRATAR LA PULSACIÓN CERRAMOS EL DIALOG
                                break;
                        }
                    }
                });
                builder.setNegativeButton("Cancelar", null); //EN CASO DE CANCELAR (ÚNICO BOTÓN MOSTRADO) NO HACER NADA (POR ESO LE PASAMOS UN NULL)
                dialog = builder.create(); //CREAMOS EL DIALOG
                dialog.show(); //MOSTRAMOS EL DIALOG
                return true;
            }
        });

    }
    //
    // BORRADO COMPLETO DE LA LISTA DE LA COMPRA
    //
    public void borrarListaCompra(){
        adapter.getCompra().getListaDeProductos().clear();
        adapter.notifyDataSetChanged();
    }

    //
    // RECARGA DE LA LISTA DE LA COMPRA A SU VALOR ORIGINAL (LISTA DE LA COMPRA REALIZADA ARTIFICIALMENTE)
    //
    public void recargaListaConCompraFake() {
        adapter.getCompra().getListaDeProductos().clear();
        adapter.setCompra(creaCompraFalsa());
        adapter.notifyDataSetChanged();
    }
    //
    // EDITAR UN PRODUCTO
    //
    public void editarProducto(int i) {
        //EN ESTE CASO SE EDITA UN PRODUCTO UTILIZANDO UN DIALOG PERSONALIZADO LLAMADO EditarProductoDialog
        EditarProductoDialog apd=new EditarProductoDialog(this, adapter, i);
        apd.show();
    }

    //
    // BORRADO DE UN PRODUCTO
    //
    public void borrarProducto(int i) {
        //Producto a eliminar
        TextView tvProducto = (TextView) findViewById(R.id.tv_producto);
        final Producto p = (Producto) adapter.getItem(i);
        //
        // Diálogo para confirmar el borrado
        //
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(android.R.drawable.stat_sys_warning);
        //
        // EL MESAJE DE BORRADO TIENE UN PARÁMETRO QUE ES EL NOMBRE DEL PRODUCTO, DE AHÍ QUE EN EL STRING
        // APAREZCA EL %1s
        //
        String msgBorrado = String.format(getResources().getString(R.string.msg_borrado), p.getNombre());

        builder.setTitle(R.string.etiq_borrado);
        builder.setMessage(msgBorrado);
        builder.setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // SI EL USUARIO NO CONFIRMA, ENTONCES NO HACEMOS NADA (PODÍAMOS TAMBIÉN HABER PASADO UN NULL
                // EN LUGAR DE GENERAR EL LISTENER CON ESTE MÉTODO
            }
        });
        builder.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //
                // SI EL USUARIO DESEA ELIMINAR EL ELEMENTO, ENTONCES PROCEDEMOS
                //
                String toastMsg = "El producto [" + p.getNombre() + "] ha sido eliminado de su lista de la compra";
                adapter.getCompra().eliminaProducto(p); //ELIMINACIÓN DEL PRODUCTO
                adapter.notifyDataSetChanged(); //NOTIFICACIÓN AL ADAPTER DEL CAMBIO DE DATOS EN LA LISTA DE LA COMPRA
                Toast.makeText(getApplicationContext(), toastMsg, Toast.LENGTH_SHORT).show(); //FEEDBACK AL USUARIO
            }
        });
        //
        // Mostrar Diálogo
        //
        builder.create().show();
    }

    //
    // GESTIÓN DE LAS OPCIONES DEL MENU
    //
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_lista_compra, menu); //MOSTRAR EL MENU
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //
        // REACCIONAR A LAS DISTINTAS OPCIONES QUE EL MENU OFRECE
        //
        switch (item.getItemId()){
            case android.R.id.home: //SI SE PULSA HOME
                return super.onOptionsItemSelected(item); //QUE EL SISTEMA LO GESTIONE
            case R.id.menu_anyadir: //AÑADIR ELEMENTO
                Intent i = new Intent(this, AnyadirProductoActivity.class);
                //
                // LANZAMOS LA ACTIVIDAD QUE SERVIRÁ LA PETICIÓN INDICANDO QUE ESPERAMOS DE LA MISMA
                // UN RESULTAD (EL NUEVO PRODUCTO A INTRODUCIR EN LA LISTA DE LA COMPRA EN NUESTRO CASO)
                // EL MÉTODO DE CALLBACK EN ESTE CASO SERÁ onActivityResult (VER MÁS ABAJO)
                //
                startActivityForResult(i,ANYADIR_PRODUCTO_REQUEST);
                break;
            case R.id.menu_borrar:
                borrarListaCompra(); //BORRAR TODA LA LISTA DE LA COMPRA
                break;
            case R.id.menu_restaurar:
                recargaListaConCompraFake(); //GENERAR DE NUEVO LA LISTA DE LA COMPRA INICIAL
                break;
            default:
                return super.onOptionsItemSelected(item); // POR SI ALGO SE NOS PASA QUE EL SISTEMA LO GESTIONE
        }
        return true;
    }


    //
    // MÉTODO QUE IMPLEMENTA EL CALLBACK RESULTANTE DE LA LLAMADA startActivityForResult(i,ANYADIR_PRODUCTO_REQUEST);
    //
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode!=RESULT_CANCELED){ //SI EL USUARIO NO CANCELÓ LA ACCIÓN
            switch(requestCode){
                case ANYADIR_PRODUCTO_REQUEST: //Y LA PETICIÓN ES LA DE AÑADIR UN PRODUCTO
                    Producto p = (Producto)data.getSerializableExtra("Producto"); //EXTRAEMOS EL PRODUCTO DEL INTENT
                    adapter.getCompra().anyadeProducto(p); // LO AÑADIMOS A LA LISTA
                    adapter.notifyDataSetChanged(); //NOTIFICAMOS EL CAMBIO AL ADAPTER
                    break;
            }
        }

    }
    //
    // MÉTODO DE CREACIÓN DE UNA LISTA FALSA, ES DECIR, UNA LISTA ARTIFICIALMENTE GENERADA PARA QUE TENGAMOS ALGO CON LO QUE
    // PROBAR LA APLICACIÓN SIN NECESIDAD DE INTRODUCIR VARIOS PRODUCTOS MANUALMENTE
    //
    private Compra creaCompraFalsa(){
        Compra compra = new Compra();
        compra.anyadeProducto("Judías", "Carrefour", R.drawable.necesario);
        compra.anyadeProducto("Arroz", "Mercadona", R.drawable.necesario);
        compra.anyadeProducto("Chorizos", "Consum", R.drawable.muy_necesario);
        compra.anyadeProducto("Leche", "Carrefour", R.drawable.poco_necesario);
        compra.anyadeProducto("Naranjas", "Carrefour", R.drawable.necesario);
        compra.anyadeProducto("Gambas y mejillones", "Mercadona", R.drawable.poco_necesario);
        compra.anyadeProducto("Chuletón", "Consum", R.drawable.nada_necesario);
        compra.anyadeProducto("Naranjas", "Carrefour", R.drawable.muy_necesario);
        compra.anyadeProducto("Nocilla", "Consum", R.drawable.poco_necesario);
        compra.anyadeProducto("Morcillas", "Mercadona", R.drawable.muy_necesario);
        compra.anyadeProducto("Cacao en polvo", "Consum", R.drawable.nada_necesario);
        compra.anyadeProducto("Agua embotellada", "Carrefour", R.drawable.poco_necesario);
        return compra;

    }
}
