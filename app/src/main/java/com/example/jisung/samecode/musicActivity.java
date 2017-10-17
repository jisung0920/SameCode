package com.example.jisung.samecode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class musicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_music);
    }
    public void onClick(View v){
        Intent intent;
        intent = new Intent(this,contextActivity.class);
        switch (v.getId()){
            case R.id.backBtn:

                finish();
                break;
            case R.id.item1:
                intent.putExtra("context",R.drawable.m1);
                break;
            case R.id.item2:
                intent.putExtra("context",R.drawable.m2);
                break;
            case R.id.item3:
                intent.putExtra("context",R.drawable.m3);
                break;
            case R.id.item4:
                intent.putExtra("context",R.drawable.m4);
                break;
            case R.id.item5:
                intent.putExtra("context",R.drawable.m5);
                break;
            case R.id.item6:
                intent.putExtra("context",R.drawable.m6);
                break;
        }
        startActivity(intent);
    }
}
