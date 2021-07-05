package com.booleanag.capmon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton loginButton;
    private TextView registerSwitchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerSwitchText = findViewById(R.id.registerSwitchText);

        registerSwitchText.setOnClickListener((v) -> {
            Intent i = new Intent(this, RegisterActivity.class);
            startActivity(i);
        });

        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener((v) -> {
            Intent i = new Intent(this, CapmonListActivity.class);
            startActivity(i);
        });
    }
}