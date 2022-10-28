package com.example.carrotmarket.carrot;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carrotmarket.R;

import java.util.ArrayList;

public class CarrotAdapter extends BaseAdapter {

    LayoutInflater inflater;
    Context context;
    ArrayList<CarrotDTO> list;

    public CarrotAdapter(LayoutInflater inflater, Context context, ArrayList<CarrotDTO> list) {
        this.inflater = inflater;
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View v, ViewGroup parent) {

       v = inflater.inflate(R.layout.item_carrotfragment,parent,false);
       ImageView carrot_favor = v.findViewById(R.id.carrot_favor);
       ImageView carrot_img_profile = v.findViewById(R.id.carrot_img_profile);

       carrot_favor.setImageResource(list.get(i).getCarrot_favor());
       carrot_img_profile.setImageResource(list.get(i).getCarrot_img_profile());

        carrot_favor.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(context, FavoriteActivity.class);

               context.startActivity(intent);

           }
       });





        return v;
    }
}
