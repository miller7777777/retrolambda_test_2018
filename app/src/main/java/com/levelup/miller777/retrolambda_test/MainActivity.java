package com.levelup.miller777.retrolambda_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(view -> launchActivity());


        //button.setOnClickListener(v -> launchActivity());
       // button.setOnClickListener(this::launchActivity);
    }

    private void launchActivity() {

        //launch activity
        Toast.makeText(this, "Привет лямбда-выражения!", Toast.LENGTH_LONG).show();
    }
}
