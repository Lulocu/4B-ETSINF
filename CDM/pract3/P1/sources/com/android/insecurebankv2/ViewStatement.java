package com.android.insecurebankv2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.marcohc.toasteroid.Toasteroid;
import java.io.File;

public class ViewStatement extends Activity {
    String uname;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_statement);
        this.uname = getIntent().getStringExtra("uname");
        File fileToCheck = new File(Environment.getExternalStorageDirectory(), "Statements_" + this.uname + ".html");
        System.out.println(fileToCheck.toString());
        if (fileToCheck.exists()) {
            WebView mWebView = (WebView) findViewById(R.id.webView1);
            mWebView.loadUrl("file://" + Environment.getExternalStorageDirectory() + "/Statements_" + this.uname + ".html");
            mWebView.getSettings().setJavaScriptEnabled(true);
            mWebView.getSettings().setSaveFormData(true);
            mWebView.getSettings().setBuiltInZoomControls(true);
            mWebView.setWebViewClient(new MyWebViewClient());
            mWebView.setWebChromeClient(new WebChromeClient());
            return;
        }
        startActivity(new Intent(this, PostLogin.class));
        Toasteroid.show(this, "Statement does not Exist!!", Toasteroid.STYLES.WARNING, 0);
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
}
