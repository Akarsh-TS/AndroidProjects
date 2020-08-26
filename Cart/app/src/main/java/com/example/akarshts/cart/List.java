package com.example.akarshts.cart;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class List extends AppCompatActivity {
    Button b1, b2, b3, b4;
    PrintWriter pw;
    String w="";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        try {
            pw = new PrintWriter(openFileOutput("todo.txt", Context.MODE_PRIVATE));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void onClick1(View view){
        String n=b1.getText().toString();
        //pw.append(n);
        w=w+n;
    }
    public void onClick3(View view){
        String n=b3.getText().toString();
        w=w+n;    }
    public void onClick2(View view){
        String n=b2.getText().toString();
        w=w+n;    }
public void checkout(View view){
    Intent i=new Intent(this,Checkout.class);
    i.putExtra("n",w);

    startActivity(i);
}

}