package com.example.collectionwebtoon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

//friday fragment
public class FragFriday extends Fragment {
    public FragFriday(){

    }

    @Nullable
    @Override
    //fragment 생명주기
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_friday,container,false);
    }
}