package com.example.carrotmarket.around;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.carrotmarket.R;

public class AroundCouponActivity extends Activity {
    TextView around_coupon_intent;
    LinearLayout around_coupon_dismiss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.activity_around_coupon);





        around_coupon_intent = findViewById(R.id.around_coupon_intent);
        around_coupon_dismiss = findViewById(R.id.around_coupon_dismiss);

        around_coupon_intent.setText(getIntent().getStringExtra("around_coupon_shopname"));

        around_coupon_dismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }


}