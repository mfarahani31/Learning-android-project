package com.example.mainproject;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by MOHAMMAD on 18/03/2015.
 */
public class Database extends Activity {

    public void insert(int id,String companyname,long tel,long cell,String adress,String mail,String job){
        try {

            SQLiteDatabase sqLiteDatabase = openOrCreateDatabase("JOBS", MODE_PRIVATE, null);
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS T1(ID INT(3),COMPANYNAME VARCHAR,TEL INT(8),CELL INT(12),ADRESS VARCHAR," +
                    "MAIL VARCHAR,JOB VARCHAR);");

            ContentValues values = new ContentValues();
            values.put("ID", id);
            values.put("COMPANYNAME", companyname);
            values.put("TEL", tel);
            values.put("CELL", cell);
            values.put("ADRESS", adress);
            values.put("MAIL", mail);
            values.put("JOB", job);

            sqLiteDatabase.insert("T1", null, values);
           // Toast.makeText(getApplicationContext(), "Row Insert", Toast.LENGTH_LONG).show();
        } catch (Exception ex) {
            //Toast.makeText(getApplicationContext(), ex + "", Toast.LENGTH_LONG).show();
        }
    }




        /*
        public void update (String x){
        try {
            SQLiteDatabase sqLiteDatabase = openOrCreateDatabase("JOBS", MODE_PRIVATE, null);

            ContentValues values = new ContentValues();
            values.put("NAME", x);

            String whereClause = "ID=?";
            String[] whereArgs = {x};

                  *//*int numberUpdate=*//*
            sqLiteDatabase.update("T1", values, whereClause, whereArgs);
            //Toast.makeText(getApplicationContext(),*//*numberUpdate+*//*" Rows update", Toast.LENGTH_SHORT).show();
        } catch (Exception ex) {
            //Toast.makeText(getApplicationContext(), ex + "", Toast.LENGTH_LONG).show();
        }

    }*/







      /*  public void delete (int id){
        try {
            SQLiteDatabase sqLiteDatabase = openOrCreateDatabase("ORCL", MODE_PRIVATE, null);
            String whereClause = "NAME=?";
            int[] whereArgs = {id};
            int numberDeleted = sqLiteDatabase.delete("T1", whereClause, whereArgs);
            //Toast.makeText(getApplicationContext(), numberDeleted + " Rows deleted", Toast.LENGTH_LONG).show();
        } catch (Exception ex) {
            Toast.makeText(getApplicationContext(), ex + "", Toast.LENGTH_LONG).show();
        }*/






/*
        public void select (){

            try {
            SQLiteDatabase database = openOrCreateDatabase("JOBS", MODE_PRIVATE, null);
            Cursor cursor = database.rawQuery("SELECT COMPANYNAME,TEL,CELL,ADRESS,MAIL,JOB FROM T1 WHERE NAME = " +  + ";", null);
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
    */






    //select all
        public void selectAll(){
            try
            {
                SQLiteDatabase database = openOrCreateDatabase("JOBS", MODE_PRIVATE, null);
                Cursor cursor = database.rawQuery("SELECT * FROM T1;", null);
                //cursor.moveToNext();
                //Toast.makeText(getApplicationContext(),cursor.getString(cursor.getColumnIndex("NAME")),Toast.LENGTH_SHORT).show();
                String row = "";

                while (cursor.moveToNext()) {

                    String companyname = cursor.getString(cursor.getColumnIndex("COMPANYNAME"));
                    int id = cursor.getInt(cursor.getColumnIndex("ID"));
                    long tel = cursor.getLong(cursor.getColumnIndex("TEL"));
                    long cell = cursor.getLong(cursor.getColumnIndex("CELL"));
                    String adress = cursor.getString(cursor.getColumnIndex("ADRESS"));
                    String mail = cursor.getString(cursor.getColumnIndex("MAIL"));
                    String job = cursor.getString(cursor.getColumnIndex("JOB"));
                    row = row + "ID is : " + id + "COMPANYNAME is : " + companyname + "tel is : " + tel + "CELL is : " + cell
                            + "ADRESS is : " + adress + "MAIL is : " + mail + "JOB is : " + job + "\r\n";
                }
                database.close();
                //Toast.makeText(getApplicationContext(),row,Toast.LENGTH_SHORT).show();
            }
            catch (Exception ex)
            {
             //   Toast.makeText(getApplicationContext(),ex+"",Toast.LENGTH_SHORT).show();
            }}}






