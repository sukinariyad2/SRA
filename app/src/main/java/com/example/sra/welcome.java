package com.example.sra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ImageView imgbag=findViewById(R.id.imhbag);
        Thread thread=new Thread(){
            public void run(){
                try {
                    sleep(4000);
                    Intent mainactivity=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(mainactivity);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();

    }
}