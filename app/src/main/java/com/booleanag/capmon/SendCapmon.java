package com.booleanag.capmon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SendCapmon extends AppCompatActivity {

    private FloatingActionButton confirmSendButton;
    private ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_capmon);

        backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener((v) -> {
            Intent i = new Intent(this, CapmonListActivity.class);
            startActivity(i);
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, getResources().getStringArray(R.array.capmons));
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.yourCapmonList);
        textView.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, getResources().getStringArray(R.array.receivers));
        AutoCompleteTextView textView2 = (AutoCompleteTextView)
                findViewById(R.id.receiverList);
        textView2.setAdapter(adapter2);

        confirmSendButton = findViewById(R.id.confirmSendButton);

        confirmSendButton.setOnClickListener((v) -> {
            Intent i = new Intent(this, CapmonListActivity.class);
            startActivity(i);
        });
    }
}