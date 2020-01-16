package com.example.happyfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ProfilePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
        ImageButton bttn=findViewById(R.id.friends3);
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfilePage.this, Friends.class));
            }
        });
        ImageButton bttn2=findViewById(R.id.exprog);
        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfilePage.this, ExerciseActivity.class));
            }
        });
        ImageButton bttn3=findViewById(R.id.diet);
        bttn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfilePage.this, DietProgram.class));
            }
        });
        ImageButton bttn4=findViewById(R.id.profcont);
        bttn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfilePage.this, ForumActivity.class));
            }
        });
        Button bttn5=findViewById(R.id.watch);
        bttn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfilePage.this, FullBodyWorkoutActivity.class));
            }
        });
    }
}
