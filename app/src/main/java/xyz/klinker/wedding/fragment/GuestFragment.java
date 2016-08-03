package xyz.klinker.wedding.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import xyz.klinker.wedding.R;
import xyz.klinker.wedding.adapter.GuestAdapter;
import xyz.klinker.wedding.adapter.GuestViewHolder;
import xyz.klinker.wedding.listener.GuestClickListener;
import xyz.klinker.wedding.listener.OnSearchTextChanged;

public class GuestFragment extends Fragment implements GuestClickListener {

    private EditText search;
    private RecyclerView recycler;

    private GuestAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_guest_search, container, false);

        adapter = new GuestAdapter(getActivity(), this);

        search = (EditText) root.findViewById(R.id.search);
        recycler = (RecyclerView) root.findViewById(R.id.recycler);

        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        recycler.setAdapter(adapter);

        search.addTextChangedListener(new OnSearchTextChanged(adapter));

        return root;
    }

    @Override
    public void onGuestClicked(GuestViewHolder holder) {
        ReceptionInformationFragment fragment = ReceptionInformationFragment.getInstance(holder.getGuest());
        fragment.setEnterTransition(new Fade());
        fragment.setExitTransition(new Fade());

        getActivity().getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_seating_info, fragment)
                .commit();

        search.setText("");
    }
}
