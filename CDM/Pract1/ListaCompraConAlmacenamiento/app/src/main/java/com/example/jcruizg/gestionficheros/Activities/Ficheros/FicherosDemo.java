package com.example.jcruizg.gestionficheros.Activities.Ficheros;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jcruizg.gestionficheros.Adapters.MiCustomAdapterConViewHolder;
import com.example.jcruizg.gestionficheros.R;
import com.example.jcruizg.gestionficheros.Utilidad.Compras.Compra;
import com.example.jcruizg.gestionficheros.Dialogs.EditarProductoDialog;
import com.example.jcruizg.gestionficheros.Utilidad.Compras.Producto;
import com.example.jcruizg.gestionficheros.Utilidad.Ficheros.Formateado;
import com.example.jcruizg.gestionficheros.Utilidad.Ficheros.GestorFicheros;

import java.io.File;

/**************************************************************************************
 *
 *** ACTIVIDAD IMPLEMENTANDO ESTA DEMO DE FICHEROS
 *
 **************************************************************************************/

public class FicherosDemo extends AppCompatActivity {
    protected MiCustomAdapterConViewHolder adapter = null;
    protected int posicion = -1;

    final int ANYADIR_PRODUCTO_REQUEST = 10;
    final int CONFIGURAR_APP_REQUEST = 11;
    final int SOLICITAR_PERMISOS_ESCRITURA_EN_SD = 12;
    final int SOLICITAR_PERMISOS_LECTURA_EN_SD = 13;

    public enum Tipo_Memoria {Interna, SD};
    Tipo_Memoria memoriaElegida = Tipo_Memoria.Interna;
    int memoriaExtElegida = 0; //LA OPCIÓN SE CORRESPONDE CON: directorio público externo (CONSULTAR FICHEROS pantalla_configuracion.xml Y opciones_configuracion.xml)
    boolean restaurarLaCompra = true;

    String mensajePrincipal(){
        String msgDescriptivo = "Pulsación larga sobre elemento de la lista permite editar/borrar el producto seleccionado. " +
                "Puedes recuperar/guardar la lista de la compra en memoria interna/externa. \n"+
                "** Almacenando en: ";

        cargaPreferencias(); // CARGAMOS LAS PREFERENCIAS DEFINIDAS YA POR EL USUARIO EN EJECUCIONES ANTERIORES DE LA APP

        switch (memoriaElegida){
            case Interna:
                msgDescriptivo += " [MEM. INTERNA] **";
                break;
            case SD:
                msgDescriptivo += " [MEM. EXTERNA] **";
                break;

        }
        return msgDescriptivo;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list_view); //LAYOUT UTILIZADO
        //
        // PROPORCIONAR ALGO DE AYUDA INICIAL AL USUARIO MEDIANTE UN MENSAJE
        //
        TextView tv = findViewById(R.id.tv_description);
        tv.setText(this.mensajePrincipal());

        //
        // INSTANCIACION DEL ADAPTER PARA LA LISTA DE LA COMPRA
        //
        ListView lv = findViewById(R.id.lv_simpleLV);
        adapter = new MiCustomAdapterConViewHolder(this, new Compra());
        lv.setAdapter(adapter);

