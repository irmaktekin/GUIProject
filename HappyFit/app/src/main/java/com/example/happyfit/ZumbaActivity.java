package com.example.happyfit;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class ZumbaActivity extends AppCompatActivity {
    VideoView videov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zumba);
        videov =(VideoView)findViewById(R.id.videoView8);
        final VideoView videoview = (VideoView) findViewById(R.id.videoView8);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.zumba);
        videoview.setVideoURI(uri);
        videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoview.start();
            }
        });
    }
}
