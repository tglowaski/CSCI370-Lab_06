package com.tglowaski.lab06.asyncs;

import android.os.AsyncTask;
import android.widget.Toast;

import com.tglowaski.lab06.data.LabDatabase;
import com.tglowaski.lab06.entities.Person;

public class insert extends AsyncTask<Person, Void, Void> {


    private LabDatabase database;
    public insert(LabDatabase database) {
        this.database = database;
    }
    @Override
    protected Void doInBackground(Person... people) {

        database.personDao().insertPerson(people[0]);
        return null;
    }

}