package com.example.carrotmarket;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;

import com.example.carrotmarket.Home.HomeFragment;
import com.example.carrotmarket.around.AroundFragment;
import com.example.carrotmarket.carrot.CarrotActivity;
import com.example.carrotmarket.carrot.CarrotFragment;
import com.example.carrotmarket.chat.ChatActivity;
import com.example.carrotmarket.chat.ChatFragment;
import com.example.carrotmarket.town.TownFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {
    ActionBar actionBar;
    BottomNavigationView btm_nav;
    RelativeLayout chat_carrot_relative;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        actionBar = getSupportActionBar();
        actionBar.hide();










        getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();
        btm_nav = findViewById(R.id.btm_nav);
        btm_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.menu1){
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new HomeFragment()).commit();
                }else if(item.getItemId() == R.id.menu2) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new TownFragment()).commit();
                }else if(item.getItemId() == R.id.menu3) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new AroundFragment()).commit();
                }else if (item.getItemId() == R.id.menu4) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new ChatFragment()).commit();
                }else if (item.getItemId() == R.id.menu5) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, new CarrotFragment()).commit();

                }
                return  true;



            }
        });



    }


}