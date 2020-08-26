package com.example.akarshts.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE
        int raspberryPrice = 5;
        display("1 box: $" + raspberryPrice);
        display1("2 boxes: $" + (raspberryPrice * 2));
        display2("3 boxes: $" + (raspberryPrice * 3));
    }

    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */

    public void display(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text);
    }
    public void display1(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view1);
        t.setText(text);
    }

    public void display2(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view2);
        t.setText(text);
    }




}