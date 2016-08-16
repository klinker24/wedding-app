package xyz.klinker.wedding.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import xyz.klinker.wedding.R;
import xyz.klinker.wedding.activity.MainActivity;
import xyz.klinker.wedding.data.Guest;
import xyz.klinker.wedding.data.ImageConstants;

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
    private TextView otherGuestsColOne;
    private TextView otherGuestsColTwo;

    private Guest guest;
    private List<Guest> otherGuests;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_guest_info, container, false);

        int guestId = getArguments().getInt(ARG_GUEST_ID);
        guest = Guest.findById(guestId);
        otherGuests = Guest.listByTableAndExclude(guest.getTable(), guest);

        name = (TextView) root.findViewById(R.id.name);
        table = (TextView) root.findViewById(R.id.table);
        otherGuestsColOne = (TextView) root.findViewById(R.id.other_guests_column_1);
        otherGuestsColTwo = (TextView) root.findViewById(R.id.other_guests_column_2);

        name.setText(guest.getName());
        table.setText(getString(R.string.table_number).replace("%s", guest.getTable() + ""));

        setupOtherGuests();

        ImageView seatingChart = (ImageView) root.findViewById(R.id.seating_chart);
        Glide.with(getActivity()).load(ImageConstants.SEATING_CHART_URL).fitCenter().into(seatingChart);

        return root;
    }

    private void setupOtherGuests() {
        int sizes = otherGuests.size() / 2;

        List<Guest> listOne = otherGuests.subList(0, sizes);
        List<Guest> listTwo = otherGuests.subList(sizes, otherGuests.size());

        if (listOne.size() < listTwo.size()) {
            List<Guest> temp = listTwo;
            listTwo = listOne;
            listOne = temp;
        }

        String columnOne = "";
        String columnTwo = "";

        for (int i = 0; i < listOne.size(); i++) {
            Guest guest = listOne.get(i);

            if (i == listOne.size() - 1) {
                columnOne += "•  " + guest.getName();
            } else {
                columnOne += "•  " + guest.getName() + "\n";
            }
        }

        for (int i = 0; i < listTwo.size(); i++) {
            Guest guest = listTwo.get(i);

            if (i == listTwo.size() - 1) {
                columnTwo += "•  " + guest.getName();
            } else {
                columnTwo += "•  " + guest.getName() + "\n";
            }
        }

        otherGuestsColOne.setText(columnOne);
        otherGuestsColTwo.setText(columnTwo);
    }
}
