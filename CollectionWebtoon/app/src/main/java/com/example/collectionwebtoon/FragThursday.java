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

public class FragThursday extends Fragment {
    public FragThursday(){

    }

    @Nullable
    @Override
    //fragment 생명주기
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_thursday,container,false);

        FloatingActionButton btn4 = view.findViewById(R.id.floatBtn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PopupActivity.class);
                startActivity(intent);
            }
        });


        return view;

    }
}
