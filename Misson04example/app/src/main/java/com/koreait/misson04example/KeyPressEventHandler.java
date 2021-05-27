package com.koreait.misson04example;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.UnsupportedEncodingException;

public class KeyPressEventHandler implements TextWatcher {
    private TextView counter;

    public KeyPressEventHandler(TextView counter) {
        this.counter = counter;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        // 우리가 입력한 키가 화면에 보인 직후에 실행되는 매서드
        System.out.println("입력된 문자의 바이트 수를 세는 코드");
        try {
            byte[] bytes = s.toString().getBytes("KSC5601");

            int strCount = bytes.length;

            System.out.println("센 바이트 수를 textView에 출력하는 코드");

            counter.setText(strCount + " / 80 바이트");
        } catch(UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void afterTextChanged(Editable s) {
        // 우리가 입력한 키가 화면에 보인 직후에 실행되는 메서드
        // (onTextChanged 메서드 후에 실행되는 메서드)
    }
}
