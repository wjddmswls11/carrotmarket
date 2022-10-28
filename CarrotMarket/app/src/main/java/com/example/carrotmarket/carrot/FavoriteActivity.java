package com.example.carrotmarket.carrot;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.carrotmarket.Home.HomeActivity;
import com.example.carrotmarket.R;

public class FavoriteActivity extends AppCompatActivity {

    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        actionBar = getSupportActionBar();
        actionBar.hide();

       /*HomeActivity.fav_list.get(0).getTv_home_chat();*/







    }
}