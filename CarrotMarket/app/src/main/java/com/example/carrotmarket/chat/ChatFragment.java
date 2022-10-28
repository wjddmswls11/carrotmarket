package com.example.carrotmarket.chat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.carrotmarket.R;

import java.util.ArrayList;


public class ChatFragment extends Fragment {
    RecyclerView chat_recv;
    RecyclerView chat_recv2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_chat, container, false);
        chat_recv = v.findViewById(R.id.chat_recv);
        chat_recv2 = v.findViewById(R.id.chat_recv2);


        ArrayList<ChatDTO1> list = new ArrayList<>();
        list.add(new ChatDTO1(R.drawable.ic_account_circle_fill0_wght400_grad0_opsz48,R.drawable.char1, "qweasd", "운암동","3달 전","3333218537549"));
        list.add(new ChatDTO1(R.drawable.around_place,R.drawable.around_book,"쿨거래","신창동","3달전","프로필님이 이모티콘을 보냈어요"));
        list.add(new ChatDTO1(R.drawable.around_car,R.drawable.around_coupon,"쿨거래","신창동","3달전","프로필님이 이모티콘을 보냈어요"));


        ArrayList<ChatDTO2> list2 = new ArrayList<>();
        list2.add(new ChatDTO2(R.drawable.carrot_character,"당근이","9달 전","동네이웃님, 반갑습니당! 동네 이웃과 거래하..."));
        list2.add(new ChatDTO2(R.drawable.carrot_button,"당근이","9달 전","동네이웃님, 반갑습니당! 동네 이웃과 거래하..."));



        ChatAdapter adapter = new ChatAdapter(inflater, list);
        ChatAdapter2 adapter2 = new ChatAdapter2(inflater);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(
            getContext(),RecyclerView.VERTICAL,false
        );

        RecyclerView.LayoutManager manager1 = new LinearLayoutManager(
          getContext(),RecyclerView.HORIZONTAL,false
        );



        chat_recv.setAdapter(adapter);
        chat_recv.setLayoutManager(manager);
        chat_recv2.setAdapter(adapter2);
        chat_recv2.setLayoutManager(manager1);
        return v;
    }
}