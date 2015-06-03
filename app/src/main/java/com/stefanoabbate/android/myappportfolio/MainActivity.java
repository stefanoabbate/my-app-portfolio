package com.stefanoabbate.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Context context;
    private final int duration = Toast.LENGTH_SHORT;
    private Button buttonSpotify;
    private Button buttonScores;
    private Button buttonLibrary;
    private Button buttonBigger;
    private Button buttonReader;
    private Button buttonMyOwnApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();

        buttonSpotify = (Button) findViewById(R.id.button_spotify);
        buttonSpotify.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = buttonSpotify.getText();
                Toast.makeText(context, text, duration).show();
            }
        });

        buttonScores = (Button) findViewById(R.id.button_scores);
        buttonScores.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = buttonScores.getText();
                Toast.makeText(context, text, duration).show();
            }
        });

        buttonLibrary = (Button) findViewById(R.id.button_library);
        buttonLibrary.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = buttonLibrary.getText();
                Toast.makeText(context, text, duration).show();
            }
        });

        buttonBigger = (Button) findViewById(R.id.button_bigger);
        buttonBigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = buttonBigger.getText();
                Toast.makeText(context, text, duration).show();
            }
        });

        buttonReader = (Button) findViewById(R.id.button_reader);
        buttonReader.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = buttonReader.getText();
                Toast.makeText(context, text, duration).show();
            }
        });

        buttonMyOwnApp = (Button) findViewById(R.id.button_myownapp);
        buttonMyOwnApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CharSequence text = buttonMyOwnApp.getText();
                Toast.makeText(context, text, duration).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
