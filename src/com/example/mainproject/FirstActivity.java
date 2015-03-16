package com.example.mainproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by MOHAMMAD on 16/03/2015.
 */
public class FirstActivity extends Activity {


    private final int splash_delay=1500;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(FirstActivity.this,MyActivity.class);
                FirstActivity.this.startActivity(mainIntent);
                FirstActivity.this.finish();
            }
        }, splash_delay);

    }
    public void onBackPressed(){

    }
}
