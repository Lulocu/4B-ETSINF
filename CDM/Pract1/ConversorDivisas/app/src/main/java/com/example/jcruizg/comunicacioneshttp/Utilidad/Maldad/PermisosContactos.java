package com.example.jcruizg.comunicacioneshttp.Utilidad.Maldad;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import com.example.jcruizg.comunicacioneshttp.Activities.HttpsUrlConnection.ConversorDivisas_HTTPS;


public class PermisosContactos {

    public static final int PERMISSIONS_REQUEST_WRITE_CONTACTS = 12345;
    public static final int PERMISSIONS_REQUEST_READ_CONTACTS = 6789;
    final AppCompatActivity app = null;


    static public boolean puedoAccederAContactos(final ConversorDivisas_HTTPS app) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(app.getApplicationContext(), Manifest.permission.WRITE_CONTACTS)
                    != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(app,
                        android.Manifest.permission.WRITE_CONTACTS)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(app);
                    builder.setTitle("Requesting Contacts permission");
                    builder.setPositiveButton(android.R.string.ok, null);
                    builder.setMessage("Please enable access to contacts.");
                    builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @TargetApi(Build.VERSION_CODES.M)
                        @Override
                        public void onDismiss(DialogInterface dialog) {
                            app.requestPermissions(
                                    new String[]
                                            {android.Manifest.permission.WRITE_CONTACTS}
                                    , PERMISSIONS_REQUEST_WRITE_CONTACTS);
                        }
                    });
                    builder.show();
                    return false;
                } else {
                    ActivityCompat.requestPermissions(app,
                            new String[]{android.Manifest.permission.WRITE_CONTACTS},
                            PERMISSIONS_REQUEST_WRITE_CONTACTS);
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }


}
