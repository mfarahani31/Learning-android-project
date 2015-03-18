package com.example.mainproject.pages;

import android.app.Activity;
import android.app.Service;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.*;
import com.example.mainproject.R;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by MOHAMMAD on 16/03/2015.
 */
public class Search extends Activity {

   public EditText searchbox ;
    ListView mainListView;
    Button searchbutton;
    private ArrayAdapter<String> listAdapter ;
    public void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.search);

        InputMethodManager imm = (InputMethodManager)this.getSystemService(Service.INPUT_METHOD_SERVICE);

     searchbox = (EditText) findViewById(R.id.searchbox);

        //for hide keyboard

        imm.hideSoftInputFromWindow(searchbox.getWindowToken(), 0);
        mainListView = (ListView) findViewById( R.id.list );

        // Create and populate a List of planet names.
        String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"};
        ArrayList<String> planetList = new ArrayList<String>();
        planetList.addAll( Arrays.asList(planets) );

        // Create ArrayAdapter using the planet list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.listraw, planetList);

        // Add more planets. If you passed a String[] instead of a List<String>
        // into the ArrayAdapter constructor, you must not add more items.
        // Otherwise an exception will occur.
        listAdapter.add( "Ceres" );
        listAdapter.add( "Pluto" );
        listAdapter.add( "Haumea" );
        listAdapter.add( "Makemake" );
        listAdapter.add( "Eris" );

        // Set the ArrayAdapter as the ListView's adapter.
        mainListView.setAdapter( listAdapter );


    searchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    SQLiteDatabase database = openOrCreateDatabase("JOBS", MODE_PRIVATE, null);
                    Cursor cursor = database.rawQuery("SELECT COMPANYNAME,TEL,CELL,ADRESS,MAIL,JOB FROM T1 WHERE NAME = " + searchbox.toString() + ";", null);
                    //Cursor cursor = database.rawQuery("SELECT ID,NAME FROM T1 WHERE NAME = " + editTextName.getText().toString() +";", null);
                    //cursor.moveToNext();
                    //Toast.makeText(getApplicationContext(),cursor.getString(cursor.getColumnIndex("NAME")),Toast.LENGTH_SHORT).show();
                    String row = "";
                    while (cursor.moveToNext()) {
                        String name = cursor.getString(cursor.getColumnIndex("NAME"));
                        int id = cursor.getInt(cursor.getColumnIndex("ID"));
                        row = "ID is : " + id + "     Name is : " + name;
                        Toast.makeText(getApplicationContext(), row, Toast.LENGTH_SHORT).show();

                    }
                    database.close();
                } catch (Exception ex) {
                    Toast.makeText(getApplicationContext(), ex + "", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
