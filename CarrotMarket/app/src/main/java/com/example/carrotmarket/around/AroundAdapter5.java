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

public class AroundAdapter5 extends RecyclerView.Adapter<AroundAdapter5.RecHolder>{
    LayoutInflater inflater;
    ArrayList<AroundDTO5> list5;
    int favimg = 0;

    public AroundAdapter5(LayoutInflater inflater, ArrayList<AroundDTO5> list5) {
        this.inflater = inflater;
        this.list5 = list5;
    }

    @NonNull
    @Override
    public RecHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_aroundfragment_shop, parent, false);
        return new RecHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecHolder h, int i) {
        h.around_shopimg.setImageResource(list5.get(i).getAround_shopimg());
        h.around_shop_favimg.setImageResource(list5.get(i).getAround_shop_favimg());
        h.around_shop_shopname.setText(list5.get(i).getAround_shop_shopname());
        h.around_shop_load.setText(list5.get(i).getAround_shop_load());
        h.around_shop_product.setText(list5.get(i).getAround_shop_product());
        h.around_shop_percent.setText(list5.get(i).getAround_shop_percent());
        h.around_shop_won.setText(list5.get(i).getAround_shop_won());
        h.around_shop_like.setText(list5.get(i).getAround_shop_like());

        h.around_shop_favimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(favimg == 0){
                    h.around_shop_favimg.setImageResource(R.drawable.ic_baseline_favorite_24);
                    favimg++;
                }else{
                    h.around_shop_favimg.setImageResource(R.drawable.ic_favorite_fill0_wght400_grad0_opsz48);
                    favimg--;
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return list5.size();
    }

    public class RecHolder extends RecyclerView.ViewHolder{
        ImageView around_shopimg, around_shop_favimg;
        TextView around_shop_shopname, around_shop_load, around_shop_product, around_shop_percent, around_shop_won, around_shop_like;
        public RecHolder(@NonNull View v) {
            super(v);
            around_shopimg = v.findViewById(R.id.around_shopimg);
            around_shop_favimg = v.findViewById(R.id.around_shop_favimg);
            around_shop_shopname = v.findViewById(R.id.around_shop_shopname);
            around_shop_load = v.findViewById(R.id.around_shop_load);
            around_shop_product = v.findViewById(R.id.around_shop_product);
            around_shop_percent = v.findViewById(R.id.around_shop_percent);
            around_shop_won = v.findViewById(R.id.around_shop_won);
            around_shop_like = v.findViewById(R.id.around_shop_like);
        }
    }



}
