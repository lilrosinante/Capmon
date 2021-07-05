package com.booleanag.capmon.persistance;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.booleanag.capmon.model.Capmon;

import java.util.List;


@Dao
public interface CapmonDao {

    @Query("SELECT * FROM Capmon")
    List<Capmon> getAll();

    @Insert
    void insert(Capmon capmon);

}
