package com.example.animatedlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.skyfishjy.library.RippleBackground;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RippleBackground rippleBackground=(RippleBackground)findViewById(R.id.content);
        ImageView imageView=(ImageView)findViewById(R.id.centerImage);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!rippleBackground.isRippleAnimationRunning()){
                    imageView.setColorFilter(Color.argb(225, 225,225,225));
                    rippleBackground.startRippleAnimation();
                }else {
                    imageView.setColorFilter(null);
                    rippleBackground.stopRippleAnimation();
                }
            }
        });

    }
}