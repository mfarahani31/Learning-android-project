package com.example.mainproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by MOHAMMAD on 17/03/2015.
 */
public class Home extends Activity{


    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.requestFocusFromTouch();
    }
}
