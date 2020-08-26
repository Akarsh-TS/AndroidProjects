package com.example.akarshts.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Displayactivity extends AppCompatActivity {
    TextView textView;
    String username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayactivity);

        textView=(TextView) findViewById(R.id.textView);
        username=getIntent().getStringExtra("username");
        password=getIntent().getStringExtra("password");
       /* if(username.equals("msrit") && password.equals("student")){
            textView.setText("welcome"+username);

        }
        else {
            textView.setText("INcorrect");
        }*/
    }
}
