package vp.androidallinoneexample.broadcastrecieverexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Vyas on 6/9/2016.
 */
public class MyReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"ACtion : "+intent.getAction(),Toast.LENGTH_LONG).show();
    }
}
