package com.example.carrotmarket.around;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carrotmarket.R;

import java.util.ArrayList;

public class AroundAdapter3 extends RecyclerView.Adapter<AroundAdapter3.RecHolder>{

    LayoutInflater inflater;
    ArrayList<AroundDTO3> list3;
    Context context;

    public AroundAdapter3(LayoutInflater inflater, ArrayList<AroundDTO3> list3, Context context) {
        this.inflater = inflater;
        this.list3 = list3;
        this.context = context;
    }

    @NonNull
    @Override
    public RecHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_aroundfragment_coupon2,parent,false);
        return new RecHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecHolder h, @SuppressLint("RecyclerView") int i) {
        h.around_coupon.setImageResource(list3.get(i).getAround_coupon());
        h.around_coupon_perimgper.setImageResource(list3.get(i).getAround_coupon_perimgper());
        h.around_coupon_shopname.setText(list3.get(i).getAround_coupon_shopname());
        h.around_coupon_distance.setText(list3.get(i).getAround_coupon_distance());
        h.arouond_coupon_info.setText(list3.get(i).getArouond_coupon_info());
        h.around_coupon_person.setText(list3.get(i).getAround_coupon_person());
        h.coupon_guest.setText(list3.get(i).getCoupon_guest());
        h.coupon_review.setText(list3.get(i).getCoupon_review());

        h.popup_coupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AroundCouponActivity.class);
                intent.putExtra("around_coupon_shopname",list3.get(i).getAround_coupon_shopname());

                context.startActivity(intent);



            }
        });



    }

    @Override
    public int getItemCount() {
        return list3.size();
    }

    public class RecHolder extends RecyclerView.ViewHolder {
        ImageView around_coupon, around_coupon_perimgper;
        TextView around_coupon_shopname, around_coupon_distance, arouond_coupon_info, around_coupon_person, coupon_guest, coupon_review;
        LinearLayout popup_coupon;

        public RecHolder(@NonNull View v) {
            super(v);
            around_coupon = v.findViewById(R.id.around_coupon);
            around_coupon_perimgper = v.findViewById(R.id.around_coupon_perimgper);
            around_coupon_shopname = v.findViewById(R.id.around_coupon_shopname);
            around_coupon_distance = v.findViewById(R.id.around_coupon_distance);
            arouond_coupon_info = v.findViewById(R.id.arouond_coupon_info);
            around_coupon_person = v.findViewById(R.id.around_coupon_person);
            coupon_guest = v.findViewById(R.id.coupon_guest);
            coupon_review = v.findViewById(R.id.coupon_review);
            popup_coupon = v.findViewById(R.id.popup_coupon);
        }
    }






}
