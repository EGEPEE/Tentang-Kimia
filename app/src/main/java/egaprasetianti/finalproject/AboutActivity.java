package egaprasetianti.finalproject;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AboutActivity extends AppCompatActivity {

    ImageView btnFB, btnGithub, btnTwitter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        btnFB = (ImageView) findViewById(R.id.btnFB);
        btnGithub = (ImageView) findViewById(R.id.btnGithub);
        btnTwitter = (ImageView) findViewById(R.id.btnTwitter);

        btnFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/EGEPEE"));
                startActivity(i);
            }
        });
        btnGithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/EGEPEE/"));
                startActivity(i);
            }
        });
        btnTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/EGEPEE/"));
                startActivity(i);
            }
        });
    }
}
