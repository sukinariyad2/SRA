package com.example.sra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class almuq extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almuq);
        Button btn222=findViewById(R.id.btn222);
        Button btn333=findViewById(R.id.btn333);
        Button btn444=findViewById(R.id.btn444);
        btn222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(almuq.this,almuq1.class);
                startActivity(intent);
            }
        });
        btn333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(almuq.this,almuq2.class);
                startActivity(intent);
            }
        });
        btn444.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(almuq.this,almuq3.class);
                startActivity(intent);
            }
        });
    }
}