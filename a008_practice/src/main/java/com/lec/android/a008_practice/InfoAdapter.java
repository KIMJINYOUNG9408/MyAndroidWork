package com.lec.android.a008_practice;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.ViewHolder> {

    List<Info>  items = new ArrayList<Info>();

    static InfoAdapter adapter;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvAge,tvName,tvAddress;
        ImageButton btnDelItem;
        Switch swOnOff;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvAge = itemView.findViewById(R.id.tvAge);
            tvAddress = itemView.findViewById(R.id.tvAddress);
            tvName = itemView.findViewById(R.id.tvName);
            btnDelItem = itemView.findViewById(R.id.btnDelItem);
            swOnOff = itemView.findViewById(R.id.swOnOff);

            swOnOff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        tvAddress.setVisibility(View.INVISIBLE);
                        tvAge.setVisibility(View.INVISIBLE);
                    } else {
                        tvAddress.setVisibility(View.VISIBLE);
                        tvAge.setVisibility(View.VISIBLE);
                    }
                }
            });

            btnDelItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    adapter.removeItem(getAdapterPosition());
                    adapter.notifyDataSetChanged();
                }
            });

        }
    }


    public void addItem(Info item) {  items.add(item); }
    public void addItem(int position, Info item) {   items.add(position, item);}
    public void setItems(ArrayList<Info> items) {   this.items = items;}
    public Info getItem(int position) {   return items.get(position);}
    public void setItem(int position, Info item) {   items.set(position, item); }
    public void removeItem(int position){ items.remove(position); }

}
