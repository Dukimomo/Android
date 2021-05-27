package com.koreait.examplefragment2;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ListFragment extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if(context instanceof ImageSelectionCallback) {
            callback = (ImageSelectionCallback) context;
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflaterinflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_list, container, )
        Button btn1 = rootView.findViewById(R.id.button);
        Button btn2 = rootView.findViewById(R.id.button2);
        Button btn3 = rootView.findViewById(R.id.button3);

        // 첫 번째 이미지 버튼을 눌렀을 때
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(callback != null) {
                    callback.onImageSelected(0);
                }
            }
        });

        // 첫 번째 이미지 버튼을 눌렀을 때
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(callback != null) {
                    callback.onImageSelected(1);
                }
            }
        });

        // 첫 번째 이미지 버튼을 눌렀을 때
        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(callback != null) {
                    callback.onImageSelected(2);
                }
            }
        });

        return rootView;
    }
}
