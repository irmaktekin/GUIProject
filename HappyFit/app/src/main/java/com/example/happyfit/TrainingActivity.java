package com.example.happyfit;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class TrainingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);
        VideoView v1 = (VideoView) findViewById(R.id.videoView);
        VideoView v2 = (VideoView) findViewById(R.id.videoView2);
        v1.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.training2));
        v1.start();
        v1.requestFocus();
        v1.setKeepScreenOn(true);
        v2.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.training1));
        v2.start();
        v2.requestFocus();
        v2.setKeepScreenOn(true);



    }
}
