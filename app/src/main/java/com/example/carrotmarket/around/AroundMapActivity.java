package com.example.carrotmarket.around;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.carrotmarket.R;
import com.naver.maps.map.MapView;
import com.naver.maps.map.NaverMap;

public class AroundMapActivity extends AppCompatActivity {
    NaverMap naverMap;  //Adapter ( 화면에 보이게 하거나 모든 처리를 담당함)
    MapView map_View;    //RecyclerView같은 기능(보이게만함)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_around_map);
    }
}