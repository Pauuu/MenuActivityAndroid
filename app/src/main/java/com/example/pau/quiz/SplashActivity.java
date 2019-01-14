package com.example.pau.quiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends QuizActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        ImageView image1 = findViewById(R.id.imageView);
        ImageView image2 = findViewById(R.id.imageView2);
        ImageView image3 = findViewById(R.id.imageView3);
        ImageView image4 = findViewById(R.id.imageView4);

        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.fade1);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.fade2);
        Animation animation3 = AnimationUtils.loadAnimation(this, R.anim.flip1);
        Animation animation4 = AnimationUtils.loadAnimation(this, R.anim.flip2);

        image1.startAnimation(animation1);
        image2.startAnimation(animation2);
        image3.startAnimation(animation3);
        image4.startAnimation(animation4);

        animation1.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(SplashActivity.this,
                        MenuActivity.class));
                SplashActivity.this.finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}
