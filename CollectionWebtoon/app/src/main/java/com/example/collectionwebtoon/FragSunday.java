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

public class FragSunday extends Fragment {
    public FragSunday(){

    }

    @Nullable
    @Override
    //fragment 생명주기
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.frag_sunday,container,false);

        FloatingActionButton btn7 = view.findViewById(R.id.floatBtn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PopupActivity.class);
                startActivity(intent);
            }
        });


        return view;

    }
}
