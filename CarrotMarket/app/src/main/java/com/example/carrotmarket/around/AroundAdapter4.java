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

public class AroundAdapter4 extends RecyclerView.Adapter<AroundAdapter4.RecHolder>{
    LayoutInflater inflater;
    ArrayList<AroundDTO4> list4;

    public AroundAdapter4(LayoutInflater inflater, ArrayList<AroundDTO4> list4) {
        this.inflater = inflater;
        this.list4 = list4;
    }

    @NonNull
    @Override
    public RecHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_aroundfragmentmini,parent,false);
        return new RecHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecHolder h, int i) {
        h.around_mini_img.setImageResource(list4.get(i).getAround_mini_img());
        h.around_mini_perimgper.setImageResource(list4.get(i).getAround_mini_perimgper());
        h.mini_title.setText(list4.get(i).getMini_title());
        h.mini_title_detail.setText(list4.get(i).getMini_title_detail());
        h.around_mini_star.setText(list4.get(i).getAround_mini_star());
        h.aound_mini_review.setText(list4.get(i).getAound_mini_review());
        h.around_mini_whitedetail.setText(list4.get(i).getAround_mini_whitedetail());
        h.around_mini_reviewtxt.setText(list4.get(i).getAround_mini_reviewtxt());
    }

    @Override
    public int getItemCount() {
        return list4.size();
    }

    public class RecHolder extends RecyclerView.ViewHolder{
        ImageView around_mini_img, around_mini_perimgper;
        TextView mini_title, mini_title_detail, around_mini_star, aound_mini_review,around_mini_whitedetail,around_mini_reviewtxt;
        public RecHolder(@NonNull View v) {
            super(v);
            around_mini_img = v.findViewById(R.id.around_mini_img);
            around_mini_perimgper = v.findViewById(R.id.around_mini_perimgper);
            mini_title = v.findViewById(R.id.mini_title);
            mini_title_detail = v.findViewById(R.id.mini_title_detail);
            around_mini_star = v.findViewById(R.id.around_mini_star);
            aound_mini_review = v.findViewById(R.id.aound_mini_review);
            around_mini_whitedetail = v.findViewById(R.id.around_mini_whitedetail);
            around_mini_reviewtxt = v.findViewById(R.id.around_mini_reviewtxt);
        }

    }





}
