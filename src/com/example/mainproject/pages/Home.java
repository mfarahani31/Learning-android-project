package com.example.mainproject.pages;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.example.mainproject.R;

/**
 * Created by MOHAMMAD on 17/03/2015.
 */
public class Home extends Activity{

    Button place;
    Button place2;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.requestFocusFromTouch();

        place = (Button) findViewById(R.id.button1);
        place2 = (Button) findViewById(R.id.button2);

        place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
