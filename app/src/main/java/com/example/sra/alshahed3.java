package com.example.sra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class alshahed3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alshahed3);
        TextView txfeed=findViewById(R.id.textView5);
        RatingBar ratingBar=findViewById(R.id.rbstars);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                if(v==0)
                {txfeed.setText("غير راض");}
                else if(v==1){

                    txfeed.setText("غير راض");}
                else if(v==2){

                    txfeed.setText("متوسط");}
                else if(v==3){

                    txfeed.setText("جيد");}
                else if(v==4){

                    txfeed.setText("جيد جدا");}
                else if(v==1){

                    txfeed.setText("ممتاز");}
            }
        });
    }
}