package vp.androidallinoneexample.databaseexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import vp.androidallinoneexample.R;

/**
 * Created by Vyas on 6/9/2016.
 */
public class ContactDatabaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.database_home);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar_db);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"Default Database ",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ContactDatabaseActivity.this, ContactDatabaseActivity.class);
                startActivity(intent);
                return true;
            case R.id.insert:
                Toast.makeText(getApplicationContext(),"Insert",Toast.LENGTH_LONG).show();
                Intent intentInsert = new Intent(ContactDatabaseActivity.this, ContactInsertActivity.class);
                startActivity(intentInsert);
                return true;
            case R.id.count_contact:
                Toast.makeText(getApplicationContext(),"Insert",Toast.LENGTH_LONG).show();
                return true;
            case  R.id.view_one:
                Toast.makeText(getApplicationContext(),"View All",Toast.LENGTH_LONG).show();
                return true;
            case  R.id.view_All:
                Toast.makeText(getApplicationContext(),"View All",Toast.LENGTH_LONG).show();
                return true;
            case  R.id.update:
                Toast.makeText(getApplicationContext(),"View All",Toast.LENGTH_LONG).show();
                return true;
            case  R.id.delete:
                Toast.makeText(getApplicationContext(),"View All",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
