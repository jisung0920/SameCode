package com.example.jisung.samecode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Code_ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code__list);
    }
    public void onClick(View v){
        Intent intent = new Intent(this,DetailActivity.class);
        startActivity(intent);
    }
}
