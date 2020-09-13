package com.example.mycompany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.home:
                startActivity(new Intent(MainActivity.this, MainActivity.class));
                break;
            case R.id.contact:
                startActivity(new Intent(MainActivity.this, Contacts.class));
                break;

            case R.id.presenation:
                startActivity(new Intent(MainActivity.this, Presentation.class));
                break;
            case R.id.temoin:
                startActivity(new Intent(MainActivity.this, Temoins.class));

        }
        return super.onOptionsItemSelected(item);
    }
}