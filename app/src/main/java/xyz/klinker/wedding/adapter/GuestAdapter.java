package xyz.klinker.wedding.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import xyz.klinker.wedding.R;
import xyz.klinker.wedding.activity.MainActivity;
import xyz.klinker.wedding.data.Guest;
import xyz.klinker.wedding.listener.GuestClickListener;

public class GuestAdapter extends RecyclerView.Adapter<GuestViewHolder> {

    private MainActivity context;
    private GuestClickListener listener;

    private List<Guest> guests = new ArrayList<>();

    public GuestAdapter(MainActivity context) {
        this.context = context;
        this.listener = context;

        loadAllGuests();
    }

    @Override
    public GuestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.adapter_item_guest, parent, false);
        return new GuestViewHolder(root, listener);
    }

    @Override
    public void onBindViewHolder(GuestViewHolder holder, int position) {
        holder.bind(guests.get(position));
    }

    @Override
    public int getItemCount() {
        return guests.size();
    }

    public void loadAllGuests() {
        guests.clear();
        guests.addAll(Guest.list());

        notifyDataSetChanged();
    }

    public void loadSearch(String search) {
        guests.clear();
        guests.addAll(Guest.listBySearch(search));

        notifyDataSetChanged();
    }
}
