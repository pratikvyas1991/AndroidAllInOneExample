package vp.androidallinoneexample.baseadapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import vp.androidallinoneexample.R;

/**
 * Created by Vyas on 6/4/2016.
 * We will user simple student example to explain the example
 * This activity explains simple screen where we have used the base adapter and we populate it in this screens .
 * Components Used: Activiy,Model(Student MOdel in this case ),BaseAdapter ,ListView,TextViews
 */
public class StudentActivity extends Activity{
    // Declaring Listview for 
    ListView mStudentListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_home);
    }
}
