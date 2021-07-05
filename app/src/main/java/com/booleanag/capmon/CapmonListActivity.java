package com.booleanag.capmon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.booleanag.capmon.persistance.AppDatabase;
import com.booleanag.capmon.persistance.CapmonDao;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CapmonListActivity extends AppCompatActivity {

    //fields
    private CapmonDao capmonDao;
    private FloatingActionButton addCapmon;
    private FloatingActionButton sendCapmon;
    private TextView capmonNameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //creates recycler view
        setContentView(R.layout.activity_capmon_list);
        RecyclerView recyclerView = findViewById(R.id.capmonRecyclerView);
        recyclerView.setHasFixedSize(true);

        //initialise dao
        capmonDao = AppDatabase.getCapmonDB(getApplicationContext()).getCapmonDao();

        //manages the layout of the recycler view
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //getting all apprentices from database and then listing them into the recycler view
        CapmonAdapter capmonAdapter = new CapmonAdapter(capmonDao.getAll());
        recyclerView.setAdapter(capmonAdapter);

        sendCapmon = findViewById(R.id.sendCapmon);

        sendCapmon.setOnClickListener((v) -> {
            Intent i = new Intent(this, SendCapmon.class);
            startActivity(i);
        });

        //initialise add apprentice button and
        addCapmon = findViewById(R.id.addCapmon);
        //when add button is clicked, the create apprentice activity is called
        addCapmon.setOnClickListener((v) -> {
            Intent i = new Intent(this, CreateCapmonActivity.class);
            startActivity(i);
        });
    }

}