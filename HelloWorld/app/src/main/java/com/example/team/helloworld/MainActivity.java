package com.example.team.helloworld;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar); //setting the toolbar as the ActionBar

        //Creating the tabs using the SimpleTabsActivity class
        startActivity(new Intent(MainActivity.this, SimpleTabsActivity.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Adding buttons to the ActionBar (such as the profile icon, notifications, settings and pay icons).
        // Check menu_main.xml
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId(); // refer to menu_main.xml for the IDs

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.action_profile) {
            //do something when the profile icon is clicked
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
