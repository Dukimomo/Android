package com.koreait.randomthingy;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    Toolbar tb;
    Fragment1 fg1;
    Fragment2 fg2;
    Fragment3 fg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // XML 레이아웃에 정의한 toolbar를 가져옴
        tb = findViewById(R.layout.toolbar);
        setSupportActionBar(tb);
        // toolbar를 액션바로 만들어줌
        // 액티비티에 디폴트로 만들어진 액션바가 없어야 동작을 함
        // 프로젝트를 만들 때 메인 액티비티에 자동으로 액션바가 만들어지기 때문에
        // 이 메서드를 사용하려면 직접 자동으로 만들어진 액션바를 헤제해야함
        ActionBar ab = getSupportActionBar();
        ab.setDisplayShowTitleEnabled(false);

        fg1 = new Fragment1();
        fg2 = new Fragment2();
        fg3 = new Fragment3();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, fg1).commit();

        TabLayout tabs = findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("통화기능"));
        tabs.addTab(tabs.newTab().setText("스팸기록"));


    }
}