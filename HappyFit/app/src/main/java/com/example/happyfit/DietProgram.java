package com.example.happyfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.happyfit.R.id.button3;
import static com.example.happyfit.R.id.button4;

public class DietProgram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_program);
        Button btn = (Button)findViewById(button3
        );
        Button btn2=(Button)findViewById(button4);
        Button btn3 = (Button)findViewById(R.id.button5
        );

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DietProgram.this, BreakfastActivity.class));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DietProgram.this, BreakfastActivity.class));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DietProgram.this, BreakfastActivity.class));
            }
        });
    }
}
