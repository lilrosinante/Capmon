package com.booleanag.capmon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CreateCapmonActivity extends AppCompatActivity {

    private FloatingActionButton confirmButton;
    private ImageView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_capmon);

        backButton = findViewById(R.id.backButton);

        backButton.setOnClickListener((v) -> {
            Intent i = new Intent(this, CapmonListActivity.class);
            startActivity(i);
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, getResources().getStringArray(R.array.types));
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.typeList);
        textView.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, getResources().getStringArray(R.array.attacks));
        AutoCompleteTextView textView2 = (AutoCompleteTextView)
                findViewById(R.id.attackList);
        textView2.setAdapter(adapter2);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, getResources().getStringArray(R.array.regions));
        AutoCompleteTextView textView3 = (AutoCompleteTextView)
                findViewById(R.id.regionList);
        textView3.setAdapter(adapter3);

        confirmButton = findViewById(R.id.confirmButton);

        confirmButton.setOnClickListener((v) -> {
            Intent i = new Intent(this, CapmonListActivity.class);
            startActivity(i);
        });
    }
}