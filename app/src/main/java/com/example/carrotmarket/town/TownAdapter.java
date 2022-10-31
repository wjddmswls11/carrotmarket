package com.example.carrotmarket.town;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carrotmarket.R;

import java.util.ArrayList;

public class TownAdapter extends RecyclerView.Adapter<TownAdapter.RecHolder>{
    LayoutInflater inflater;
    ArrayList<TownDTO> list;
    Context context;

    public TownAdapter(LayoutInflater inflater, ArrayList<TownDTO> list, Context context) {
        this.inflater = inflater;
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_townfragment,parent,false);

        return new RecHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecHolder h, int i) {

        h.img_town_map.setImageResource(list.get(i).getImg_town_map());
        h.img_town_talk.setImageResource(list.get(i).getImg_town_talk());

        h.tv_town_btn.setText(list.get(i).getTv_town_btn());
        h.tv_town_orange.setText(list.get(i).getTv_town_orange());
        h.tv_town_conten.setText(list.get(i).getTv_town_conten());
        h.tv_town_load.setText(list.get(i).getTv_town_load());
        h.tv_town_time.setText(list.get(i).getTv_town_time());
        h.tv_town_question.setText(list.get(i).getTv_town_question());
        h.tv_town_answer.setText(list.get(i).getTv_town_answer());






    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecHolder extends RecyclerView.ViewHolder {
        ImageView img_town_map, img_town_talk;
        TextView tv_town_btn, tv_town_orange, tv_town_conten, tv_town_id, tv_town_load, tv_town_time, tv_town_question, tv_town_answer;


        public RecHolder(@NonNull View v) {
            super(v);
            img_town_map = v.findViewById(R.id.img_towm_map);
            img_town_talk = v.findViewById(R.id.img_town_talk);

            tv_town_btn = v.findViewById(R.id.tv_town_btn);
            tv_town_orange = v.findViewById(R.id.tv_town_orange);
            tv_town_conten = v.findViewById(R.id.tv_town_conten);
            tv_town_id = v.findViewById(R.id.tv_town_id);
            tv_town_load = v.findViewById(R.id.tv_town_load);
            tv_town_time = v.findViewById(R.id.tv_town_time);
            tv_town_question = v.findViewById(R.id.tv_town_question);
            tv_town_answer = v.findViewById(R.id.tv_town_answer);



        }
    }




}
