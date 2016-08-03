package xyz.klinker.wedding.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import xyz.klinker.wedding.R;
import xyz.klinker.wedding.data.Guest;

public class GuestInfoFragment extends Fragment {

    private static final String ARG_GUEST_ID = "arg_guest_id";
    public static GuestInfoFragment getInstance(Guest guest) {
        Bundle args = new Bundle();
        args.putInt(ARG_GUEST_ID, guest.getId());

        GuestInfoFragment fragment = new GuestInfoFragment();
        fragment.setArguments(args);
        return fragment;
    }

    private TextView name;
    private TextView table;

    private Guest guest;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_guest_info, container, false);

        int guestId = getArguments().getInt(ARG_GUEST_ID);
        guest = Guest.findById(guestId);

        name = (TextView) root.findViewById(R.id.name);
        table = (TextView) root.findViewById(R.id.table);

        name.setText(guest.getName());
        table.setText(getString(R.string.table_number).replace("%s", guest.getTable() + ""));

        return root;
    }
}
