package com.lec.android.a008_practice;

import android.content.Intent;
import android.view.LayoutInflater;
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

    List<Info> items = new ArrayList<Info>();

    static InfoAdapter adapter;

    public InfoAdapter() { // 기본 생성자
        this.adapter = this;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inf = LayoutInflater.from(parent.getContext());

        View itemView =  inf.inflate(R.layout.item,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Info item = items.get(position); // arrayList 에서 가져오기
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvAge,tvName,tvAddress;
        ImageButton btnDelItem;
        Switch swOnOff;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tvName);
            tvAge = itemView.findViewById(R.id.tvAge);
            tvAddress = itemView.findViewById(R.id.tvAddress);

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

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();

                    Intent intent = new Intent(v.getContext(),InfoDetail.class);

                    intent.putExtra("info",adapter.getItem(position));
                    v.getContext().startActivity(intent);
                }
            });

        }

        public void setItem(Info item){
            tvName.setText(item.getName());
            tvAge.setText(item.getAge());
            tvAddress.setText(item.getAddress());
        }
    }


    public void addItem(Info item) {  items.add(item); }
    public void addItem(int position, Info item) {   items.add(position, item);}
    public void setItems(ArrayList<Info> items) {   this.items = items;}
    public Info getItem(int position) {   return items.get(position);}
    public void setItem(int position, Info item) {   items.set(position, item); }
    public void removeItem(int position){ items.remove(position); }

}
