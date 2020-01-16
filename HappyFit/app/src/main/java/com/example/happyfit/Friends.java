package com.example.happyfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Friends extends AppCompatActivity {
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

    submit=(Button)findViewById(R.id.button);
    submit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            FragmentTransaction f=getSupportFragmentManager().beginTransaction();
            f.replace(R.id.layout_friends, new SaveFragment());
            f.commit();


        }
    });

    }



}
