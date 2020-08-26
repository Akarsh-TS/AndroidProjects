package com.example.akarshts.myapplication;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count = 5;
    Button start;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (Button) findViewById(R.id.start);
        display = (TextView) findViewById(R.id.display);

        start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                CountDownTimer timer = new CountDownTimer(5000, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        display.setText("seconds remaining: " + millisUntilFinished / 1000);
                    }

                    public void onFinish() {
                        display.setText("done!");
                        sendnot();

                    }
                }.start();

            }
        });
    }

    public void sendnot() {
        int tag=12345;
        NotificationCompat.Builder notif=new NotificationCompat.Builder(this);
        notif.setAutoCancel(true);
        notif.setContentText("TIMER HAS FINISHED");
        notif.setSmallIcon(R.mipmap.ic_launcher);
        notif.setWhen(System.currentTimeMillis());
        notif.setContentTitle("REMINDER");
        Intent intent=new Intent(this,MainActivity.class);
        PendingIntent pend=PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        notif.setContentIntent(pend);
        NotificationManager nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        nm.notify(tag,notif.build());

    }
}