package com.example.collectionwebtoon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MenuActivity extends AppCompatActivity {

    private Button btnMon, btnTue, btnWed, btnThu, btnFri, btnSat, btnSun, btnEtc, btnRec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnMon = findViewById(R.id.btn_mon);
        btnTue = findViewById(R.id.btn_tue);
        btnWed = findViewById(R.id.btn_wed);
        btnThu = findViewById(R.id.btn_thu);
        btnFri = findViewById(R.id.btn_fri);
        btnSat = findViewById(R.id.btn_sat);
        btnSun = findViewById(R.id.btn_sun);
        btnEtc = findViewById(R.id.btn_etc);
        btnRec = findViewById(R.id.btn_rec);

        btnMon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                FragMonday fragMonday = new FragMonday();
                transaction.replace(R.id.frame, fragMonday);
                transaction.commit();
            }
        });

        btnTue.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                FragTuesday fragTuesday = new FragTuesday();
                transaction.replace(R.id.frame, fragTuesday);
                transaction.commit();
            }
        });

        btnWed.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                FragWednesday fragWednesday = new FragWednesday();
                transaction.replace(R.id.frame, fragWednesday);
                transaction.commit();
            }
        });

        btnThu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                FragThursday fragThursday = new FragThursday();
                transaction.replace(R.id.frame, fragThursday);
                transaction.commit();
            }
        });

        btnFri.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                FragFriday fragFriday = new FragFriday();
                transaction.replace(R.id.frame, fragFriday);
                transaction.commit();
            }
        });

        btnSat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                FragSaturday fragSaturday = new FragSaturday();
                transaction.replace(R.id.frame, fragSaturday);
                transaction.commit();
            }
        });

        btnSun.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                FragSunday fragSunday = new FragSunday();
                transaction.replace(R.id.frame, fragSunday);
                transaction.commit();
            }
        });

        btnEtc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                FragEtc fragEtc = new FragEtc();
                transaction.replace(R.id.frame, fragEtc);
                transaction.commit();
            }
        });

        btnRec.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                FragRecord fragRecord = new FragRecord();
                transaction.replace(R.id.frame, fragRecord);
                transaction.commit();
            }
        });
    }
}