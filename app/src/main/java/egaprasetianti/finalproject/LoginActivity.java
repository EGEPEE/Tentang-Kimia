package egaprasetianti.finalproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText txtUser, txtPassword;
    Intent i;

    SharedPreferences pref;
    SharedPreferences.Editor editors;

    String KEEPLOGIN = "KEEPLOGIN";
    String NAMA = "NAMA";
    String MYDATA = "MYDATA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        pref = getSharedPreferences(MYDATA, MODE_PRIVATE);
        editors = pref.edit();

        txtUser = (EditText) findViewById(R.id.txtUser);
        txtPassword = (EditText) findViewById(R.id.txtPassword);

        if (pref.getBoolean(KEEPLOGIN, false)) {
            i = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(i);
            finish();
        } else {
            Toast.makeText(this, "You can enter the Username as Member and Password as member", Toast.LENGTH_LONG).show();
        }
    }

    public void Login(View view) {
        String valueUser = txtUser.getText().toString();
        String valuePass = txtPassword.getText().toString();

        if ((valueUser).equals("Member") && (valuePass).equals("member")) {
            editors.putString(NAMA, txtUser.getText().toString());
            editors.putBoolean(KEEPLOGIN, true);
            editors.commit();

            i = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(i);
            finish();

            Toast.makeText(this, "Welcome, Member!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong Username or Password!", Toast.LENGTH_SHORT).show();
        }
    }
}