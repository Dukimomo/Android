package com.koreait.examplefragment2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import android.fragment.app.Fragment;

import androidx.annotation.Nullable;

public class ViewerFragment extends Fragment{
    ImageView iv ;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView =(ViewGroup) inflater.inflate(R.layout.fragment_viewer, container, )

        iv = rootView.findViewById(R.id.imageView);
        return rootView;
    }

    public void setImage(int resId) {
        iv.setImageResource(resId);
    }
}
