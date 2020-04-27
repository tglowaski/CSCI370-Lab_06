package com.tglowaski.lab06.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.tglowaski.lab06.PersonDao;
import com.tglowaski.lab06.entities.Person;

@Database(entities = {Person.class}, version = 1)
public abstract class LabDatabase extends RoomDatabase {

    public abstract PersonDao personDao();

}