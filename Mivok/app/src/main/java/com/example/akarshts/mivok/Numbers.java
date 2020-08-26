package com.example.akarshts.mivok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<String> nos=new ArrayList<String>();
        nos.add("one");
        nos.add("two");
        nos.add("three");
        nos.add("four");
        nos.add("five");
        nos.add("six");
        nos.add("seven");
        nos.add("eight");
        nos.add("nine");
        nos.add("ten");
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nos);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);





    }
}
