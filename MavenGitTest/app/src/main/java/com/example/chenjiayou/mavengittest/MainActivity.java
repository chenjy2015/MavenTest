package com.example.chenjiayou.mavengittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.mylibrary.StringUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println(StringUtils.isNullOrEmpty(""));

    }
}
