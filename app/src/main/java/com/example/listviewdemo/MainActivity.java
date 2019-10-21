package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.myListView);

        final ArrayList<String> myFamily = new ArrayList<>();

        myFamily.add("Dani");
        myFamily.add("Dennis");
        myFamily.add("Kida");
        myFamily.add("Nala");
        myFamily.add("Mom");
        myFamily.add("Siani");
        myFamily.add("Kiki");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);

        // now the listView knows what adapter to use
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            // a listener to see which item in the listView is clicked
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // the ? means that there are different types of Collections that can gbe used
                //parent.setVisibility(View.GONE); to make it disappaer
                // view is the individual item that has been clicked on
                // aparent is the entire listView
                //counts items starting form 0 and given in position
                Log.i("Name of member", myFamily.get(position));
            }
        });
    }
}
