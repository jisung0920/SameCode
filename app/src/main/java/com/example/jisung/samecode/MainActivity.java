package com.example.jisung.samecode;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
    ImageView draw;
    Boolean flag =false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
draw = (ImageView)findViewById(R.id.draw);
        Button menu, exit;
        menu = (Button)findViewById(R.id.menu);
        exit = (Button)findViewById(R.id.exit_Btn);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                draw.setVisibility(View.VISIBLE);
                flag =true;
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                draw.setVisibility(View.INVISIBLE);
                flag = false;
            }
        });


    }




    public void onClick(View v){
        if(flag)
            return;
        Intent intent;
        switch (v.getId()){
            case R.id.travel:
                intent = new Intent(this,travelActivity.class);
                break;
            case R.id.music:
                intent = new Intent(this,musicActivity.class);
                break;
            case R.id.date:
                intent = new Intent(this,dateActivity.class);
                break;
            case R.id.cook:
                intent = new Intent(this,cookActivity.class);
                break;
            case R.id.book:
                intent = new Intent(this,bookActivity.class);
                break;
            case R.id.movie:
                intent = new Intent(this,movieActivity.class);
                break;
            default:
                intent = new Intent(this,travelActivity.class);
                break;
        }
        startActivity(intent);

    }
}
