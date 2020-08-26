package com.example.akarshts.justjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        Intent intent=new Intent(Intent.ACTION_SENDTO);
        intent.putExtra(Intent.EXTRA_SUBJECT,"HI");
        intent.putExtra(Intent.EXTRA_TEXT,"havfjafja\nahbakbfkabkfbakj\n");
        intent.putExtra(Intent.EXTRA_EMAIL,"ts.akarsh@gmail.com");
        intent.setData(Uri.parse("mailto:"));
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);
        }
    }
    int quantity=2;
    public void increment(View view){

        quantity=quantity+1;
        String no="Total:"+(quantity*5);
        no=no+"\nThank You";
        displayPrice(no);

        display(quantity);}
    public void decrement(View view){

        quantity=quantity-1;

        display(quantity);
        String no="Total:"+(quantity*5);
        no=no + "\nThank You";
        displayPrice(no);}

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(String no) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(no);
    }
}