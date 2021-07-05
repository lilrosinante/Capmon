package com.booleanag.capmon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class RegisterActivity extends AppCompatActivity {

    private FloatingActionButton registerButton;
    private TextView loginSwitchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        loginSwitchText = findViewById(R.id.loginSwitchText);

        loginSwitchText.setOnClickListener((v) -> {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        });

        registerButton = findViewById(R.id.registerButton);

        registerButton.setOnClickListener((v) -> {
            Intent i = new Intent(this, CapmonListActivity.class);
            startActivity(i);
        });
    }
}