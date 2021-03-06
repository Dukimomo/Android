package com.koreait.exampleinflatelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "레이아웃 인플레이트 되기 전", Toast.LENGTH_LONG).show();
            }
        });

        setContentView(R.layout.activity_main);
    }
}