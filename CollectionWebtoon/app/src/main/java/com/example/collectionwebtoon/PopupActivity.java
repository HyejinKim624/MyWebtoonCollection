package com.example.collectionwebtoon;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Scanner;

public class PopupActivity extends Activity {
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private Button btn_add; //추가 버튼
    private Spinner spinner;
    private String title; //웹툰명
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //타이틀 바 제거
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        //배경 블러 처리
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        layoutParams.dimAmount = 0.7f;
        getWindow().setAttributes(layoutParams);

        //레이아웃 설정
        setContentView(R.layout.activity_popup);

        //사이즈 조절
        //디스플레이 화면 사이즈 구하기
        Display dp = ((WindowManager)getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        //화면비율 설정
        int width = (int)(dp.getWidth()*0.7);
        int height = (int)(dp.getHeight()*0.4);
        //현재 화면에 적용
        getWindow().getAttributes().width = width;
        getWindow().getAttributes().height = height;

        //액티비티 바깥화면 클릭해도 종료되지 않음
        this.setFinishOnTouchOutside(false);


        //EditText
        editText = findViewById(R.id.text_webtoonTitle);
        //입력된 값을 title에 저장
        title = editText.getText().toString();

        //팝업창의 추가 버튼
        btn_add = findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //프래그먼트에 웹툰 제목 전달 Bundle

                //전달 후 프래그먼트로 돌아감
                onBackPressed();
            }
        });


        //spinner(스피너)
        spinner = findViewById(R.id.spinner);

        //드롭 다운 아이템에 대한 리스너
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getItemAtPosition(position).toString() == "기타"){

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}