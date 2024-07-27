package com.example.playground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

public class SlideActivity extends AppCompatActivity {
    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);
        frameLayout = findViewById(R.id.activtiy_frame_layout);
        getSupportFragmentManager().beginTransaction().add(R.id.activtiy_frame_layout,new BaseFragment()).commit();
    }
}
