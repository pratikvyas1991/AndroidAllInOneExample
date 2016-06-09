package vp.androidallinoneexample.broadcastrecieverexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import vp.androidallinoneexample.R;

/**
 * Created by Vyas on 6/9/2016.
 */
public class BroadcastActivity1 extends Activity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.broadcast_layout);
        button=(Button)findViewById(R.id.broadcast_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent();
                intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                intent.setAction("vp.androidallinoneexample.BroadcastReciever");
                intent.putExtra("Foo","BAr");
                sendBroadcast(intent);
            }
        });
    }
}
