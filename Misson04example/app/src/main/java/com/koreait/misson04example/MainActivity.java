package com.koreait.misson04example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.koreait.misson04example.R;

import org.w3c.dom.Text;

import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity {
    EditText inputText;
    TextView counter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputText = findViewById(R.id.inputText);
        counter = findViewById(R.id.counter);

        KeyPressEventHandler kpeh = new KeyPressEventHandler(counter);

        inputText.addTextChangedListener(kpeh);
    }

    public void onButtonClicked(View v) {
        String text = inputText.getText().toString();

    // Toast를 사용해서 "입력된 문자열"을 전송합니다. 를 보여주도록
        Toast.makeText(this, text + "을 전송합니다.", Toast.LENGTH_LONG).show();
    }
}