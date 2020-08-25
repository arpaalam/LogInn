package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        welcome = findViewById((R.id.welcome));

        welcome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent welcomeIntent = new Intent(getApplicationContext(),SignIn.class);
        startActivity(welcomeIntent);

    }
}