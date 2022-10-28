package com.example.carrotmarket.Home;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.carrotmarket.R;
import com.example.carrotmarket.carrot.FavoriteDTO;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    ActionBar actionBar;
    ImageView home_intentimg1,home_intentimg2,home_intentimg3, home_intentimg4, profile_image, home_intent_favorite;
    TextView home_intenttitle, home_intenttxt2,home_intent_time, home_intent_favor, home_intenttxt1, home_intent_type,home_intent_contents, home_intent_look;

    public static ArrayList<FavoriteDTO> fav_list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        actionBar = getSupportActionBar();
        actionBar.hide();


        home_intentimg1 = findViewById(R.id.home_intentimg1);
        home_intenttitle = findViewById(R.id.home_intenttitle);
        home_intenttxt2 = findViewById(R.id.home_intenttxt2);
        home_intent_time = findViewById(R.id.home_intent_time);
        home_intent_favor = findViewById(R.id.home_intent_favor);


        home_intentimg2 = findViewById(R.id.home_intentimg2);
        home_intentimg3 = findViewById(R.id.home_intentimg3);
        home_intentimg4 = findViewById(R.id.home_intentimg4);
        profile_image = findViewById(R.id.profile_image);
        home_intenttxt1 = findViewById(R.id.home_intenttxt1);
        home_intent_type = findViewById(R.id.home_intent_type);
        home_intent_contents = findViewById(R.id.home_intent_contents);
        home_intent_look = findViewById(R.id.home_intent_look);

        home_intent_favorite = findViewById(R.id.home_intent_favorite);

        home_intentimg1.setImageResource(getIntent().getIntExtra("img_home",0));
        home_intenttitle.setText(getIntent().getStringExtra("tv_home1"));
        home_intenttxt2.setText(getIntent().getStringExtra("tv_home2"));
        home_intent_time.setText(getIntent().getStringExtra("tv_home3"));
        home_intent_favor.setText(getIntent().getStringExtra("tv_home_favorite"));

        home_intentimg2.setImageResource(getIntent().getIntExtra("img_home2",0));
        home_intentimg3.setImageResource(getIntent().getIntExtra("img_home3",0));
        home_intentimg4.setImageResource(getIntent().getIntExtra("img_home4",0));
        profile_image.setImageResource(getIntent().getIntExtra("profile_image",0));

        home_intenttxt1.setText(getIntent().getStringExtra("home_intenttxt1"));
        home_intent_type.setText(getIntent().getStringExtra("home_intent_type"));
        home_intent_contents.setText(getIntent().getStringExtra("home_intent_contents"));
        home_intent_look.setText(getIntent().getStringExtra("home_intent_look"));


        if(getIntent().getIntExtra("img_home2",0) == 0) {
            home_intentimg2.setVisibility(View.INVISIBLE);
        }else if(getIntent().getIntExtra("img_home3",0) == 0){
            home_intentimg3.setVisibility(View.INVISIBLE);
        }else if(getIntent().getIntExtra("img_home4",0) == 0) {
            home_intentimg4.setVisibility(View.INVISIBLE);
        }else{
            home_intentimg2.setVisibility(View.VISIBLE);
            home_intentimg3.setVisibility(View.VISIBLE);
            home_intentimg4.setVisibility(View.VISIBLE);
        }


        home_intent_favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home_intent_favorite.setImageResource(R.drawable.ic_baseline_heart);

            }

        });




    }
}