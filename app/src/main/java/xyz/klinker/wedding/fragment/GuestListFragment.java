package xyz.klinker.wedding.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import xyz.klinker.wedding.R;
import xyz.klinker.wedding.adapter.GuestAdapter;
import xyz.klinker.wedding.adapter.GuestViewHolder;
import xyz.klinker.wedding.listener.GuestClickListener;
import xyz.klinker.wedding.listener.OnSearchTextChanged;

public class GuestListFragment extends Fragment implements GuestClickListener {

    private EditText search;
    private RecyclerView recycler;

    private OnSearchTextChanged textWatcher;
    private GuestAdapter adapter;

    private Fragment infoFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_guest_search, container, false);

        adapter = new GuestAdapter(getActivity(), this);

        search = (EditText) root.findViewById(R.id.search);
        recycler = (RecyclerView) root.findViewById(R.id.recycler);

        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        recycler.setAdapter(adapter);

        textWatcher = new OnSearchTextChanged(this);
        search.addTextChangedListener(textWatcher);

        resetReceptionDetailsFragment();

        return root;
    }

    @Override
    public void onGuestClicked(GuestViewHolder holder) {
        if (infoFragment instanceof ReceptionInfoFragment) {
            getActivity().setTitle(getString(R.string.seating_information));
        }

        infoFragment = GuestInfoFragment.getInstance(holder.getGuest());
        infoFragment.setEnterTransition(new Fade());
        infoFragment.setExitTransition(new Fade());

        getActivity().getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_seating_info, infoFragment)
                .commit();

        textWatcher.ignoreResetText();
        search.setText("");

        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(search.getWindowToken(), 0);
    }

    public void resetReceptionDetailsFragment() {
        if (!(infoFragment instanceof ReceptionInfoFragment)) {
            getActivity().setTitle(getString(R.string.reception_information));

            infoFragment = new ReceptionInfoFragment();
            infoFragment.setEnterTransition(new Fade());
            infoFragment.setExitTransition(new Fade());

            getActivity().getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_seating_info, infoFragment)
                    .commit();

        }
    }

    public GuestAdapter getAdapter() {
        return adapter;
    }
}
