package com.example.carrotmarket.around;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carrotmarket.R;

import java.util.ArrayList;

public class AroundAdapter extends RecyclerView.Adapter<AroundAdapter.RecHolder>{

    LayoutInflater inflater;
    ArrayList<AroundDTO> list;

    public AroundAdapter(LayoutInflater inflater, ArrayList<AroundDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public RecHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_aroundfragment, parent, false);


        return new RecHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecHolder h, int i) {
        h.around_img_first.setImageResource(list.get(i).getAround_img_first());
        h.around_txt_first.setText(list.get(i).getAround_txt_first());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecHolder extends RecyclerView.ViewHolder {
        ImageView around_img_first;
        TextView around_txt_first;
        public RecHolder(@NonNull View v) {
            super(v);
            around_img_first = v.findViewById(R.id.aound_img_first);
            around_txt_first = v.findViewById(R.id.around_txt_first);


        }
    }












}
