package com.example.mainproject.pages;

import android.app.Activity;
import android.app.Service;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.example.mainproject.R;

/**
 * Created by MOHAMMAD on 16/03/2015.
 */
public class Search extends Activity {

    EditText editText;
    public void onCreate(Bundle s){
        super.onCreate(s);
        setContentView(R.layout.search);

        InputMethodManager imm = (InputMethodManager)this.getSystemService(Service.INPUT_METHOD_SERVICE);

    editText = (EditText) findViewById(R.id.editText1);

        //for hide keyboard

        imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);

    }
}
