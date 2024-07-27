package com.example.playground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    FrameLayout container;
    Button button;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container = findViewById(R.id.container);
        button = findViewById(R.id.addFragment);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.addFragment:
                this.addFragment();
                break;
        }
    }
    private void addFragment(){
        getSupportFragmentManager().beginTransaction().add(R.id.container,new ExampleFragment(i++)).addToBackStack(null).commit();
    }

    @Override
    public void onBackPressed() {
        if(getSupportFragmentManager().getBackStackEntryCount()>1){
            super.onBackPressed();
        }
        else{
            finish();
        }
    }
}
