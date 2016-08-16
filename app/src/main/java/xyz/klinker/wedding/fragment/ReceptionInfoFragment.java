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
import xyz.klinker.wedding.data.ImageConstants;
import xyz.klinker.wedding.util.ListTagHandler;
import xyz.klinker.wedding.data.WelcomeMessage;

public class ReceptionInfoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_reception_info, container, false);

        ImageView header = (ImageView) root.findViewById(R.id.header_image);
        TextView receptionInfo = (TextView) root.findViewById(R.id.reception_information);

        header.setClipToOutline(true);
        Glide.with(getActivity()).load(ImageConstants.HERO_IMAGE_URL).centerCrop().into(header);
        receptionInfo.setText(Html.fromHtml(WelcomeMessage.MESSAGE, null, new ListTagHandler()));

        return root;
    }
}
