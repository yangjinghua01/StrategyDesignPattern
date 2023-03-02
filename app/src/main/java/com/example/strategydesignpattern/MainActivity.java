package com.example.strategydesignpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 *策略模式定义了一系列算法，并将每一个算法封装起来，而且是他们之间可以互相切换
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}