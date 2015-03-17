package com.example.mainproject;

import android.app.Activity;
import android.app.Service;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * Created by MOHAMMAD on 16/03/2015.
 */
public class Search extends Activity {

    EditText editText;
    public void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.search);

        InputMethodManager imm = (InputMethodManager)this.getSystemService(Service.INPUT_METHOD_SERVICE);

    editText = (EditText) findViewById(R.id.editText);

        //for hide keyboard

        imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);

    }
}
