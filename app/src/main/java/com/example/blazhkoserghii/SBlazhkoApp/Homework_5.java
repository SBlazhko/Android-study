package com.example.blazhkoserghii.SBlazhkoApp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Blazhko Serghii on 08.11.2015.
 */
public class Homework_5 extends AppCompatActivity implements View.OnClickListener,Animation.AnimationListener {
    Button bounceBtn,fadeInBtn,rotateBtn,moveBtn,blinkBtn,slideBtn;
    ImageView cupcake;

    // Animation
    Animation animBounce,animRotate,animSlide,animFadeIn,animMove,animBlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework_5);

        cupcake = (ImageView) findViewById(R.id.cupcakeImg);
        bounceBtn = (Button) findViewById(R.id.bounceBtn);
        bounceBtn.setOnClickListener(this);
        rotateBtn = (Button) findViewById(R.id.rotateBtn);
        rotateBtn.setOnClickListener(this);
        fadeInBtn = (Button)findViewById(R.id.fade_inBtn);
        fadeInBtn.setOnClickListener(this);
        moveBtn = (Button) findViewById(R.id.moveBtn);
        moveBtn.setOnClickListener(this);
        blinkBtn = (Button) findViewById(R.id.blinkBtn);
        blinkBtn.setOnClickListener(this);
        slideBtn = (Button) findViewById(R.id.slideDwnBtn);
        slideBtn.setOnClickListener(this);

        // load the animation
        animBounce = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        animBounce.setAnimationListener(this);
        animRotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        animRotate.setAnimationListener(this);
        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        animFadeIn.setAnimationListener(this);
        animSlide = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
        animSlide.setAnimationListener(this);
        animMove = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        animMove.setAnimationListener(this);
        animBlink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        animBlink.setAnimationListener(this);
    }

    @Override
    public void onAnimationStart(Animation animation) {
    }

    @Override
    public void onAnimationEnd(Animation animation) {
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bounceBtn:
                cupcake.startAnimation(animBounce);
                break;
            case R.id.rotateBtn:
                cupcake.startAnimation(animRotate);
                break;
            case R.id.blinkBtn:
                cupcake.startAnimation(animBlink);
                break;
            case R.id.fade_inBtn:
                cupcake.startAnimation(animFadeIn);
                break;
            case R.id.moveBtn:
                cupcake.startAnimation(animMove);
                break;
            case R.id.slideDwnBtn:
                cupcake.startAnimation(animSlide);
                break;
        }
    }
}

