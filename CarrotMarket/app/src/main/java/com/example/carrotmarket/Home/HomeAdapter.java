package com.example.carrotmarket.Home;

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

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.RecHolder>{

    LayoutInflater inflater;
    ArrayList<HomeDTO> list;
    Context context;
    public HomeAdapter(LayoutInflater inflater, ArrayList<HomeDTO> list, Context context) {
        this.inflater = inflater;
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = inflater.inflate(R.layout.item_homefragment,parent,false);

        return new RecHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecHolder h, @SuppressLint("RecyclerView") int i) {
            h.img_home.setImageResource(list.get(i).getImg_home());
            h.img_home_chat.setImageResource(list.get(i).getImg_home_chat());
            h.img_home_favorite.setImageResource(list.get(i).getImg_home_favorite());
            h.tv_home1.setText(list.get(i).getTv_home1());
            h.tv_home2.setText(list.get(i).getTv_home2());
            h.tv_home3.setText(list.get(i).getTv_home3());
            h.tv_home4.setText(list.get(i).getTv_home4());
            h.tv_home_chat.setText(list.get(i).getTv_home_chat());
            h.tv_home_favorite.setText(list.get(i).getTv_home_favorite());





            if(list.get(i).getTv_home_chat()=="0"){
                h.img_home_chat.setVisibility(View.INVISIBLE);
                h.tv_home_chat.setVisibility(View.INVISIBLE);
            }else{
                h.img_home_chat.setVisibility(View.VISIBLE);
                h.tv_home_chat.setVisibility(View.VISIBLE);
            }








            h.home_linear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, HomeActivity.class);

                    intent.putExtra("img_home",list.get(i).getImg_home());
                    intent.putExtra("img_home_chat",list.get(i).getImg_home_chat());
                    intent.putExtra("img_home_favorite",list.get(i).getImg_home_favorite());
                    intent.putExtra("tv_home1",list.get(i).getTv_home1());
                    intent.putExtra("tv_home2",list.get(i).getTv_home2());
                    intent.putExtra("tv_home3",list.get(i).getTv_home3());
                    intent.putExtra("tv_home4",list.get(i).getTv_home4());
                    intent.putExtra("tv_home_chat",list.get(i).getTv_home_chat());
                    intent.putExtra("tv_home_favorite",list.get(i).getTv_home_favorite());
                    intent.putExtra("img_home2",list.get(i).getImg_home2());
                    intent.putExtra("img_home3",list.get(i).getImg_hom3());
                    intent.putExtra("img_home4",list.get(i).getImg_home4());
                    intent.putExtra("profile_image",list.get(i).getProfile_image());
                    intent.putExtra("home_intenttxt1",list.get(i).getHome_intent_type());
                    intent.putExtra("home_intent_type",list.get(i).getHome_intent_type());
                    intent.putExtra("home_intent_contents",list.get(i).getHome_intent_contents());
                    intent.putExtra("home_intent_look",list.get(i).getHome_intent_look());


                    context.startActivity(intent);
                }
            });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class RecHolder extends RecyclerView.ViewHolder {
        ImageView img_home, img_home_chat,img_home_favorite,home_intentimg1,home_intentimg2,home_intentimg3;
        TextView tv_home1,tv_home2,tv_home3,tv_home4,tv_home_chat,tv_home_favorite, home_intent_look;
        LinearLayout home_linear;
        public RecHolder(@NonNull View v) {
            super(v);
            img_home = v.findViewById(R.id.img_home);
            img_home_chat = v.findViewById(R.id.img_home_chat);
            img_home_favorite = v.findViewById(R.id.img_home_favorite);
            tv_home1 = v.findViewById(R.id.tv_home1);
            tv_home2 = v.findViewById(R.id.tv_home2);
            tv_home3 = v.findViewById(R.id.tv_home3);
            tv_home4 = v.findViewById(R.id.tv_home4);
            tv_home_chat = v.findViewById(R.id.tv_home_chat);
            tv_home_favorite = v.findViewById(R.id.tv_home_favorite);
            home_linear =v.findViewById(R.id.home_linear);

            home_intentimg1 = v.findViewById(R.id.home_intentimg1);
            home_intentimg2 = v.findViewById(R.id.home_intentimg2);
            home_intentimg3 = v.findViewById(R.id.home_intentimg3);

            home_intent_look = v.findViewById(R.id.home_intent_look);


        }
    }



}
