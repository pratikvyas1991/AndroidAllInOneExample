package vp.androidallinoneexample.notificationexample;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import vp.androidallinoneexample.R;

/**
 * Created by Vyas on 6/8/2016.
 */
public class NotificationActivity extends Activity {
    Button notification_show,notification_clear;
    Notification notification;
    NotificationManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_base);
        notification_show=(Button)findViewById(R.id.button_show);
        notification_clear=(Button)findViewById(R.id.button_clear);

        manager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);

        notification_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notifyME();
            }
        });

        notification_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                manager.cancel(11);
            }
        });
    }
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public void notifyME(){
        Intent notificationIntent = new Intent(this,NotificationView.class);
        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,notificationIntent,0);
        Notification.Builder builder= new Notification.Builder(NotificationActivity.this);
        builder.setAutoCancel(false);
        builder.setTicker("This is ticker text");
        builder.setContentTitle("All in One Application");
        builder.setContentText("You have a new Message");
        builder.setSmallIcon(R.drawable.home_giraffe_icon);
        builder.setContentIntent(pendingIntent);
//        builder.setOngoing(true); Uncommenting this block user to swipe the notification message on status bar
        builder.setSubText("This is sbuTEst");
        builder.setNumber(100);
        builder.build();

        notification= builder.getNotification();
        manager.notify(11,notification);
    }
}
