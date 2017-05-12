package egaprasetianti.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SpsActivity extends AppCompatActivity {
    TextView btnShare, content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sps);

        btnShare = (TextView) findViewById(R.id.btnShare);
        content = (TextView) findViewById(R.id.content);

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT, content.getText().toString());
                i.setType("text/plain");
                startActivity(i);
            }
        });
    }
}
