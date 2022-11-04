package com.example.carrotmarket.around;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carrotmarket.R;

import java.util.ArrayList;

public class AroundAdapter2 extends RecyclerView.Adapter<AroundAdapter2.RecHolder>{

    LayoutInflater inflater;
    ArrayList<AroundDTO2> list1;

    public AroundAdapter2(LayoutInflater inflater, ArrayList<AroundDTO2> list1) {
        this.inflater = inflater;
        this.list1 = list1;
    }

    @NonNull
    @Override
    public RecHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_aroundfragment_coupon, parent, false);
        return new RecHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecHolder h, int i) {
        h.store1_1.setImageResource(list1.get(i).getStore1_1());
        h.store1_2.setImageResource(list1.get(i).getStore1_2());
        h.around_storename.setText(list1.get(i).getAround_storename());
        h.store_info.setText(list1.get(i).getStore_info());
        h.store_distance.setText(list1.get(i).getStore_distance());
        h.store_review1.setText(list1.get(i).getStore_review1());
        h.store_custom.setText(list1.get(i).getStore_custom());
        h.store_guest.setText(list1.get(i).getStore_guest());
        h.store_review2.setText(list1.get(i).getStore_review2());


    }

    @Override
    public int getItemCount() {
        return list1.size();
    }

    public class RecHolder extends RecyclerView.ViewHolder {
        ImageView store1_1, store1_2;
        TextView around_storename, store_info, store_distance, store_review1, store_custom, store_guest, store_review2;


        public RecHolder(@NonNull View v) {
            super(v);
            store1_1 = v.findViewById(R.id.store1_1);
            store1_2 = v.findViewById(R.id.store1_2);
            around_storename = v.findViewById(R.id.around_storename);
            store_info = v.findViewById(R.id.store_info);
            store_distance = v.findViewById(R.id.store_distance);
            store_review1 = v.findViewById(R.id.store_review1);
            store_custom = v.findViewById(R.id.store_custom);
            store_guest = v.findViewById(R.id.store_guest);
            store_review2 = v.findViewById(R.id.store_review2);

        }
    }



}
