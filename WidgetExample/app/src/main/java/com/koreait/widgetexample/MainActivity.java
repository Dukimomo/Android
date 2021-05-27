package com.koreait.widgetexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edittext);
    }

    public void onFragmentChanged(int index) {
        if(index == 0) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container,
                    menuFragment).commit();
        } else {
            getSupportFragmentManager().beginTransaction().replace(R.id.container,
                    mainFragment).commit();
        }
    }
}