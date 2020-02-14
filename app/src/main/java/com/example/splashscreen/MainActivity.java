package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private static int SPLASH_SCREEN=5000;
    Animation anim,bottomanim;
    ImageView image;
    TextView logo,slogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        anim= AnimationUtils.loadAnimation(this,R.anim.animation);
        bottomanim=AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        image=findViewById(R.id.imageView);
        logo=findViewById(R.id.textView);
        slogan=findViewById(R.id.textView3);

        image.setAnimation(anim);
        logo.setAnimation(bottomanim);
        slogan.setAnimation(bottomanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,Dashboard.class);
                startActivity(i);
                finish();
            }
        },SPLASH_SCREEN);

    }
}
