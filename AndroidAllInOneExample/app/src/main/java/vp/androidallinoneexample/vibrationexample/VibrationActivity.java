package vp.androidallinoneexample.vibrationexample;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

import vp.androidallinoneexample.R;

/**
 * Created by Vyas on 6/9/2016.
 */
public class VibrationActivity extends Activity {
    Button simpleVibtationBtn,patternVibrationBtn,cancelVibrationBtn;
    Vibrator vibrator;
    long[] pattern={0,200,4000};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vibration_layout);
        simpleVibtationBtn =(Button)findViewById(R.id.vibrate_button);
        patternVibrationBtn=(Button)findViewById(R.id.vibrate_button1);
        cancelVibrationBtn=(Button)findViewById(R.id.vibrate_cancel);

        vibrator =(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);

        cancelVibrationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.cancel();
            }
        });

        patternVibrationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(pattern,1);
            }
        });
        simpleVibtationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrator.vibrate(1000);
            }
        });
    }
}
