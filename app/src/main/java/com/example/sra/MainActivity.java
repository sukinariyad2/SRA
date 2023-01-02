package com.example.sra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgsh=findViewById(R.id.imgsh);
        Button idsh=findViewById(R.id.idsh);
        ImageView imgnsr=findViewById(R.id.imgnsr);
        Button idns=findViewById(R.id.idns);
        ImageView imgmuq=findViewById(R.id.imgmuq);
        Button idms=findViewById(R.id.idms);
        ImageView imgzo=findViewById(R.id.imgzo);
        Button idzo=findViewById(R.id.idzo);
        imgsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,alshahed.class);
                startActivity(intent);
            }
        });
        idsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,alshahed.class);
                startActivity(intent);
            }
        });
        imgnsr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,alnasr.class);
                startActivity(intent);
            }
        });
        idns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,alnasr.class);
                startActivity(intent);
            }
        });
        imgmuq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,almuq.class);
                startActivity(intent);
            }

        });
        idms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,almuq.class);
                startActivity(intent);

            }
        });
        imgzo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,zoo.class);
                startActivity(intent);
            }

        });
        idzo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,zoo.class);
                startActivity(intent);

            }
        });
    }
}