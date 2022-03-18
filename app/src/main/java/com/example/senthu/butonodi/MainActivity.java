package com.example.senthu.butonodi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//    Button buttn;
//    NotificationManagerCompat notificationManagerCompat;
//    Notification notification;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        buttn = findViewById(R.id.btnbu);
//
//        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.O){
//            NotificationChannel channel = new NotificationChannel("mych","my chanal",NotificationManager.IMPORTANCE_DEFAULT);
//            NotificationManager manager= getSystemService(NotificationManager.class);
//            manager.createNotificationChannel(channel);
//        }
//
//        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"mych")
//                .setSmallIcon(android.R.drawable.stat_notify_sync)
//                .setContentText("this is the body")
//                .setContentTitle("First nodification");
//
//        notification= builder.build();
//
//        notificationManagerCompat= notificationManagerCompat.from(this);
//
//
//    }
//    public void push(View view){
//        notificationManagerCompat.notify(1,notification);
//
//    }
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNotification();
            }
        });
    }

    private void addNotification() {
        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.ic_baseline_mic_none_24)
                        .setContentTitle("Notifications Example")
                        .setContentText("This is a test notification");

        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);

        // Add as notification
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
    }
}