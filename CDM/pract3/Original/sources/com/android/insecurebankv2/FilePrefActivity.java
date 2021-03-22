package com.android.insecurebankv2;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.marcohc.toasteroid.Toasteroid;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilePrefActivity extends Activity {
    static EditText edit_serverip;
    static EditText edit_serverport;
    SharedPreferences.Editor editor;
    SharedPreferences preferences;
    Button submitPref_buttonz;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_pref);
        this.submitPref_buttonz = (Button) findViewById(R.id.submitPref_button);
        edit_serverip = (EditText) findViewById(R.id.edittext_serverip);
        edit_serverport = (EditText) findViewById(R.id.edittext_serverport);
        this.preferences = PreferenceManager.getDefaultSharedPreferences(this);
        this.editor = this.preferences.edit();
        this.submitPref_buttonz.setOnClickListener(new View.OnClickListener() {
            /* class com.android.insecurebankv2.FilePrefActivity.AnonymousClass1 */

            public void onClick(View v) {
                FilePrefActivity.this.setPreferences();
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            callPreferences();
            return true;
        } else if (id != R.id.action_exit) {
            return super.onOptionsItemSelected(item);
        } else {
            Intent i = new Intent(getBaseContext(), LoginActivity.class);
            i.addFlags(67108864);
            startActivity(i);
            return true;
        }
    }

    public void callPreferences() {
        startActivity(new Intent(this, FilePrefActivity.class));
    }

    /* access modifiers changed from: protected */
    public void setPreferences() {
        String serverportSaved = edit_serverport.getText().toString();
        String serveripSaved = edit_serverip.getText().toString();
        Matcher m = Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(serveripSaved);
        if (serveripSaved == null || !m.matches()) {
            Toasteroid.show(this, "Invalid Server IP!!", Toasteroid.STYLES.ERROR, 0);
            return;
        }
        Matcher m2 = Pattern.compile("(6553[0-5]|655[0-2]\\d|65[0-4]\\d{2}|6[0-4]\\d{3}|[1-5]\\d{4}|[1-9]\\d{0,3})").matcher(serverportSaved);
        if (serverportSaved == null || !m2.matches()) {
            Toasteroid.show(this, "Invalid Port entered!!", Toasteroid.STYLES.ERROR, 0);
            return;
        }
        this.editor.putString("serverip", serveripSaved);
        this.editor.putString("serverport", serverportSaved);
        this.editor.commit();
        Toasteroid.show(this, "Server Configured Successfully!!", Toasteroid.STYLES.SUCCESS, 0);
        finish();
    }
}
