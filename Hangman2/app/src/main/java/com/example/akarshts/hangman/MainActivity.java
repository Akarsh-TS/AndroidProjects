package com.example.akarshts.hangman;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    TextView t1;
    Random method;
    Random rand=new Random();
    StringBuilder myname=new StringBuilder() ;
    Button b;
    int points=0,lose=3,index;
    String[] word= {"happy", "animal", "android"};
    String r,r1;
    Boolean is=false;
    int in,de=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.textView);
        e1=(EditText) findViewById(R.id.textView2);
        b=(Button)findViewById(R.id.button);
        final int randomno=rand.nextInt(2-0+1)+0;
        r=word[randomno];
        for (int i=0;i<r.length();i++){
            r1="X"+r1;      }
        t1.setText(r1);


        b.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                    myname = new StringBuilder(r1);
                    char q;
                    String w, up;

                    char ww;
                    q = e1.getText().charAt(0);
                    w = word[randomno];

                    for (int i = 0; i < word[randomno].length(); i++) {
                        if (q == w.charAt(i)) {
                            myname.setCharAt(i, w.charAt(i));
                            is = true;


                        }
                    }
                        if (is == false) {
                            de = de - 1;
                        }


                        t1.setText(myname);
                        r1 = myname.toString();
                        e1.setText("");

                    if(de==0){
                        b.setEnabled(false);
                    }

            }
        });

    }
}
