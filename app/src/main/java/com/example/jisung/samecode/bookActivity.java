package com.example.jisung.samecode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class bookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_book);
    }
    public void onClick(View v){
        Intent intent;
        intent = new Intent(this,contextActivity.class);
        switch (v.getId()){
            case R.id.backBtn:
                intent = new Intent(this,MainActivity.class);
                break;
            case R.id.item1:
                intent.putExtra("context",R.drawable.b1);
                break;
            case R.id.item2:
                intent.putExtra("context",R.drawable.b2);
                break;
            case R.id.item3:
                intent.putExtra("context",R.drawable.b3);
                break;
            case R.id.item4:
                intent.putExtra("context",R.drawable.b4);
                break;
            case R.id.item5:
                intent.putExtra("context",R.drawable.b5);
                break;
            case R.id.item6:
                intent.putExtra("context",R.drawable.b6);
                break;

        }
        startActivity(intent);
    }
}
