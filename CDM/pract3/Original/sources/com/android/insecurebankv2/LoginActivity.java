package com.android.insecurebankv2;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.marcohc.toasteroid.Toasteroid;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class LoginActivity extends Activity {
    public static final String MYPREFS = "mySharedPreferences";
    EditText Password_Text;
    EditText Username_Text;
    Button createuser_buttons;
    Button fillData_button;
    Button login_buttons;
    String usernameBase64ByteString;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_main);
        if (getResources().getString(R.string.is_admin).equals("no")) {
            findViewById(R.id.button_CreateUser).setVisibility(8);
        }
        this.login_buttons = (Button) findViewById(R.id.login_button);
        this.login_buttons.setOnClickListener(new View.OnClickListener() {
            /* class com.android.insecurebankv2.LoginActivity.AnonymousClass1 */

            public void onClick(View v) {
                LoginActivity.this.performlogin();
            }
        });
        this.createuser_buttons = (Button) findViewById(R.id.button_CreateUser);
        this.createuser_buttons.setOnClickListener(new View.OnClickListener() {
            /* class com.android.insecurebankv2.LoginActivity.AnonymousClass2 */

            public void onClick(View v) {
                LoginActivity.this.createUser();
            }
        });
        try {
            fillData();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e2) {
            e2.printStackTrace();
        } catch (NoSuchAlgorithmException e3) {
            e3.printStackTrace();
        } catch (NoSuchPaddingException e4) {
            e4.printStackTrace();
        } catch (InvalidAlgorithmParameterException e5) {
            e5.printStackTrace();
        } catch (IllegalBlockSizeException e6) {
            e6.printStackTrace();
        } catch (BadPaddingException e7) {
            e7.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void createUser() {
        Toasteroid.show(this, "Create User functionality is still Work-In-Progress!!", Toasteroid.STYLES.WARNING, 1);
    }

    /* access modifiers changed from: protected */
    public void fillData() throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        SharedPreferences settings = getSharedPreferences("mySharedPreferences", 0);
        String username = settings.getString("EncryptedUsername", null);
        String password = settings.getString("superSecurePassword", null);
        if (username == null || password == null) {
            if (username == null || password == null) {
            }
            return;
        }
        try {
            this.usernameBase64ByteString = new String(Base64.decode(username, 0), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.Username_Text = (EditText) findViewById(R.id.loginscreen_username);
        this.Password_Text = (EditText) findViewById(R.id.loginscreen_password);
        this.Username_Text.setText(this.usernameBase64ByteString);
        this.Password_Text.setText(new CryptoClass().aesDeccryptedString(password));
    }

    /* access modifiers changed from: protected */
    public void performlogin() {
        this.Username_Text = (EditText) findViewById(R.id.loginscreen_username);
        this.Password_Text = (EditText) findViewById(R.id.loginscreen_password);
        Intent i = new Intent(this, DoLogin.class);
        i.putExtra("passed_username", this.Username_Text.getText().toString());
        i.putExtra("passed_password", this.Password_Text.getText().toString());
        startActivity(i);
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
