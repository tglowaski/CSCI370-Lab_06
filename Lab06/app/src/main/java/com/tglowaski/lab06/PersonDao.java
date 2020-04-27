package com.tglowaski.lab06;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.tglowaski.lab06.entities.Person;

import java.util.List;

@Dao
public interface PersonDao {
    @Insert
    void insertPerson(Person person);

    @Query("SELECT * FROM Person")
    List<Person> getAllPersons();
}
