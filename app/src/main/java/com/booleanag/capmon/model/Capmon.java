package com.booleanag.capmon.model;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

//create table
@Entity
public class Capmon {

    //Autoincrement
    @PrimaryKey(autoGenerate = true)
    private int id;

    //Column Name stays the name as variable if nothing else defined
    private String name;

    private String type;

    private String attack;

    private String region;

    //constructor
    public Capmon(String name, String type, String attack, String region) {
        this.name = name;
        this.type = type;
        this.attack = attack;
        this.region = region;

    }

    //getter und setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}
