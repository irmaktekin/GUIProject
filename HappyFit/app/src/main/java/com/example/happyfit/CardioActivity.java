package com.example.happyfit;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class CardioActivity extends AppCompatActivity {
    View videov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);
       videov =(VideoView)findViewById(R.id.videoView8);
        final VideoView videoview = (VideoView) findViewById(R.id.videoView8);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.cardio);
        videoview.setVideoURI(uri);
        videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoview.start();
            }
        });
    }

// a0.mcqwithvideo is my package use own package to play video right


}
