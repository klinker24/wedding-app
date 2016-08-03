package xyz.klinker.wedding.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import xyz.klinker.wedding.R;
import xyz.klinker.wedding.data.Guest;
import xyz.klinker.wedding.listener.GuestClickListener;

public class GuestViewHolder extends RecyclerView.ViewHolder {

    private TextView name;
    private TextView table;

    private Guest guest;

    public GuestViewHolder(View itemView, final GuestClickListener listener) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.name);
        table = (TextView) itemView.findViewById(R.id.table);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onGuestClicked(GuestViewHolder.this);
            }
        });
    }

    public void bind(Guest guest) {
        this.guest = guest;

        name.setText(guest.getName());
        table.setText("Table Number: " + guest.getTable());
    }

    public Guest getGuest() {
        return guest;
    }
}
