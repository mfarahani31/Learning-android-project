package com.example.mainproject;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MOHAMMAD on 17/03/2015.
 */
public class Helpbutton extends Activity {
    TextView help;
    Button close;
    final Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helpdialog);

        close = (Button) findViewById(R.id.dialogButtonOK);
        help = (TextView) findViewById(R.id.helptext);



    }
    public void helpMethode(String str){

        help.setText(str);
    }
    public void clickHelp(){

        // custom dialog
        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.helpdialog);
        dialog.setTitle("Title...");

        // set the custom dialog components - text, image and button




        // if button is clicked, close the custom dialog
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    }

