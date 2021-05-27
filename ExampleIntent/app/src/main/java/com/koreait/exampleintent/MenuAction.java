package com.koreait.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MenuAction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_action);
    }

    public void onButton1Clicked(View v) {
        String data = at.getText().toString();

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data));

        startActivity(intent);
    }

    public void onButton2Clicked(View v) {
        Intent intent = new Intent();
        ComponentName name = new ComponentName("com.koreait.examplecallintent",
                "com,koreait.examplecallintent.MenuActivity");
        intent.setComponent(name);

        startActivityForResult(intent, 101);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        // 이 메서드를 오버라이딩하면은
        // 현재 이 액티비티가 재활용 될 때
        // 부모 액티비티가 전달해주는 인텐트만 받아서 처리할 수 있음
        // 브로드 캐스트 수신자 또는 서비스에서 액티비티를 띄우는 코드를 보면
        // 쉽게 이해할 수 잇으므로 나중에... 해보도록
    }
}