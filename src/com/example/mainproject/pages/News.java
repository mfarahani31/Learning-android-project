package com.example.mainproject.pages;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.mainproject.R;

/**
 * Created by MOHAMMAD on 16/03/2015.
 */
public class News extends Activity{

    Button help;
    Button about;
    Button rss;
    Button home;
    Button search;
    public void onCreate(Bundle savedIn){
        super.onCreate(savedIn);
        setContentView(R.layout.news);
       /* help = (Button) findViewById(R.id.help);
        about = (Button) findViewById(R.id.about);
        rss = (Button) findViewById(R.id.rss);
        home = (Button) findViewById(R.id.home);
        search = (Button) findViewById(R.id.search);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News.this,MyActivity.class);
                startActivity(intent);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                NoteDialogWin shareWin = new NoteDialogWin(News.this);

                shareWin.setCanceledOnTouchOutside(false);
                shareWin.show();

            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News.this,Help.class);
                startActivity(intent);
            }
        });
*/
    }
}
