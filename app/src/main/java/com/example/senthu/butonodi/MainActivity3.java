package com.example.senthu.butonodi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
}
//    Button buttn;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        buttn= findViewById(R.id.btnbu);
//
//        buttn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NotificationManager notificationManager=(NotificationManager)
//                        getApplicationContext().getSystemService(
//                                Context.NOTIFICATION_SERVICE
//                        );
//
//                Intent intent1= new Intent(MainActivity.this,MainActivity.class);
//
//                intent1.putExtra("yes",true);
//                intent1.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
//
//                PendingIntent pendingIntent1= PendingIntent.getActivity(MainActivity.this,0,intent1,
//                        PendingIntent.FLAG_ONE_SHOT);
//
//                Intent intent2= new Intent(MainActivity.this,MainActivity2.class);
//                intent2.putExtra("no",false);
//                intent2.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP |Intent.FLAG_ACTIVITY_NEW_TASK);
//
//                PendingIntent  pendingIntent2= PendingIntent.getActivity(MainActivity.this,1,intent2,
//                        PendingIntent.FLAG_ONE_SHOT);
//
//
//                Uri uri= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
//
//                NotificationCompat.Builder builder= new NotificationCompat.Builder(
//                        MainActivity.this,getString(R.string.app_name)
//
//                );
//
//                builder.setContentTitle("REQUES");
//                builder.setContentText("Are you sure");
//                builder.setSmallIcon(R.drawable.ic_launcher_background);
//                builder.setSound(uri);
//                builder.setAutoCancel(true);
//                builder.setPriority(NotificationCompat.PRIORITY_HIGH);
//                builder.addAction(R.drawable.ic_launcher_background,"yes",pendingIntent1);
//
//                builder.addAction(R.drawable.ic_launcher_background,"no",pendingIntent2);
//
//                notificationManager.notify(1,builder.build());
//
//
//            }
//        });
//    }