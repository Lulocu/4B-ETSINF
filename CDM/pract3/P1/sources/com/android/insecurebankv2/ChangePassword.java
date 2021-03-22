package com.android.insecurebankv2;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

public class ChangePassword extends Activity {
    private static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
    Button changePassword_button;
    EditText changePassword_text;
    private Matcher matcher;
    private Pattern pattern;
    String protocol = "http://";
    BufferedReader reader;
    String result;
    SharedPreferences serverDetails;
    String serverip = "";
    String serverport = "";
    TextView textView_Username;
    String uname;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        this.serverDetails = PreferenceManager.getDefaultSharedPreferences(this);
        this.serverip = this.serverDetails.getString("serverip", null);
        this.serverport = this.serverDetails.getString("serverport", null);
        this.changePassword_text = (EditText) findViewById(R.id.editText_newPassword);
        this.uname = getIntent().getStringExtra("uname");
        System.out.println("newpassword=" + this.uname);
        this.textView_Username = (TextView) findViewById(R.id.textView_Username);
        this.textView_Username.setText(this.uname);
        this.changePassword_button = (Button) findViewById(R.id.button_newPasswordSubmit);
        this.changePassword_button.setOnClickListener(new View.OnClickListener() {
            /* class com.android.insecurebankv2.ChangePassword.AnonymousClass1 */

            public void onClick(View v) {
                new RequestChangePasswordTask().execute(ChangePassword.this.uname);
            }
        });
    }

    class RequestChangePasswordTask extends AsyncTask<String, String, String> {
        RequestChangePasswordTask() {
        }

        /* access modifiers changed from: protected */
        public String doInBackground(String... params) {
            try {
                postData(params[0]);
                return null;
            } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException | JSONException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Double result) {
        }

        /* access modifiers changed from: protected */
        public void onProgressUpdate(Integer... progress) {
        }

        public void postData(String valueIWantToSend) throws ClientProtocolException, IOException, JSONException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
            HttpClient httpclient = new DefaultHttpClient();
            HttpPost httppost = new HttpPost(ChangePassword.this.protocol + ChangePassword.this.serverip + ":" + ChangePassword.this.serverport + "/changepassword");
            List<NameValuePair> nameValuePairs = new ArrayList<>(2);
            nameValuePairs.add(new BasicNameValuePair("username", ChangePassword.this.uname));
            nameValuePairs.add(new BasicNameValuePair("newpassword", ChangePassword.this.changePassword_text.getText().toString()));
            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            ChangePassword.this.pattern = Pattern.compile(ChangePassword.PASSWORD_PATTERN);
            ChangePassword.this.matcher = ChangePassword.this.pattern.matcher(ChangePassword.this.changePassword_text.getText().toString());
            if (ChangePassword.this.matcher.matches()) {
                InputStream in = httpclient.execute(httppost).getEntity().getContent();
                ChangePassword.this.result = convertStreamToString(in);
                ChangePassword.this.result = ChangePassword.this.result.replace("\n", "");
                ChangePassword.this.runOnUiThread(new Runnable() {
                    /* class com.android.insecurebankv2.ChangePassword.RequestChangePasswordTask.AnonymousClass1 */

                    public void run() {
                        if (ChangePassword.this.result != null && ChangePassword.this.result.indexOf("Change Password Successful") != -1) {
                            try {
                                Toast.makeText(ChangePassword.this.getApplicationContext(), new JSONObject(ChangePassword.this.result).getString("message") + ". Restart application to Continue.", 1).show();
                                String phoneNumber = ((TelephonyManager) ChangePassword.this.getApplicationContext().getSystemService("phone")).getLine1Number();
                                System.out.println("phonno:" + phoneNumber);
                                ChangePassword.this.broadcastChangepasswordSMS(phoneNumber, ChangePassword.this.changePassword_text.getText().toString());
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                });
                return;
            }
            ChangePassword.this.runOnUiThread(new Runnable() {
                /* class com.android.insecurebankv2.ChangePassword.RequestChangePasswordTask.AnonymousClass2 */

                public void run() {
                    Toast.makeText(ChangePassword.this.getApplicationContext(), "Entered password is not complex enough.", 1).show();
                }
            });
        }

        private String convertStreamToString(InputStream in) throws IOException {
            try {
                ChangePassword.this.reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = ChangePassword.this.reader.readLine();
                if (line != null) {
                    sb.append(line + "\n");
                } else {
                    in.close();
                    return sb.toString();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void broadcastChangepasswordSMS(String phoneNumber, String pass) {
        if (TextUtils.isEmpty(phoneNumber.toString().trim())) {
            System.out.println("Phone number Invalid.");
            return;
        }
        Intent smsIntent = new Intent();
        smsIntent.setAction("theBroadcast");
        smsIntent.putExtra("phonenumber", phoneNumber);
        smsIntent.putExtra("newpass", pass);
        sendBroadcast(smsIntent);
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
