package com.example.yuhi;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.yuhi.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.login).setOnClickListener(new handleButton());
    }

    class handleButton implements View.OnClickListener {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, registration.class);
            startActivity(intent);
        }
    }};



