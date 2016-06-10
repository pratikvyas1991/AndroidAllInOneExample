package vp.androidallinoneexample;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Vyas on 6/9/2016.
 */
public class CheckNetPermission extends Activity {
    TextView title;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_button_layout);
        title=(TextView)findViewById(R.id.one_button_title);
        btn=(Button)findViewById(R.id.one_button_button);
        title.setText("Check Internet Conection");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String networkType="Not selected !!!" ;
                Boolean checkIT = isOnline();
                 if(typeOfNetwork()!=null){
                     networkType = typeOfNetwork();
                 }
                if(checkIT){
                    Toast.makeText(getApplicationContext(),"Net is working ",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Net is Not connected ",Toast.LENGTH_LONG).show();
                }
                Toast.makeText(getApplicationContext(),"Network Type : "+networkType,Toast.LENGTH_LONG).show();
            }
        });
    }

    public  boolean isOnline(){
        ConnectivityManager manager =(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        if(manager != null){
            NetworkInfo[] infos = manager.getAllNetworkInfo();
            if(infos != null){
                for(int i=0;i<infos.length;i++){
                    if(infos[i].getState()==NetworkInfo.State.CONNECTED){
                        return true;
                    }
                }

            }
        }
        return false;
    }
    public String typeOfNetwork(){
        ConnectivityManager manager =(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        if(manager!=null){
            NetworkInfo networkInfo = manager.getActiveNetworkInfo();
            boolean isWifi=networkInfo.getType()==ConnectivityManager.TYPE_WIFI;
            boolean isMobile=networkInfo.getType()==ConnectivityManager.TYPE_MOBILE;
            boolean isBluetooth=networkInfo.getType()==ConnectivityManager.TYPE_BLUETOOTH;
            if(isWifi){
                return "WIFI Cconnection";
            }else if(isBluetooth){
                return "Bluetooth";
            }else if (isMobile){
                return "Mobile Data";
            }
        }
        return null;
    }
}
