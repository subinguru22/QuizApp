package com.example.subin.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.Button;


public class MenuScreen extends AppCompatActivity {

    String get;
    Toast toast;
    TextView textTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);

        textTV = (TextView) findViewById(R.id.textTV);

        Intent intent = getIntent();//recieving the intent send by the Navigation activity
        get = intent.getStringExtra(MainActivity.Message);//converting that intent message to string using the getStringExtra() method
        toast = new Toast(this);

        Toast.makeText(getApplicationContext(),
                get,
                Toast.LENGTH_LONG).show();

    }
}
