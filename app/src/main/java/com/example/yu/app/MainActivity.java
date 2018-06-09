package com.example.yu.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import at.markushi.ui.CircleButton;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn_base)
    CircleButton btnBase;
    @Bind(R.id.btn_if)
    CircleButton btnIf;
    @Bind(R.id.btn_array)
    CircleButton btnArray;
    @Bind(R.id.btn_func)
    CircleButton btnFunc;
    @Bind(R.id.btn_alg)
    CircleButton btnAlg;
    @Bind(R.id.btn_post)
    CircleButton btnPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btn_base, R.id.btn_if, R.id.btn_array, R.id.btn_func, R.id.btn_alg, R.id.btn_post})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_base:
                Intent intent1=new Intent(MainActivity.this,Base_Acitivity.class);
                startActivity(intent1);
                break;
            case R.id.btn_if:
                Intent intent2=new Intent(MainActivity.this,If_Activity.class);
                startActivity(intent2);
                break;
            case R.id.btn_array:
                Intent intent3=new Intent(MainActivity.this,Array_Acitivity.class);
                startActivity(intent3);
                break;
            case R.id.btn_func:
                Intent intent4=new Intent(MainActivity.this,Function_Acitivity.class);
                startActivity(intent4);
                break;
            case R.id.btn_alg:
                Intent intent5=new Intent(MainActivity.this,Algorithms_Acitivity.class);
                startActivity(intent5);
                break;
            case R.id.btn_post:
                Intent intent6=new Intent(MainActivity.this,Post_Activity.class);
                startActivity(intent6);
                break;
        }
    }
}
