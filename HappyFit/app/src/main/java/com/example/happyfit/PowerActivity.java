package com.example.happyfit;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.widget.MediaController;
import android.widget.VideoView;

public class PowerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power);

        VideoView videoView=(VideoView)findViewById(R.id.videoView5);
        MediaController m;

        m = new MediaController(this);
        String uripath =  "android.resource://com.example.happyfit/"+R.raw.training1;
        Uri u = Uri.parse(uripath);

        videoView.setVideoURI(u);

        videoView.requestFocus();
        videoView.start();
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        android.widget.LinearLayout.LayoutParams params = (android.widget.LinearLayout.LayoutParams) videoView.getLayoutParams();
        params.width = metrics.widthPixels;
        params.height = metrics.heightPixels;
        params.leftMargin = 0;
        videoView.setLayoutParams(params);


    }
}
