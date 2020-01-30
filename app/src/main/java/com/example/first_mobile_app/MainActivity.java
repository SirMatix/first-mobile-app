package com.example.first_mobile_app;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*   creating object of a Button type, named after the object in XML from design
        *    the assign a value of search result of method findViewById     */
        Button addBtn = (Button) findViewById(R.id.addBtn);

    }
}
