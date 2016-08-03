package xyz.klinker.wedding.listener;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;

import xyz.klinker.wedding.adapter.GuestAdapter;

public class OnSearchTextChanged implements TextWatcher {

    private GuestAdapter adapter;

    public OnSearchTextChanged(GuestAdapter adapter) {
        this.adapter = adapter;
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
        if (charSequence == null || TextUtils.isEmpty(charSequence)) {
            adapter.loadAllGuests();
        } else {
            adapter.loadSearch(charSequence.toString());
        }
    }
}
