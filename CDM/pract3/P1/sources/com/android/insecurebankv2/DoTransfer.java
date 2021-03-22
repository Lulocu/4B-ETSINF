package com.android.insecurebankv2;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.marcohc.toasteroid.Toasteroid;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

public class DoTransfer extends Activity {
    public static final String MYPREFS2 = "mySharedPreferences";
    String acc1;
    String acc2;
    EditText amount;
    Button button1;
    EditText from;
    Button getAccounts;
    InputStream in;
    JSONObject jsonObject;
    String number = "5554";
    String passNormalized;
    EditText phoneNumber;
    String protocol = "http://";
    BufferedReader reader;
    HttpResponse responseBody;
    String result;
    SharedPreferences serverDetails;
    String serverip = "";
    String serverport = "";
    EditText to;
    Button transfer;
    String usernameBase64ByteString;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_transfer);
        this.serverDetails = PreferenceManager.getDefaultSharedPreferences(this);
        this.serverip = this.serverDetails.getString("serverip", null);
        this.serverport = this.serverDetails.getString("serverport", null);
        this.transfer = (Button) findViewById(R.id.button_Transfer);
        this.transfer.setOnClickListener(new View.OnClickListener() {
            /* class com.android.insecurebankv2.DoTransfer.AnonymousClass1 */

            public void onClick(View v) {
                DoTransfer.this.from = (EditText) DoTransfer.this.findViewById(R.id.editText_from);
                DoTransfer.this.to = (EditText) DoTransfer.this.findViewById(R.id.editText_to);
                new RequestDoTransferTask().execute("username");
            }
        });
        this.button1 = (Button) findViewById(R.id.button_CreateUser);
        this.button1.setOnClickListener(new View.OnClickListener() {
            /* class com.android.insecurebankv2.DoTransfer.AnonymousClass2 */

            public void onClick(View v) {
                new RequestDoGets2().execute("username");
            }
        });
    }

    public class RequestDoTransferTask extends AsyncTask<String, String, String> {
        public RequestDoTransferTask() {
        }

        public void AsyncHttpTransferPost(String string) {
        }

        /* access modifiers changed from: protected */
        public String doInBackground(String... params) {
            HttpClient httpclient = new DefaultHttpClient();
            HttpPost httppost = new HttpPost(DoTransfer.this.protocol + DoTransfer.this.serverip + ":" + DoTransfer.this.serverport + "/dotransfer");
            SharedPreferences settings = DoTransfer.this.getSharedPreferences("mySharedPreferences", 0);
            byte[] usernameBase64Byte = Base64.decode(settings.getString("EncryptedUsername", null), 0);
            try {
                DoTransfer.this.usernameBase64ByteString = new String(usernameBase64Byte, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            String password = settings.getString("superSecurePassword", null);
            try {
                DoTransfer.this.passNormalized = DoTransfer.this.getNormalizedPassword(password);
            } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e1) {
                e1.printStackTrace();
            }
            List<NameValuePair> nameValuePairs = new ArrayList<>(5);
            nameValuePairs.add(new BasicNameValuePair("username", DoTransfer.this.usernameBase64ByteString));
            nameValuePairs.add(new BasicNameValuePair("password", DoTransfer.this.passNormalized));
            DoTransfer.this.from = (EditText) DoTransfer.this.findViewById(R.id.editText_from);
            DoTransfer.this.to = (EditText) DoTransfer.this.findViewById(R.id.editText_to);
            DoTransfer.this.amount = (EditText) DoTransfer.this.findViewById(R.id.editText_amount);
            nameValuePairs.add(new BasicNameValuePair("from_acc", DoTransfer.this.from.getText().toString()));
            nameValuePairs.add(new BasicNameValuePair("to_acc", DoTransfer.this.to.getText().toString()));
            nameValuePairs.add(new BasicNameValuePair("amount", DoTransfer.this.amount.getText().toString()));
            try {
                httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
            try {
                DoTransfer.this.responseBody = httpclient.execute(httppost);
            } catch (IOException e12) {
                e12.printStackTrace();
            }
            try {
                DoTransfer.this.in = DoTransfer.this.responseBody.getEntity().getContent();
            } catch (IOException | IllegalStateException e13) {
                e13.printStackTrace();
            }
            try {
                DoTransfer.this.result = DoTransfer.this.convertStreamToString(DoTransfer.this.in);
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            DoTransfer.this.result = DoTransfer.this.result.replace("\n", "");
            DoTransfer.this.runOnUiThread(new Runnable() {
                /* class com.android.insecurebankv2.DoTransfer.RequestDoTransferTask.AnonymousClass1 */

                public void run() {
                    RequestDoTransferTask.this.AsyncHttpTransferPost("result");
                    if (DoTransfer.this.result == null) {
                        return;
                    }
                    if (DoTransfer.this.result.indexOf("Success") != -1) {
                        Toasteroid.show(DoTransfer.this, "Transfer Successful!!", Toasteroid.STYLES.SUCCESS, 0);
                        try {
                            DoTransfer.this.jsonObject = new JSONObject(DoTransfer.this.result);
                            DoTransfer.this.acc1 = DoTransfer.this.jsonObject.getString("from");
                            DoTransfer.this.acc2 = DoTransfer.this.jsonObject.getString("to");
                            System.out.println("Message:" + DoTransfer.this.jsonObject.getString("message") + " From:" + DoTransfer.this.from.getText().toString() + " To:" + DoTransfer.this.to.getText().toString() + " Amount:" + DoTransfer.this.amount.getText().toString());
                            String status = new String("\nMessage:Success From:" + DoTransfer.this.from.getText().toString() + " To:" + DoTransfer.this.to.getText().toString() + " Amount:" + DoTransfer.this.amount.getText().toString() + "\n");
                            try {
                                BufferedWriter out2 = new BufferedWriter(new FileWriter(Environment.getExternalStorageDirectory() + "/Statements_" + DoTransfer.this.usernameBase64ByteString + ".html", true));
                                out2.write(status);
                                out2.write("<hr>");
                                out2.close();
                            } catch (IOException e) {
                                e.toString();
                            }
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        Toasteroid.show(DoTransfer.this, "Transfer Failed!!", Toasteroid.STYLES.ERROR, 0);
                        System.out.println("Message:Failure From:" + DoTransfer.this.from.getText().toString() + " To:" + DoTransfer.this.to.getText().toString() + " Amount:" + DoTransfer.this.amount.getText().toString());
                        String status2 = new String("\nMessage:Failure From:" + DoTransfer.this.from.getText().toString() + " To:" + DoTransfer.this.to.getText().toString() + " Amount:" + DoTransfer.this.amount.getText().toString() + "\n");
                        try {
                            BufferedWriter out22 = new BufferedWriter(new FileWriter(Environment.getExternalStorageDirectory() + "/Statements_" + DoTransfer.this.usernameBase64ByteString + ".html", true));
                            out22.write(status2);
                            out22.write("<hr>");
                            out22.close();
                        } catch (IOException e3) {
                            e3.toString();
                        }
                    }
                }
            });
            return "dinesh";
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(String result) {
        }

        /* access modifiers changed from: protected */
        public void onProgressUpdate(String... progress) {
        }
    }

    public class RequestDoGets2 extends AsyncTask<String, String, String> {
        public RequestDoGets2() {
        }

        public void AsyncHttpPost(String string) {
        }

        public String doInBackground(String... params) {
            HttpClient httpclient = new DefaultHttpClient();
            HttpPost httppost = new HttpPost(DoTransfer.this.protocol + DoTransfer.this.serverip + ":" + DoTransfer.this.serverport + "/getaccounts");
            SharedPreferences settings = DoTransfer.this.getSharedPreferences("mySharedPreferences", 0);
            byte[] usernameBase64Byte = Base64.decode(settings.getString("EncryptedUsername", null), 0);
            try {
                DoTransfer.this.usernameBase64ByteString = new String(usernameBase64Byte, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            String password = settings.getString("superSecurePassword", null);
            try {
                DoTransfer.this.passNormalized = DoTransfer.this.getNormalizedPassword(password);
            } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e1) {
                e1.printStackTrace();
            }
            List<NameValuePair> nameValuePairs = new ArrayList<>(2);
            nameValuePairs.add(new BasicNameValuePair("username", DoTransfer.this.usernameBase64ByteString));
            nameValuePairs.add(new BasicNameValuePair("password", DoTransfer.this.passNormalized));
            try {
                httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
            try {
                DoTransfer.this.responseBody = httpclient.execute(httppost);
            } catch (IOException e22) {
                e22.printStackTrace();
            }
            try {
                DoTransfer.this.in = DoTransfer.this.responseBody.getEntity().getContent();
            } catch (IOException | IllegalStateException e12) {
                e12.printStackTrace();
            }
            try {
                DoTransfer.this.result = DoTransfer.this.convertStreamToString(DoTransfer.this.in);
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            DoTransfer.this.result = DoTransfer.this.result.replace("\n", "");
            if (!(DoTransfer.this.result == null || DoTransfer.this.result.indexOf("Correct") == -1)) {
                try {
                    DoTransfer.this.jsonObject = new JSONObject(DoTransfer.this.result);
                    DoTransfer.this.acc1 = DoTransfer.this.jsonObject.getString("from");
                    DoTransfer.this.acc2 = DoTransfer.this.jsonObject.getString("to");
                } catch (JSONException e4) {
                    e4.printStackTrace();
                }
            }
            DoTransfer.this.runOnUiThread(new Runnable() {
                /* class com.android.insecurebankv2.DoTransfer.RequestDoGets2.AnonymousClass1 */

                public void run() {
                    RequestDoGets2.this.AsyncHttpPost("result");
                    DoTransfer.this.from = (EditText) DoTransfer.this.findViewById(R.id.editText_from);
                    DoTransfer.this.to = (EditText) DoTransfer.this.findViewById(R.id.editText_to);
                    DoTransfer.this.from.setText(DoTransfer.this.acc1);
                    DoTransfer.this.to.setText(DoTransfer.this.acc2);
                }
            });
            return "dinesh";
        }

        public void onPostExecute(String result) {
        }

        public void onProgressUpdate(String... progress) {
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String getNormalizedPassword(String password) throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        return new CryptoClass().aesDeccryptedString(password);
    }

    public String convertStreamToString(InputStream in2) throws IOException {
        try {
            this.reader = new BufferedReader(new InputStreamReader(in2, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = this.reader.readLine();
            if (line != null) {
                sb.append(line + "\n");
            } else {
                in2.close();
                return sb.toString();
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        item.getItemId();
        switch (item.getItemId()) {
            case 16908332:
                finish();
                return true;
            case R.id.action_settings /*{ENCODED_INT: 2131558559}*/:
                callPreferences();
                return true;
            case R.id.action_exit /*{ENCODED_INT: 2131558560}*/:
                Intent i = new Intent(getBaseContext(), LoginActivity.class);
                i.addFlags(67108864);
                startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void callPreferences() {
        startActivity(new Intent(this, FilePrefActivity.class));
    }
}
