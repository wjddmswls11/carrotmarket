package com.example.carrotmarket.Home;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.carrotmarket.R;

public class HomeActivity extends AppCompatActivity {
    ImageView home_intentimg1,home_intentimg2,home_intentimg3, home_intentimg4, profile_image, home_intent_favorite, img_home_grid1, img_home_grid2, img_home_grid3, img_home_grid4;
    TextView home_intenttitle, home_intenttxt2,home_intent_time, home_intent_favor, home_intenttxt1, home_intent_type,home_intent_contents, home_intent_look, txt_home_grid1, txt_home_grid2, txt_home_grid3, txt_home_grid4, txt_home_grid5, txt_home_grid6, txt_home_grid7, txt_home_grid8;
    ActionBar actionBar;

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

        img_home_grid1 = findViewById(R.id.img_home_grid1);
        img_home_grid2 = findViewById(R.id.img_home_grid2);
        img_home_grid3 = findViewById(R.id.img_home_grid3);
        img_home_grid4 = findViewById(R.id.img_home_grid4);



        txt_home_grid1 = findViewById(R.id.txt_home_grid1);
        txt_home_grid2 = findViewById(R.id.txt_home_grid2);
        txt_home_grid3 = findViewById(R.id.txt_home_grid3);
        txt_home_grid4 = findViewById(R.id.txt_home_grid4);
        txt_home_grid5 = findViewById(R.id.txt_home_grid5);
        txt_home_grid6 = findViewById(R.id.txt_home_grid6);
        txt_home_grid7 = findViewById(R.id.txt_home_grid7);
        txt_home_grid8 = findViewById(R.id.txt_home_grid8);








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


        img_home_grid1.setImageResource(getIntent().getIntExtra("img_home_grid1",0));
        img_home_grid2.setImageResource(getIntent().getIntExtra("img_home_grid2",0));
        img_home_grid3.setImageResource(getIntent().getIntExtra("img_home_grid3",0));
        img_home_grid4.setImageResource(getIntent().getIntExtra("img_home_grid4",0));


        txt_home_grid1.setText(getIntent().getStringExtra("txt_home_grid1"));
        txt_home_grid2.setText(getIntent().getStringExtra("txt_home_grid2"));
        txt_home_grid3.setText(getIntent().getStringExtra("txt_home_grid3"));
        txt_home_grid4.setText(getIntent().getStringExtra("txt_home_grid4"));
        txt_home_grid5.setText(getIntent().getStringExtra("txt_home_grid5"));
        txt_home_grid6.setText(getIntent().getStringExtra("txt_home_grid6"));
        txt_home_grid7.setText(getIntent().getStringExtra("txt_home_grid7"));
        txt_home_grid8.setText(getIntent().getStringExtra("txt_home_grid8"));








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
                Glide.with(HomeActivity.this)
                        .load("https://icons8.com/vue-static/landings/animated-icons-new/icons/color/heart/heart_192.gif").into(home_intent_favorite);

            }

        });




    }
}