package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.myListView);

        ArrayList<String> myFamily = new ArrayList<>();

        myFamily.add("Dani");
        myFamily.add("Dennis");
        myFamily.add("Kida");
        myFamily.add("Nala");
        myFamily.add("Mom");
        myFamily.add("Siani");
        myFamily.add("Kiki");

        
    }
}
