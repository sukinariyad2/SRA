package com.example.sra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class alnasr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alnasr);
        Button btn11=findViewById(R.id.btn11);
        Button btn22=findViewById(R.id.btn22);
        Button btn33=findViewById(R.id.btn33);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(alnasr.this,alnasr1.class);
                startActivity(intent);
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(alnasr.this,alnasr2.class);
                startActivity(intent);
            }
        }); btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(alnasr.this,alnasr3.class);
                startActivity(intent);
            }
        });
    }
}