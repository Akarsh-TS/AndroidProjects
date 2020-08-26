
package com.example.akarshts.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp,bm,bmu,bd,beq,bc;
    EditText res,edit1;
    boolean add,sub,mul,div;
    float op1,op2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.one);
        b2=(Button)findViewById(R.id.two);
        b3=(Button)findViewById(R.id.three);
        b4=(Button)findViewById(R.id.four);
        b5=(Button)findViewById(R.id.five);
        b6=(Button)findViewById(R.id.six);
        b7=(Button)findViewById(R.id.seven);
        b8=(Button)findViewById(R.id.eight);
        b9=(Button)findViewById(R.id.nine);
        b0=(Button)findViewById(R.id.zero);
        bp=(Button)findViewById(R.id.plus);
        bm=(Button)findViewById(R.id.minus);
        bd=(Button)findViewById(R.id.divide);
        bmu=(Button)findViewById(R.id.multiply);
        bc=(Button)findViewById(R.id.clear);
        beq=(Button)findViewById(R.id.equal);
        res=(EditText)findViewById(R.id.answer);
        edit1=(EditText)findViewById(R.id.editText);

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                edit1.setText("1");
                res.append("1");
        }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                edit1.setText("2");
                res.append("2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                edit1.setText("3");
                res.append("3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                edit1.setText("4");
                res.append("4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                edit1.setText("5");
                res.append("5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                edit1.setText("6");
                res.append("6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                edit1.setText("7");
                res.append("7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                edit1.setText("8");
                res.append("8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                edit1.setText("9");
                res.append("9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                edit1.setText("0");
                res.append("0");
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1 == null) {
                    edit1.setText("");

                } else {
                    add = true;
                    op1 = Float.parseFloat(edit1.getText().toString());
                    edit1.setText("");
                    res.append(edit1.getText() + "+");
                }
            }

        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1 == null) {
                    edit1.setText("");

                } else {
                    sub = true;
                    op1 = Float.parseFloat(edit1.getText().toString());
                    edit1.setText("");
                    res.append(edit1.getText() + "-");
                }
            }

        });
        bmu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (edit1==null){
                    edit1.setText("");

                }
                else{
                    mul=true;
                    op1=Float.parseFloat(edit1.getText().toString());
                    edit1.setText("");
                    res.append(edit1.getText()+"*");
                }
            }

            });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1 == null) {
                    edit1.setText("");

                } else {
                    div = true;
                    op1 = Float.parseFloat(edit1.getText().toString());
                    edit1.setText("");
                    res.append(edit1.getText() + "/");
                }
            }

        });
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op2 = Float.parseFloat(edit1.getText().toString());
                if (add == true) {
                    edit1.setText(op1 + op2 + "");
                    add = false;
                    res.append("=" + edit1.getText().toString());


                }
                if (sub == true) {
                    edit1.setText(op2 - op1 + "");
                    sub = false;
                    res.append("=" + edit1.getText().toString());


                }
                if (mul == true) {
                    edit1.setText(op1 * op2 + "");
                    mul = false;
                    res.append("=" + edit1.getText().toString());


                }
                if (div == true) {
                    edit1.setText(op2 / op1 + "");
                    add = false;
                    res.append("=" + edit1.getText().toString());


                }
            }

        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText("");
                res.setText(null);
            }

        });
}
}