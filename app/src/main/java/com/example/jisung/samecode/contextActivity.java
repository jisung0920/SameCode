package com.example.jisung.samecode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class contextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_context);
        ImageView img = (ImageView) findViewById(R.id.back);
        Intent intent = getIntent();
        img.setBackgroundResource(intent.getIntExtra("context",R.drawable.main));
    }
    public void onClick(View v){
        finish();
    }
}
