package xyz.klinker.wedding.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import xyz.klinker.wedding.R;
import xyz.klinker.wedding.activity.MainActivity;

public class ReceptionInfoFragment extends Fragment {

    private static final String IMAGE_URL = "https://s32.postimg.org/7zhj7edad/095.jpg";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_reception_info, container, false);

        ImageView header = (ImageView) root.findViewById(R.id.header_image);
        TextView receptionInfo = (TextView) root.findViewById(R.id.reception_information);

        header.setClipToOutline(true);
        Glide.with(getActivity()).load(IMAGE_URL).centerCrop().into(header);
        receptionInfo.setText(Html.fromHtml("<b>Thanks for coming!</b><br><br>" +
                "We are delighted that you could share this special day with us! Enjoy your evening, here is a rough schedule for the night:"));

        return root;
    }
}
