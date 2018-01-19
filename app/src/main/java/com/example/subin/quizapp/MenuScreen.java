package com.example.subin.quizapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.Button;

import javax.xml.transform.Result;


public class MenuScreen extends AppCompatActivity {

    Toast toast;
    Button computerButton, generalKnowledgeButton, inventionsButton, scienceButton, sportsButton;

    public final static String Category = "com.example.subin.quizapp.CATEGORY";
    public final static String Score = "com.example.subin.quizapp.SCORE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);

        computerButton = (Button) findViewById(R.id.computerButton);
        generalKnowledgeButton = (Button) findViewById(R.id.generalKnowledgeButton);
        inventionsButton = (Button) findViewById(R.id.inventionsButton);
        scienceButton = (Button) findViewById(R.id.scienceButton);
        sportsButton = (Button) findViewById(R.id.sportsButton);

        Intent intent = getIntent();//recieving the intent send by the Navigation activity
        String message = intent.getStringExtra(MainActivity.Message);//converting that intent message to string using the getStringExtra() method
        toast = new Toast(this);

        Toast.makeText(getApplicationContext(),
                message,
                Toast.LENGTH_LONG).show();

        computerButton.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Computer selected",
                        Toast.LENGTH_LONG).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //Intent start to open the navigation drawer activity
                        Intent intent=new Intent(getApplicationContext(),ResultActivity.class);
                        intent.putExtra(Category, "Computers");//by this statement we are sending the name of the button that invoked the new Questions.java activity "Message" is defined by the name of the package + MESSAGE
                        intent.putExtra(Score, 11);
                        startActivity(intent);
                    }
                }, 2000);
            }
        });

        generalKnowledgeButton.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "General Knowledge selected",
                        Toast.LENGTH_LONG).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //Intent start to open the navigation drawer activity
                        Intent intent=new Intent(getApplicationContext(),ResultActivity.class);
                        intent.putExtra(Category, "General Knowledge");//by this statement we are sending the name of the button that invoked the new Questions.java activity "Message" is defined by the name of the package + MESSAGE
                        intent.putExtra(Score, 12);
                        startActivity(intent);
                    }
                }, 2000);
            }
        });

        inventionsButton.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Inventions selected",
                        Toast.LENGTH_LONG).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //Intent start to open the navigation drawer activity
                        Intent intent=new Intent(getApplicationContext(),ResultActivity.class);
                        intent.putExtra(Category, "Inventions");//by this statement we are sending the name of the button that invoked the new Questions.java activity "Message" is defined by the name of the package + MESSAGE
                        intent.putExtra(Score, 13);
                        startActivity(intent);
                    }
                }, 2000);

            }
        });

        scienceButton.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Science selected",
                        Toast.LENGTH_LONG).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //Intent start to open the navigation drawer activity
                        Intent intent=new Intent(getApplicationContext(),ResultActivity.class);
                        intent.putExtra(Category, "Science");//by this statement we are sending the name of the button that invoked the new Questions.java activity "Message" is defined by the name of the package + MESSAGE
                        intent.putExtra(Score, 14);
                        startActivity(intent);
                    }
                }, 2000);
            }
        });

        sportsButton.setOnClickListener (new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Sports selected",
                        Toast.LENGTH_LONG).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //Intent start to open the navigation drawer activity
                        Intent intent=new Intent(getApplicationContext(),ResultActivity.class);
                        intent.putExtra(Category, "Computers");//by this statement we are sending the name of the button that invoked the new Questions.java activity "Message" is defined by the name of the package + MESSAGE
                        intent.putExtra(Score, 15);
                        startActivity(intent);
                    }
                }, 2000);
            }
        });
    }
}
