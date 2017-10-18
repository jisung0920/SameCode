package com.example.jisung.samecode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class dateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_date);
    }
    public void onClick(View v){
        Intent intent;
        intent = new Intent(this,contextActivity.class);
        switch (v.getId()){
            case R.id.backBtn:
                intent = new Intent(this,MainActivity.class);
                break;
            case R.id.item1:
                intent.putExtra("context",R.drawable.d1);
                break;
            case R.id.item2:
                intent.putExtra("context",R.drawable.d2);
                break;
            case R.id.item3:
                intent.putExtra("context",R.drawable.d3);
                break;
            case R.id.item4:
                intent.putExtra("context",R.drawable.d4);
                break;

        }
        startActivity(intent);
    }
}
