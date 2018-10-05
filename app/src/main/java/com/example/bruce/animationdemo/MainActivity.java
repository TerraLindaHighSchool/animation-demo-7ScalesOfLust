package com.example.bruce.animationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Animation wobble, slideDown;
    private ImageView card;
    private Button wobbleButton, slideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setWidgetID();
        loadAnimations();
        listenForClick();

    }

    protected void setWidgetID(){
        card = findViewById(R.id.imageView3);
        wobbleButton = findViewById(R.id.button_wobble);
        slideButton = findViewById(R.id.button_slide);
    }

    private void loadAnimations(){
        wobble = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.wobble);
        slideDown = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_down);
    }

    private void listenForClick(){
        slideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                card.startAnimation(slideDown);
            }
        });

        wobbleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                card.startAnimation(wobble);
            }
        });
    }


}
