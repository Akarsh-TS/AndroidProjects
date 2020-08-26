package com.example.akarshts.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(EditText)findViewById(R.id.editText);
        password=(EditText)findViewById(R.id.editText2);
        login=(Button)findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener(){
            @Override


            public void onClick(View v){
                Log.v("username",username.getText().toString());
                Log.v("password",password.getText().toString());

                if(username.getText().toString().equals("dhaneesh") && password.getText().toString().equals("student")){
                    Intent i=new Intent(MainActivity.this,Displayactivity.class);
                    startActivity(i);

                }
                else {
                    Context context = getApplicationContext();
                    CharSequence text = "Username or Password Incorect!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();                }
                //i.putExtra("username",username.getText().toString());
                //i.putExtra("password",password.getText().toString());
            }
        });
    }
}