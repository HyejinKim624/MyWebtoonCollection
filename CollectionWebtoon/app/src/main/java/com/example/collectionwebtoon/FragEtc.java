package com.example.collectionwebtoon;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

//기타 fragment
public class FragEtc extends Fragment {
    public FragEtc(){

    }


    @Override
    //fragment 생명주기
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_etc,container,false);

        FloatingActionButton btn8 = view.findViewById(R.id.floatBtn8);
        btn8.setOnClickListener(new View.OnClickListener() {
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
