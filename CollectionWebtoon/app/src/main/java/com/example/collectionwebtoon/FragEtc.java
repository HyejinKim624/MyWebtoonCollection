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

    //fragment 주기적 교체로 인한 상태 저장
    public static FragEtc newinstance() {
        FragEtc fragEtc = new FragEtc();
        return fragEtc;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_etc, container, false);

        FloatingActionButton btn8 = view.findViewById(R.id.floatBtn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PopupActivity.class);
                startActivity(intent);
            }
        });


        return view;

    }
}
