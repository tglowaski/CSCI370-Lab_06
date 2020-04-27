package com.tglowaski.lab06.asyncs;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;

import com.tglowaski.lab06.data.LabDatabase;
import com.tglowaski.lab06.entities.Person;
import com.tglowaski.lab06.entities.PersonsActivity;

import java.util.ArrayList;
import java.util.List;

public class pull extends AsyncTask<Person, Void, Void> {

    LabDatabase database;
    Context context;
    public pull(LabDatabase database, Context context) {
        this.context = context;
        this.database = database;
    }

    @Override
    protected Void doInBackground(Person... people) {
        List<Person> pp = database.personDao().getAllPersons();
        ArrayList<String> personNames = new ArrayList<>();
        //Toast.makeText(context, pp.get(0).getName(), Toast.LENGTH_LONG).show();
        for(Person p: pp) {
            personNames.add(p.getName());
        }

        Intent i = new Intent(context, PersonsActivity.class);
        i.putExtra("Persons", personNames);
        context.startActivity(i);


        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }
}