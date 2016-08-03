package xyz.klinker.wedding.listener;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

import xyz.klinker.wedding.adapter.GuestAdapter;
import xyz.klinker.wedding.fragment.GuestFragment;

public class OnSearchTextChanged implements TextWatcher {

    private GuestFragment fragment;
    private GuestAdapter adapter;

    private boolean ignoreNext = false;

    public OnSearchTextChanged(GuestFragment fragment) {
        this.adapter = fragment.getAdapter();
        this.fragment = fragment;
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
            fragment.resetReceptionDetailsFragment();
        } else {
            ignoreNext = false;
        }

        if (charSequence == null || TextUtils.isEmpty(charSequence)) {
            adapter.loadAllGuests();
        } else {
            adapter.loadSearch(charSequence.toString());
        }

    }

    public void ignoreResetText() {
        ignoreNext = true;
    }
}
