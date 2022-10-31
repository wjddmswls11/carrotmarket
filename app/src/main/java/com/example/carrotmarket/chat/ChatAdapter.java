package com.example.carrotmarket.chat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carrotmarket.R;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.RecHolder>{
    LayoutInflater inflater;
    ArrayList<ChatDTO1> list;

    public ChatAdapter(LayoutInflater inflater, ArrayList<ChatDTO1> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public RecHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_chatfragment,parent,false);
        return new RecHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecHolder h, int i) {
        h.img_chat.setImageResource(list.get(i).getImg_chat());
        h.chat_pro.setImageResource(list.get(i).getChat_pro());
        h.chat_id.setText(list.get(i).getChat_id());
        h.chat_town.setText(list.get(i).getChat_town());
        h.chat_time.setText(list.get(i).getChat_time());
        h.chat_con.setText(list.get(i).getChat_con());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecHolder extends RecyclerView.ViewHolder{
        ImageView img_chat, chat_pro;
        TextView chat_id, chat_town, chat_time, chat_con;

        public RecHolder(@NonNull View v) {
            super(v);
            img_chat = v.findViewById(R.id.img_chat);
            chat_pro = v.findViewById(R.id.chat_pro);
            chat_id = v.findViewById(R.id.chat_id);
            chat_town = v.findViewById(R.id.chat_town);
            chat_time = v.findViewById(R.id.chat_time);
            chat_con = v.findViewById(R.id.chat_con);


        }
    }







}
