package com.example.cobaui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
    }

    public void register(View view) {
        Intent intent=new Intent(Login.this,Register.class);
        startActivity(intent);
    }

    public void signin(View view) {
        Intent intent=new Intent(Login.this,Dashboard.class);
        startActivity(intent);
    }
}