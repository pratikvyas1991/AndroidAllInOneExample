package vp.androidallinoneexample.broadcastrecieverexample;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import vp.androidallinoneexample.R;

/**
 * Created by Vyas on 6/9/2016.
 */
public class BroadcastActivity extends Activity {
    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.broadcast_layout);
        mButton =(Button)findViewById(R.id.broadcast_button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent();
                intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                intent.setAction("vp.androidallinoneexample.BroadcastProgramatically");
                intent.putExtra("Foo","BAr");
                sendBroadcast(intent);
            }
        });

        IntentFilter filter = new IntentFilter("vp.androidallinoneexample.BroadcastProgramatically");
        MyReciever reciever = new MyReciever();
        registerReceiver(reciever,filter);

    }


    @Override
    protected void onPause() {
        MyReciever reciever = new MyReciever();
        unregisterReceiver(reciever);
        super.onPause();
    }
}
