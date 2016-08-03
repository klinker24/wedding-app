package xyz.klinker.wedding.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import xyz.klinker.wedding.R;
import xyz.klinker.wedding.activity.MainActivity;
import xyz.klinker.wedding.adapter.GuestAdapter;
import xyz.klinker.wedding.listener.OnSearchTextChanged;

public class GuestListFragment extends Fragment {

    private MainActivity activity;

    private EditText search;
    private RecyclerView recycler;

    private OnSearchTextChanged textWatcher;
    private GuestAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_guest_search, container, false);

        activity = (MainActivity) getActivity();

        adapter = new GuestAdapter(activity);

        search = (EditText) root.findViewById(R.id.search);
        recycler = (RecyclerView) root.findViewById(R.id.recycler);

        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        recycler.setAdapter(adapter);

        textWatcher = new OnSearchTextChanged(activity, this);
        search.addTextChangedListener(textWatcher);

        activity.resetToReceptionInfo();

        return root;
    }

    public void setSearchText(String text) {
        textWatcher.ignoreNextTextChange();
        search.setText(text);
    }

    public GuestAdapter getAdapter() {
        return adapter;
    }
}
