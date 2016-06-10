package vp.androidallinoneexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Vyas on 6/9/2016.
 */
public class OptionMenuExample extends Activity {
    TextView title;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_button_layout);
        title=(TextView)findViewById(R.id.one_button_title);
        title.setText("Simple Option Menu Example");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"Item 1 Selected ",Toast.LENGTH_LONG).show();
                return true;
            case R.id.insert:
                Toast.makeText(getApplicationContext(),"Item 2 selected ",Toast.LENGTH_LONG).show();
                return true;
            case  R.id.delete:
                Toast.makeText(getApplicationContext(),"Item 3 selected ",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
