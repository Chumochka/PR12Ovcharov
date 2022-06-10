package com.example.pr12ovcharov;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class sign_in extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void SignIn(View view) {
        Intent intent = new Intent(this, StartScreen.class);
        startActivity(intent);
    }

    public void createNewAcc(View view){
        Intent intent = new Intent(this, sign_up.class);
        startActivity(intent);
    }
}