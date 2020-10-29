package com.example.collectionwebtoon;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;

public class PopupActivity extends Activity {

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
        int height = (int)(dp.getHeight()*0.8);
        //현재 화면에 적용
        getWindow().getAttributes().width = width;
        getWindow().getAttributes().height = height;

        //액티비티 바깥화면 클릭해도 종료되지 않음
        this.setFinishOnTouchOutside(false);

    }
}