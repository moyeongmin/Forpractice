package com.example.forpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nextbtn = findViewById(R.id.button);


        nextbtn.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,secondactivity.class);
                startActivity(i);
                //10.23 14:45 test1
                //18:23 test2
                //19:07 test3

            }
        });
}
}