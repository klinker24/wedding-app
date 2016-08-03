package xyz.klinker.wedding.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;

import com.bumptech.glide.Glide;

import xyz.klinker.wedding.R;
import xyz.klinker.wedding.fragment.GuestListFragment;

public class MainActivity extends AppCompatActivity {

    private static final String IMAGE_URL = "https://s32.postimg.org/xpjqzovc5/profile.jpg";

    private TextSwitcher title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = (TextSwitcher) findViewById(R.id.title_switcher);
        ImageView profile = (ImageView) findViewById(R.id.profile);

        Glide.with(this).load(IMAGE_URL).centerCrop().into(profile);

        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        title.setInAnimation(in);
        title.setOutAnimation(out);
        title.setFactory(mFactory);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_guest_list, new GuestListFragment())
                .commit();
    }

    @Override
    public void onBackPressed() {
        // I don' want anyone pressing the back button to leave the app by accident
        // Should be screen pinned, but still, just in case.
    }

    @Override
    public void setTitle(CharSequence newTitle) {
        title.setText(newTitle);
    }

    private ViewSwitcher.ViewFactory mFactory = new ViewSwitcher.ViewFactory() {
        @Override
        public View makeView() {
            return LayoutInflater.from(MainActivity.this).inflate(R.layout.component_title_switcher, null);
        }
    };
}
