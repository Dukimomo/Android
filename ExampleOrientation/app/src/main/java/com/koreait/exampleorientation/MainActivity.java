package com.koreait.exampleorientation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast.makeText(this, "onCreate 호출됨", Toast.LENGTH_LONG).show();

        // 호스트 메세지를 보여줄 객채 생성
        //Toast toast = Toast.makeText(this, "gravity", Toast.LENGTH_LONG);
        
        // 우리 입맛에 맞게 토스트 메세지를 바꿀 수 있음
        //toast.setGravity(Gravity.TOP | Gravity.TOP, 0, 0);
         
        // API29까지는 커스텀 토스트 메세지가 가능했음
        // API30부터는 커스텀 토스트 메세지가 불가능
        
        //toast.show();
    }

    public void onButtonClicked(View v) {
        Snackbar.make(v, "스낵바입니다.", Snackbar.LENGTH_LONG).show();
    }
}