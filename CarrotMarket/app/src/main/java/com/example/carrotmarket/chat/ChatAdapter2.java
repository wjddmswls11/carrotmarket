package com.example.carrotmarket.chat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carrotmarket.R;

import java.util.ArrayList;

public class ChatAdapter2 extends RecyclerView.Adapter<ChatAdapter2.RecHolder>{
    LayoutInflater inflater;
    ArrayList<ChatDTO2> list2;

    public ChatAdapter2(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public RecHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.itm_chatfragment2,parent,false);
        return new RecHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class RecHolder extends RecyclerView.ViewHolder{

        public RecHolder(@NonNull View itemView) {
            super(itemView);
        }
    }



}
