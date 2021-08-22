package com.example.additionallabsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    private Object Setting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View btn1 = findViewById(R.id.button1);
        View btn2 = findViewById(R.id.button2);

        btn1.setOnClickListener(new OnClickListener(){
            public void onClick(View view){
                startService(new Intent(MainActivity.this,MyServices.class));
            }
        });
        btn2.setOnClickListener(new OnClickListener(){
            public void onClick(View view){
                stopService(new Intent(MainActivity.this, MyServices.class));
            }
        });
}
}