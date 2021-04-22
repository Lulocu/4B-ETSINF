package es.upv.cdm.jcruizg.holamundo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.app.LoaderManager;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor> {
    private static final String[] DUMMY_CREDENTIALS = {"cdm@upv.es:holamundo", "reversing@upv.es:mundohola"};
    private static final int REQUEST_READ_CONTACTS = 0;
    private UserLoginTask mAuthTask = null;
    private AutoCompleteTextView mEmailView;
    private View mLoginFormView;
    private EditText mPasswordView;
    private View mProgressView;

    private interface ProfileQuery {
        public static final int ADDRESS = 0;
        public static final int IS_PRIMARY = 1;
        public static final String[] PROJECTION = {"data1", "is_primary"};
    }

    @Override // android.app.LoaderManager.LoaderCallbacks
    public void onLoaderReset(Loader<Cursor> loader) {
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.SupportActivity, android.support.v4.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_login);
        this.mEmailView = (AutoCompleteTextView) findViewById(R.id.email);
        populateAutoComplete();
        this.mPasswordView = (EditText) findViewById(R.id.password);
        this.mPasswordView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class es.upv.cdm.jcruizg.holamundo.LoginActivity.AnonymousClass1 */

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 6 && i != 0) {
                    return false;
                }
                LoginActivity.this.attemptLogin();
                return true;
            }
        });
        ((Button) findViewById(R.id.email_sign_in_button)).setOnClickListener(new View.OnClickListener() {
            /* class es.upv.cdm.jcruizg.holamundo.LoginActivity.AnonymousClass2 */

            public void onClick(View view) {
                LoginActivity.this.attemptLogin();
            }
        });
        this.mLoginFormView = findViewById(R.id.login_form);
        this.mProgressView = findViewById(R.id.login_progress);
    }

    private void populateAutoComplete() {
        if (mayRequestContacts()) {
            getLoaderManager().initLoader(0, null, this);
        }
    }

    private boolean mayRequestContacts() {
        if (Build.VERSION.SDK_INT < 23 || checkSelfPermission("android.permission.READ_CONTACTS") == 0) {
            return true;
        }
        if (shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
            Snackbar.make(this.mEmailView, (int) R.string.permission_rationale, -2).setAction(17039370, new View.OnClickListener() {
                /* class es.upv.cdm.jcruizg.holamundo.LoginActivity.AnonymousClass3 */

                @TargetApi(23)
                public void onClick(View view) {
                    LoginActivity.this.requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 0);
                }
            });
        } else {
            requestPermissions(new String[]{"android.permission.READ_CONTACTS"}, 0);
        }
        return false;
    }

    @Override // android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback, android.support.v4.app.FragmentActivity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i == 0 && iArr.length == 1 && iArr[0] == 0) {
            populateAutoComplete();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void attemptLogin() {
        TextView textView;
        boolean z;
        if (this.mAuthTask == null) {
            this.mEmailView.setError(null);
            this.mPasswordView.setError(null);
            String obj = this.mEmailView.getText().toString();
            String obj2 = this.mPasswordView.getText().toString();
            if (TextUtils.isEmpty(obj2) || isPasswordValid(obj2)) {
                textView = null;
                z = false;
            } else {
                this.mPasswordView.setError(getString(R.string.error_invalid_password));
                textView = this.mPasswordView;
                z = true;
            }
            if (TextUtils.isEmpty(obj)) {
                this.mEmailView.setError(getString(R.string.error_field_required));
                textView = this.mEmailView;
                z = true;
            } else if (!isEmailValid(obj)) {
                this.mEmailView.setError(getString(R.string.error_invalid_email));
                textView = this.mEmailView;
                z = true;
            }
            if (z) {
                textView.requestFocus();
                return;
            }
            showProgress(true);
            this.mAuthTask = new UserLoginTask(obj, obj2);
            this.mAuthTask.execute(null);
        }
    }

    private boolean isEmailValid(String str) {
        return str.contains("@");
    }

    private boolean isPasswordValid(String str) {
        return str.length() > 4;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    @TargetApi(13)
    private void showProgress(final boolean z) {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 13) {
            int integer = getResources().getInteger(17694720);
            this.mLoginFormView.setVisibility(z ? 8 : 0);
            long j = (long) integer;
            float f = 0.0f;
            this.mLoginFormView.animate().setDuration(j).alpha(z ? 0.0f : 1.0f).setListener(new AnimatorListenerAdapter() {
                /* class es.upv.cdm.jcruizg.holamundo.LoginActivity.AnonymousClass4 */

                public void onAnimationEnd(Animator animator) {
                    LoginActivity.this.mLoginFormView.setVisibility(z ? 8 : 0);
                }
            });
            View view = this.mProgressView;
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
            ViewPropertyAnimator duration = this.mProgressView.animate().setDuration(j);
            if (z) {
                f = 1.0f;
            }
            duration.alpha(f).setListener(new AnimatorListenerAdapter() {
                /* class es.upv.cdm.jcruizg.holamundo.LoginActivity.AnonymousClass5 */

                public void onAnimationEnd(Animator animator) {
                    LoginActivity.this.mProgressView.setVisibility(z ? 0 : 8);
                }
            });
            return;
        }
        this.mProgressView.setVisibility(z ? 0 : 8);
        View view2 = this.mLoginFormView;
        if (z) {
            i = 8;
        }
        view2.setVisibility(i);
    }

    @Override // android.app.LoaderManager.LoaderCallbacks
    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        return new CursorLoader(this, Uri.withAppendedPath(ContactsContract.Profile.CONTENT_URI, "data"), ProfileQuery.PROJECTION, "mimetype = ?", new String[]{"vnd.android.cursor.item/email_v2"}, "is_primary DESC");
    }

    public void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            arrayList.add(cursor.getString(0));
            cursor.moveToNext();
        }
        addEmailsToAutoComplete(arrayList);
    }

    private void addEmailsToAutoComplete(List<String> list) {
        this.mEmailView.setAdapter(new ArrayAdapter(this, 17367050, list));
    }

    public class UserLoginTask extends AsyncTask<Void, Void, Boolean> {
        private final String mEmail;
        private final String mPassword;

        UserLoginTask(String str, String str2) {
            this.mEmail = str;
            this.mPassword = str2;
        }

        /* access modifiers changed from: protected */
        public Boolean doInBackground(Void... voidArr) {
            try {
                Thread.sleep(2000);
                for (String str : LoginActivity.DUMMY_CREDENTIALS) {
                    String[] split = str.split(":");
                    if (split[0].equals(this.mEmail)) {
                        return Boolean.valueOf(split[1].equals(this.mPassword));
                    }
                }
                return false;
            } catch (InterruptedException unused) {
                return false;
            }
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Boolean bool) {
            LoginActivity.this.mAuthTask = null;
            LoginActivity.this.showProgress(false);
            if (bool.booleanValue()) {
                LoginActivity loginActivity = LoginActivity.this;
                loginActivity.startActivity(new Intent(loginActivity.getApplicationContext(), SegundaActividad.class));
                return;
            }
            LoginActivity.this.mPasswordView.setError(LoginActivity.this.getString(R.string.error_incorrect_password));
            LoginActivity.this.mPasswordView.requestFocus();
        }

        /* access modifiers changed from: protected */
        public void onCancelled() {
            LoginActivity.this.mAuthTask = null;
            LoginActivity.this.showProgress(false);
        }
    }
}
