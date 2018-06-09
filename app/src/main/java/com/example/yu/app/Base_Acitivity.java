package com.example.yu.app;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.yu.app.R.id.container_base;

public class Base_Acitivity extends AppCompatActivity {
    private android.support.v4.app.Fragment baseFragment1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base__acitivity);
        baseFragment1=new BaseFragment1();
        getSupportFragmentManager().beginTransaction().add(R.id.container_base,baseFragment1).commitAllowingStateLoss();
    }
}
