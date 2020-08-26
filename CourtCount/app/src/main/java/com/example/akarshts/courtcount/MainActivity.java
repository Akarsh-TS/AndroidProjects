package com.example.akarshts.courtcount;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int PointsB = 0, PointsA = 0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void PointsAplustwo(View view) {
        PointsA = PointsA + 2;
        displaya(PointsA);
    }

    public void PointsAplusthree(View view) {
        PointsA = PointsA + 3;
        displaya(PointsA);
    }

    public void PointsAplusone(View view) {
        PointsA = PointsA + 1;
        displaya(PointsA);
    }

    public void displaya(int points) {
        TextView textView = (TextView) findViewById(R.id.teama);
        textView.setText(String.valueOf(points));
    }

    public void PointsAplustwoB(View view) {
        PointsB = PointsB + 2;
        displayb(PointsB);
    }

    public void PointsAplusthreeB(View view) {
        PointsB = PointsB + 3;
        displayb(PointsB);
    }

    public void PointsAplusoneB(View view) {
        PointsB = PointsB + 1;
        displayb(PointsB);
    }

    public void displayb(int points) {
        TextView textView = (TextView) findViewById(R.id.teamb);
        textView.setText(String.valueOf(points));
    }

    public void reset(View view) {
        PointsA = 0;
        PointsB = 0;
        TextView textViewA = (TextView) findViewById(R.id.teama);
        textViewA.setText("0");
        TextView textViewB = (TextView) findViewById(R.id.teamb);
        textViewB.setText("0");
    }
}
