package com.example.carrotmarket.town;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carrotmarket.R;

public class TownAdapter extends RecyclerView.Adapter<TownAdapter.RecHolder>{
    LayoutInflater inflater;

    public TownAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public RecHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_townfragment,parent,false);

        return new RecHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class RecHolder extends RecyclerView.ViewHolder {

        public RecHolder(@NonNull View itemView) {
            super(itemView);
        }
    }




}