        //
        // GESTIÓN DE LA PULSACIÓN LARGA EN UN ELEMENTO DE LA LISTA PARA PERMITIR EL BORRADO O EDICIÓN DEL ELEMENTO SELECCIONADO
        //
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            /**********************************************************
             *
             *** GESTIÓN DE EDICIÓN Y BORRADO DE PRODUCTO EN LA LISTA
             *
             ***********************************************************/

            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {

                posicion = i;

                AlertDialog.Builder builder = new AlertDialog.Builder(FicherosDemo.this);
                builder.setTitle(R.string.msg_editarBorrar);
                AlertDialog dialog;

                String[] accion = {"Editar", "Borrar"};
                int itemElegido = 1; // editar
                builder.setSingleChoiceItems(accion, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case 0:
                                //Editar producto
                                editarProducto(posicion); // VER GESTIÓN DE (EDITAR/BORRAR) PRODUCTO
                                dialog.dismiss();
                                break;
                            case 1:
                                //Borrar producto
                                borrarProducto(posicion); // VER GESTIÓN DE (EDITAR/BORRAR) PRODUCTO
                                dialog.dismiss();
                                break;
                        }
                    }
                });
                builder.setNegativeButton("Cancelar", null);
                dialog = builder.create();
                dialog.show();
                return true;
            }
        });

        if (restaurarLaCompra) restauraCompra();

    }




    /**********************************************************
     *
     *** GESTIÓN DE (EDITAR/BORRAR) PRODUCTO
     *
     ***********************************************************/


    public void editarProducto(int i) {
        EditarProductoDialog apd = new EditarProductoDialog(this, adapter, i);
        apd.show();
    }

    public void borrarProducto(int i) {
        //Producto a eliminar
        TextView tvProducto = (TextView) findViewById(R.id.tv_producto);
        final Producto p = (Producto) adapter.getItem(i);
        //
        // Diálogo para confirmar el borrado
        //
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(android.R.drawable.stat_sys_warning);

        String msgBorrado = String.format(getResources().getString(R.string.msg_borrado), p.getNombre());

        builder.setTitle(R.string.etiq_borrado);
        builder.setMessage(msgBorrado);
        builder.setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        builder.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String toastMsg = "El producto [" + p.getNombre() + "] ha sido eliminado de su lista de la compra";
                adapter.getCompra().eliminaProducto(p);
                adapter.notifyDataSetChanged();
                Toast.makeText(getApplicationContext(), toastMsg, Toast.LENGTH_SHORT).show();
            }
        });
        //
        // Mostrar Diálogo
        //
        builder.create().show();
    }

    /**********************************************************
     *
     *** GESTIÓN DEL MENU
     *
     ***********************************************************/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_lista_compra_2, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        cargaPreferencias();
        switch (item.getItemId()) {
            case android.R.id.home:
                return super.onOptionsItemSelected(item);
            case R.id.menu_anyadir:
                Intent i = new Intent(this, AnyadirProductoActivity.class);
                startActivityForResult(i, ANYADIR_PRODUCTO_REQUEST);
                break;
            case R.id.menu_borrar:
                borrarListaCompra(); //VER BORRADO DE LISTA DE LA COMPRA
                break;
            case R.id.menu_restaurar:
                restauraCompra(); //VER OPERACIONES PARA GUARDAR Y RECUPERAR INFORMACIÓN
                break;
            case R.id.menu_guardar:
                guardaCompra(); //VER OPERACIONES PARA GUARDAR Y RECUPERAR INFORMACIÓN
                break;
            case R.id.menu_configurar:
                configuraApp(); // VER LANZAMIENTO A EJECUCIÓN DE LA ACTIVIDAD DE CONFIGURACIÓN DE LA APP
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

    /**********************************************************
     *
     *** BORRADO DE LISTA DE LA COMPRA
     *
     ***********************************************************/

    public void borrarListaCompra() {
        adapter.getCompra().getListaDeProductos().clear();
        adapter.notifyDataSetChanged();
    }

    /************************************************************************
     *
     *** LANZAMIENTO A EJECUCIÓN DE LA ACTIVIDAD DE CONFIGURACIÓN DE LA APP
     *
     *************************************************************************/
    protected void configuraApp() {
        Intent i = new Intent(this, PantallaConfiguracionActivity.class);
        startActivity(i);
    }


    /**********************************************************
     *
     *** OPERACIONES PARA GUARDAR INFORMACIÓN
     *
     ***********************************************************/


    void guardaCompra(File fichero) {
        Compra c = adapter.getCompra();
        String compraAsString = Formateado.aXML(c);
        GestorFicheros.escribirDatos(fichero, compraAsString);

        String procedenciaDatos = null;
        switch (memoriaElegida) {
            case Interna:
                procedenciaDatos = "Memoria Interna";
                break;
            case SD:
                procedenciaDatos = "Memoria Externa (SD)";
                break;
        }
        Toast.makeText(this, "Compra guardada", Toast.LENGTH_LONG).show();

    }

    void guardaCompra(){
        File enDirectorio = null;
        switch (memoriaElegida) {
            case Interna:
                enDirectorio = getFilesDir();
                break;
            case SD:
                if (puedoGuardarEnSD()) enDirectorio = dameDirectorioExterno();
                break;
        }
        if (enDirectorio!=null) {
            File enFichero = new File(enDirectorio.getAbsolutePath() + File.separatorChar + "compra_backup.xml");
            guardaCompra(enFichero);
        }
    }


    /**********************************************************
     *
     *** OPERACIONES PARA RECUPERAR INFORMACIÓN
     *
     ***********************************************************/

    protected void restauraCompra() {
        File desdeDirectorio = null;
        switch (memoriaElegida) {
            case Interna:
                desdeDirectorio = getFilesDir();
                break;
            case SD:
                if (puedoleerDeSD()) desdeDirectorio = dameDirectorioExterno();
                break;
        }

        if (desdeDirectorio!=null){
            File desdeFichero = new File(desdeDirectorio.getAbsolutePath() + File.separatorChar + "compra_backup.xml");
            restauraCompra(desdeFichero);
        }
    }

    void restauraCompra(File fichero) {
        String contenidoFichero = GestorFicheros.leerDatos(fichero);
        Compra c = Formateado.desdeXML(contenidoFichero);
        adapter.getCompra().getListaDeProductos().clear();
        adapter.setCompra(c);
        adapter.notifyDataSetChanged();
        String procedenciaDatos = null;
        switch (memoriaElegida) {
            case Interna:
                procedenciaDatos = "Memoria Interna";
                break;
            case SD:
                procedenciaDatos = "Memoria Externa (SD)";
                break;
        }
        Toast.makeText(this,
                "Compra restaurada desde " + procedenciaDatos,
                Toast.LENGTH_LONG).show();

    }



    /**************************************************************************************
     *
     *** GESTIÓN DE PERMISOS
     *   NOTA: INVOLUCRA TAMBIÉN AL CALLBACK onRequestPermissionsResult DEFINIDO MÁS ABAJO
     *
     **************************************************************************************/
    boolean puedoGuardarEnSD() {
        if (Build.VERSION.SDK_INT >= 23) {

            String state = Environment.getExternalStorageState();
            //
            // Miramos si la memoriaSD está presenta y es accesible
            //
            if (!Environment.MEDIA_MOUNTED.equals(state)) return false;
            if (Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) return false;

            int checkWriteablePermission =
                    ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
            if (PackageManager.PERMISSION_GRANTED == checkWriteablePermission) {
                return true;
            } else {
                ActivityCompat.requestPermissions(
                        this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, SOLICITAR_PERMISOS_ESCRITURA_EN_SD);
                return false;
            }
        } else {
            return true;
        }
    }

    boolean puedoleerDeSD() {
        if (Build.VERSION.SDK_INT >= 23) {

            String state = Environment.getExternalStorageState();
            //
            // Miramos si la memoriaSD está presenta y es accesible
            //
            if (!Environment.MEDIA_MOUNTED.equals(state)) return false;

            int checkWriteablePermission =
                    ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE);
            if (PackageManager.PERMISSION_GRANTED == checkWriteablePermission) {
                return true;
            } else {
                ActivityCompat.requestPermissions(
                        this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, SOLICITAR_PERMISOS_LECTURA_EN_SD);
                return false;
            }
        } else {
            return true;
        }
    }

    File dameDirectorioExterno() {
        //
        // Distintas opciones a la hora de almacenar la información en memoria externa.
        //
        //
        switch (memoriaExtElegida){
            case 1:
                return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
            case 2:
                return this.getExternalFilesDir(null);
            case 3:
                return this.getExternalFilesDir("Compras");
            case 0:
            default:
                return Environment.getExternalStorageDirectory();

        }
    }



    /**********************************************************
     *
     *** CALLBACKS: OPERACIONES PARA RECIBIR INFORMACIÓN
     *
     ***********************************************************/

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == SOLICITAR_PERMISOS_ESCRITURA_EN_SD) {
            int grantResultsLength = grantResults.length;
            if (grantResultsLength > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(getApplicationContext(), "Permisos concedios para escribier en memoria externa.", Toast.LENGTH_SHORT).show();
                guardaCompra();
            }
        }if (requestCode == SOLICITAR_PERMISOS_LECTURA_EN_SD) {
            int grantResultsLength = grantResults.length;
            if (grantResultsLength > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(getApplicationContext(), "Permisos concedios para leer desde la memoria externa.", Toast.LENGTH_SHORT).show();
                restauraCompra();
            }
        }else {
            Toast.makeText(getApplicationContext(), "Imposible acceder a la SD por falta de permisos.", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode!=RESULT_CANCELED){
            switch(requestCode){
                case ANYADIR_PRODUCTO_REQUEST:
                    Producto p = (Producto)data.getSerializableExtra("Producto");
                    adapter.getCompra().anyadeProducto(p);
                    adapter.notifyDataSetChanged();
                    break;
            }
        }

    }





    /*************************************************************
     *
     *** CARGA DE LAS PREFERENCIAS (Al iniciar y reiniciar la app)
     *
     **************************************************************/
    void cargaPreferencias(){
        SharedPreferences prefs =
                PreferenceManager.getDefaultSharedPreferences(this);
        if (prefs.getString("memoria", "0").equalsIgnoreCase("0")) {
            memoriaElegida = Tipo_Memoria.Interna;
        }else{
            memoriaElegida = Tipo_Memoria.SD;
        }
        restaurarLaCompra = prefs.getBoolean("restaurar",true);
        memoriaExtElegida = new Integer(prefs.getString("memoria_ext", "0")).intValue();
    }


    @Override
    protected void onResume() {
        //
        //ACTUALIZAMOS EL MENSAJE AL USUARIO TENIENDO EN CUENTA SUS PREFERENCIAS DE ALMACENAMIENTO
        //AL GENERAR EL MESAJE SE RECARGAN LA PREFERENCIAS (llamada a cargaPreferencias())
        //
        TextView tv = findViewById(R.id.tv_description);
        tv.setText(this.mensajePrincipal());
        super.onResume();
    }
}
