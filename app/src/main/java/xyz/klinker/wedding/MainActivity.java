package xyz.klinker.wedding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private static final String IMAGE_URL = "https://s32.postimg.org/xpjqzovc5/profile.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView profile = (ImageView) findViewById(R.id.profile);

        Glide.with(this).load(IMAGE_URL).centerCrop().into(profile);
    }
}
