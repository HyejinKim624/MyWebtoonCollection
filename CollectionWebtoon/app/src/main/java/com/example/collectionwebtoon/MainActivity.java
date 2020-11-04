package com.example.collectionwebtoon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView logo_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo_view = findViewById(R.id.logo_view);

        //로고에 애니메이션 적용
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.disappear_logo);
        logo_view.startAnimation(animation);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.loadfadein,R.anim.loadfadeout);
                finish();
            }
        }, 1500);

    }
}