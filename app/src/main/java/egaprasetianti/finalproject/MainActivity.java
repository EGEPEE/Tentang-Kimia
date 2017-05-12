package egaprasetianti.finalproject;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    SharedPreferences pref;
    SharedPreferences.Editor editors;

    String KEEPLOGIN = "KEEPLOGIN";
    String NAMA = "NAMA";
    String MYDATA = "MYDATA";

    private LinearLayout btnModule, btnUnsur, btnAbout;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnModule = (LinearLayout) findViewById(R.id.btnModule);
        btnUnsur = (LinearLayout) findViewById(R.id.btnUnsur);
        btnAbout = (LinearLayout) findViewById(R.id.btnAbout);

        pref = getSharedPreferences(MYDATA, MODE_PRIVATE);
        editors = pref.edit();

        btnModule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainActivity.this, ModuleActivity.class);
                startActivity(i);
            }
        });

        btnUnsur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainActivity.this, UnsurActivity.class);
                startActivity(i);
            }
        });

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(i);
            }
        });
    }

    public void Logout(View view){
        editors.clear();
        editors.commit();
        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);
        finish();
    }
}
