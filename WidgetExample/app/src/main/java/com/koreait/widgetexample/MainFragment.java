package com.koreait.widgetexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainFragment extends AppCompatActivity {

    @Override
    public View onCreateView(LayoutInflaterinflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_main, container, )

        Button btn = rootView.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){
            MainActivity activity = (MainActivity) getActivity();
            activity.onFragmentChanged(0);
        });
    }

    return rootView;
}