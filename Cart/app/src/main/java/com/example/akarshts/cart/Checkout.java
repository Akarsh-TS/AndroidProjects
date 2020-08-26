package com.example.akarshts.cart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static com.example.akarshts.cart.R.id.list1;

public class Checkout extends AppCompatActivity {
TextView t1;
    String t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
    t1=(TextView)findViewById(list1);
        t2=getIntent().getStringExtra("n");

        //try {
          //  Scanner scanner=new Scanner(openFileInput("todo.txt"));
            //while (scanner.hasNext()){
              //  String todo=scanner.nextLine();
                t1.setText(t2);
            //}
            //scanner.close();
        //}
        //catch (FileNotFoundException e){
          //  e.printStackTrace();
       // }
    }
}

