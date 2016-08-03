package xyz.klinker.wedding.listener;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

import xyz.klinker.wedding.activity.MainActivity;
import xyz.klinker.wedding.adapter.GuestAdapter;
import xyz.klinker.wedding.fragment.GuestListFragment;

public class OnSearchTextChanged implements TextWatcher {

    private MainActivity activity;
    private GuestAdapter adapter;

    private boolean ignoreNext = false;

    public OnSearchTextChanged(MainActivity activity, GuestListFragment fragment) {
        this.adapter = fragment.getAdapter();
        this.activity = activity;
    }

    // region TextWatcher methods
    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
    // endregion

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        if (!ignoreNext) {
            activity.resetToReceptionInfo();
        } else {
            ignoreNext = false;
        }

        if (charSequence == null || TextUtils.isEmpty(charSequence.toString().replace(" ", ""))) {
            adapter.loadAllGuests();
        } else {
            adapter.loadSearch(charSequence.toString());
        }

    }

    public void ignoreNextTextChange() {
        ignoreNext = true;
    }
}
