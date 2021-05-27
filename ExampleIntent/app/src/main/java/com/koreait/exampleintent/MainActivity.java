package com.koreait.exampleintent;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.editTextTel);
    }

    public void onButton1Clicked(View v) {
        // 입력상자(edit text)에 입력한 전화번호
        String data = et.getText().toString();

        // 전화걸기 화면을 보여줄 인텐트 객체 생성
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data));
        // 인텐트를 사용한 액티비티를 띄우기
        startActivity(intent);
    }
}