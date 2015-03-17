package com.example.mainproject.pages;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.example.mainproject.R;

/**
 * Created by MOHAMMAD on 16/03/2015.
 */
public class About extends Activity {
    TextView textView;
    public void onCreate(Bundle save){
        super.onCreate(save);
        setContentView(R.layout.about);
        textView = (TextView) findViewById(R.id.aboutbutton);
    }

/*
    public void Dialog() {


        // TODO Auto-generated method stub
        final Dialog dialog = null;
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.about);

        dialog.setTitle("درباره ما");
        *//*Button button = (Button)dialog.findViewById(R.id.about);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                dialog.dismiss();
            }
        });

        dialog.show();


}*//*}*/}
