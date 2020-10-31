package com.example.collectionwebtoon;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

//monday fragment
public class FragMonday extends Fragment{
    public FragMonday(){

    }

    @Override
    //fragment 생명주기
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_monday,container,false);

        FloatingActionButton btn1 = view.findViewById(R.id.floatBtn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            //플러스 버튼을 누르면 플랫폼과 웹툰명을 입력받는 팝업창이 뜸
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PopupActivity.class);
                startActivity(intent);
            }
        });


        return view;

    }

}

