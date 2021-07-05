package com.booleanag.capmon.persistance;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.booleanag.capmon.model.Capmon;


@Database(entities = {Capmon.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static final  String  DB_NAME = "CapmonDB";
    private static AppDatabase capmonDB;

    //getter creates db if not existing
    public static AppDatabase getCapmonDB(Context context){
        if (capmonDB == null) {
            capmonDB = Room.databaseBuilder(context, AppDatabase.class, DB_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return capmonDB;
    }

    public abstract CapmonDao getCapmonDao();
}
