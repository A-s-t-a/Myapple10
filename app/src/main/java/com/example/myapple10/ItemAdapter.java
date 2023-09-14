package com.example.myapple10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.item>{

    private List<Item> itemList;
    private Context context;

    public ItemAdapter(Context context){
        this.context = context;
    }

    public void setDate(List<Item>itemList){
        this.itemList = itemList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public item onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new item((LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false)));
    }

    @Override
    public void onBindViewHolder(@NonNull item holder, int position) {
        Item item = itemList.get(position);
        holder.imageView.setImageResource(item.getImage());
        holder.textView.setText(item.getTittle());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class item extends RecyclerView.ViewHolder{


        ImageView imageView;
        TextView textView;



        public item(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_list);
            textView = itemView.findViewById(R.id.tittle_list);
        }
    }


}
