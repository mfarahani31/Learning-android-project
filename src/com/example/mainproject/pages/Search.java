/*
package com.example.mainproject.pages;

import android.app.Activity;
import android.app.Service;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.*;
import com.example.mainproject.R;

import java.util.ArrayList;
import java.util.Arrays;

*/
/**
 * Created by MOHAMMAD on 16/03/2015.
 *//*

public class Search extends Activity {

     EditText searchbox;
    ListView mainListView;
    Button searchbutton;
     ArrayAdapter<String> listAdapter;

    public void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.search);

        InputMethodManager imm = (InputMethodManager) this.getSystemService(Service.INPUT_METHOD_SERVICE);

        searchbox = (EditText) findViewById(R.id.searchbox);
        searchbutton = (Button) findViewById(R.id.searchboxbutton);

        //for hide keyboard
        System.out.println("hellooo");
        imm.hideSoftInputFromWindow(searchbox.getWindowToken(), 0);
        System.out.println("hellooo");

        mainListView = (ListView) findViewById(R.id.list);

        // Create and populate a List of planet names.
       */
/* String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"};
       *//*

        final ArrayList planetList = new ArrayList();
        // planetList.addAll( Arrays.asList(planets) );

       */
/* for (int i=0;i<planets.length;i++) {
            planetList.add(planets[i]);
            System.out.println("Hiiii ------  :  "+planetList.get(i));
        }*//*

        // Create ArrayAdapter using the planet list.
        listAdapter = new ArrayAdapter(this, R.layout.listraw, planetList);

        // Add more planets. If you passed a String[] instead of a List<String>
        // into the ArrayAdapter constructor, you must not add more items.
        // Otherwise an exception will occur.
     */
/*   listAdapter.add( "Ceres" );
        listAdapter.add( "Pluto" );
        listAdapter.add( "Haumea" );
        listAdapter.add( "Makemake" );
        listAdapter.add( "Eris" );*//*


        // Set the ArrayAdapter as the ListView's adapter.
        //  mainListView.setAdapter( listAdapter );
        System.out.println("hellooo");
   searchbutton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        try {

            System.out.println("HI-------   :   " + searchbox.getText().toString());
            SQLiteDatabase database = openOrCreateDatabase("JOBS", MODE_PRIVATE, null);
            Cursor cursor = database.rawQuery("SELECT ID,TEL,CELL,ADRESS,MAIL,JOB FROM JOBS WHERE COMPANYNAME = " + searchbox.getText().toString() + ";", null);
            //Cursor cursor = database.rawQuery("SELECT ID,NAME FROM T1 WHERE NAME = " + editTextName.getText().toString() +";", null);
            //cursor.moveToNext();
            //Toast.makeText(getApplicationContext(),cursor.getString(cursor.getColumnIndex("NAME")),Toast.LENGTH_SHORT).show();
            String row = "";
            while (cursor.moveToNext()) {
                //String companyname = cursor.getString(cursor.getColumnIndex("COMPANYNAME"));
                int id = cursor.getInt(cursor.getColumnIndex("ID"));
                String job = cursor.getString(cursor.getColumnIndex("JOB"));
                String mail = cursor.getString(cursor.getColumnIndex("MAIL"));
                String adress = cursor.getString(cursor.getColumnIndex("ADRESS"));
                long tel = cursor.getInt(cursor.getColumnIndex("TEL"));
                long cell = cursor.getInt(cursor.getColumnIndex("CELL"));


                row = row + "ID is : " + id + "Tel is : " + tel + "CELL is : " + cell
                        + "ADRESS is : " + adress + "MAIL is : " + mail + "JOB is : " + job + "\r\n";

                planetList.add(row);


                //Toast.makeText(getApplicationContext(), row, Toast.LENGTH_SHORT).show();

            }
            database.close();
            mainListView.setAdapter(listAdapter);
        } catch (Exception ex) {
            Toast.makeText(getApplicationContext(), ex + "", Toast.LENGTH_SHORT).show();
        }
        System.out.println("dfbgngfngf");


    }
});
}}*/
