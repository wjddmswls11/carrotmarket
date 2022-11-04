package com.example.carrotmarket;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.navercorp.nid.NaverIdLoginSDK;
import com.navercorp.nid.oauth.NidOAuthLogin;
import com.navercorp.nid.oauth.OAuthLoginCallback;
import com.navercorp.nid.oauth.view.NidOAuthLoginButton;
import com.navercorp.nid.profile.NidProfileCallback;
import com.navercorp.nid.profile.data.NidProfileResponse;

public class LoginMainActivity extends AppCompatActivity {
    NidOAuthLoginButton btn_naver;
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);

        actionBar = getSupportActionBar();
        actionBar.hide();

        btn_naver = findViewById(R.id.btn_naver);

        NaverIdLoginSDK.INSTANCE.initialize(this
                ,"yq18fketh8UnilRRV9Xe","Lp28yYFp1g",
                "CarrotMarket");
        btn_naver.setOAuthLoginCallback(new OAuthLoginCallback() {



            @Override
            public void onSuccess() {

                NidOAuthLogin authLogin = new NidOAuthLogin();
                authLogin.callProfileApi(new NidProfileCallback<NidProfileResponse>() {
                    @Override
                    public void onSuccess(NidProfileResponse res) {
                        Intent intent = new Intent(LoginMainActivity.this, MainActivity.class);
                        intent.putExtra("name", res.getProfile().getName());
                        intent.putExtra("phone", res.getProfile().getMobile());
                        startActivity(intent);
                        finish();
                    }
                    @Override
                    public void onFailure(int i, @NonNull String s) {
                    }
                    @Override
                    public void onError(int i, @NonNull String s) {
                    }
                });
            }
            @Override
            public void onFailure(int i, @NonNull String s) {
            }
            @Override
            public void onError(int i, @NonNull String s) {
            }
        });

    }
}