package com.example.carrotmarket.chat;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.carrotmarket.R;

import java.util.ArrayList;

public class ChatAdapter2 extends BaseAdapter {
    LayoutInflater inflater;
    ArrayList<ChatDTO2> list2;
    Context context;

    public ChatAdapter2(LayoutInflater inflater, ArrayList<ChatDTO2> list2, Context context) {
        this.inflater = inflater;
        this.list2 = list2;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list2.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View v, ViewGroup parent) {
        v = inflater.inflate(R.layout.item_chatfragment2, parent, false);
        ImageView img_chat_carrot = v.findViewById(R.id.img_chat_carrot);
        ImageView chat_greencheck = v.findViewById(R.id.chat_greencheck);
        TextView chat_carrot = v.findViewById(R.id.chat_carrot);
        TextView chat_carrot_cont = v.findViewById(R.id.chat_carrot_cont);
        RelativeLayout chat_carrot_relative = v.findViewById(R.id.chat_carrot_relative);

        img_chat_carrot.setImageResource(list2.get(i).getImg_chat_carrot());
        chat_greencheck.setImageResource(list2.get(i).getChat_greencheck());
        chat_carrot.setText(list2.get(i).getChat_carrot());
        chat_carrot_cont.setText(list2.get(i).getChat_carrot_cont());

        chat_carrot_relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ChatActivity.class);
                intent.putExtra("img_chat_carrot",list2.get(i).getImg_chat_carrot());
                intent.putExtra("chat_greencheck",list2.get(i).getChat_greencheck());
                intent.putExtra("chat_carrot",list2.get(i).getChat_carrot());
                intent.putExtra("chat_carrot_cont",list2.get(i).getChat_carrot_cont());

                context.startActivity(intent);

            }
        });

        return v;
    }
}
