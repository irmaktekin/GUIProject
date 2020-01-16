package com.example.happyfit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.sax.RootElement;
import android.util.Log;
import android.view.Gravity;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;



public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG="MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOne = findViewById(R.id.formbuttn);
        View bttn2=(Button)findViewById(R.id.profilebuttn);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Forum Button Clicked");
                Intent activity2Intent = new Intent(getApplicationContext(), ForumActivity.class);
                startActivity(activity2Intent);

            }
        });
        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProfilePage.class));
            }
        });




        //for background colour loginpage
        View someView = findViewById(R.id.username2);
        View root=someView.getRootView();
        int greenColorValue;
        greenColorValue = Color.parseColor("#FF1CC1B0");
        root.setBackgroundColor(greenColorValue);

        TextView someView2 = findViewById(R.id.forgotpass2);
        View root2=someView2.getRootView();
        int greenColorValue2;
        greenColorValue2 = Color.parseColor("#FF1CC1B0");
        root.setBackgroundColor(greenColorValue2);
        //image to actionbar
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayOptions(actionBar.getDisplayOptions()
                | ActionBar.DISPLAY_SHOW_CUSTOM);
        ImageView imageView = new ImageView(actionBar.getThemedContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.profpic);
        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.WRAP_CONTENT, Gravity.RIGHT
                | Gravity.CENTER_VERTICAL);
        layoutParams.rightMargin = 40;
        imageView.setLayoutParams(layoutParams);
        actionBar.setCustomView(imageView);



        //changing button colours.


    }


    //@Override
    //clicking method for profile, forum and training button
   // public void onClick(View v) {
     //   switch(v.getId()){
       //     case R.id.trainig:
         //       Intent intent = new Intent(MainActivity.this,
           //             LoginActivity.class);
             //   startActivity(intent);
               // break;
            //case R.id.forum:
              //  Intent intent2 = new Intent(MainActivity.this,
                //        LoginActivity.class);
                //startActivity(intent2);
                //break;
        //}

//    }
    public void startThread(View view){
        for(int i=0;i<10;i++){
            Log.d(TAG, "startThread:"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public void stopThread(View view){

    }

}
