package com.example.collectionwebtoon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

//기타 fragment
public class FragEtc extends Fragment {
    private View view;

    //fragment 주기적 교체로 인한 상태 저장
    public static FragEtc newinstance() {
        FragEtc fragEtc = new FragEtc();
        return fragEtc;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_etc, container, false);

        return view;
    }
}
