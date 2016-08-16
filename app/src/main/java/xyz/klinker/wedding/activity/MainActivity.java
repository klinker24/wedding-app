package xyz.klinker.wedding.activity;

import android.app.Fragment;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;

import com.bumptech.glide.Glide;

import xyz.klinker.wedding.R;
import xyz.klinker.wedding.adapter.GuestViewHolder;
import xyz.klinker.wedding.data.ImageConstants;
import xyz.klinker.wedding.fragment.GuestInfoFragment;
import xyz.klinker.wedding.fragment.GuestListFragment;
import xyz.klinker.wedding.fragment.ReceptionInfoFragment;
import xyz.klinker.wedding.listener.GuestClickListener;

public class MainActivity extends AppCompatActivity implements GuestClickListener {


    private TextSwitcher title;

    private GuestListFragment guestListFragment;
    private Fragment fragmentOnCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = (TextSwitcher) findViewById(R.id.title_switcher);
        ImageView profile = (ImageView) findViewById(R.id.profile);

        Glide.with(this).load(ImageConstants.PROFILE_IMAGE_URL).centerCrop().into(profile);

        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        title.setInAnimation(in);
        title.setOutAnimation(out);
        title.setFactory(mFactory);

        guestListFragment = new GuestListFragment();

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_guest_list, guestListFragment)
                .commit();
    }

    @Override
    public void onBackPressed() {
        if (fragmentOnCard instanceof GuestInfoFragment) {
            resetToReceptionInfo();
        }

        guestListFragment.setSearchText("");

        // I don' want anyone pressing the back button to leave the app by accident
        // Should be screen pinned, but still, just in case.
    }

    @Override
    public void setTitle(CharSequence newTitle) {
        title.setText(newTitle);
    }

    @Override
    public void onGuestClicked(GuestViewHolder holder) {
        if (fragmentOnCard instanceof ReceptionInfoFragment) {
            setTitle(getString(R.string.seating_information));
        }

        fragmentOnCard = GuestInfoFragment.getInstance(holder.getGuest());
        fragmentOnCard.setEnterTransition(new Fade());
        fragmentOnCard.setExitTransition(new Fade());

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_guest_info, fragmentOnCard)
                .commit();

        guestListFragment.setSearchText("");
        hideKeyboard();
    }

    public void hideKeyboard() {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(title.getWindowToken(), 0);
    }

    public void resetToReceptionInfo() {
        if (!(fragmentOnCard instanceof ReceptionInfoFragment)) {
            setTitle(getString(R.string.reception_information));

            fragmentOnCard = new ReceptionInfoFragment();
            fragmentOnCard.setEnterTransition(new Fade());
            fragmentOnCard.setExitTransition(new Fade());

            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_guest_info, fragmentOnCard)
                    .commit();

        }
    }

    private ViewSwitcher.ViewFactory mFactory = new ViewSwitcher.ViewFactory() {
        @Override
        public View makeView() {
            return LayoutInflater.from(MainActivity.this).inflate(R.layout.component_title_switcher, null);
        }
    };
}
