package com.example.pr12ovcharov;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class history extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }

    public void exit(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void startScreen(View view) {
        Intent intent = new Intent(this, StartScreen.class);
        startActivity(intent);
    }

    public void startScreen1(View view) {
        Intent intent = new Intent(this, StartScreen.class);
        startActivity(intent);
    }
}