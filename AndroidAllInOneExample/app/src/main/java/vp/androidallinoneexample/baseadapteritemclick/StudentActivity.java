package vp.androidallinoneexample.baseadapteritemclick;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import vp.androidallinoneexample.R;

/**
 * Created by Vyas on 6/4/2016.
 * We will user simple student example to explain the example
 * This activity explains simple screen where we have used the base adapter and we populate it in this screens .
 * Components Used: Activiy,Model(Student MOdel in this case ),BaseAdapter ,ListView,TextViews
 */
public class StudentActivity extends Activity{
    // Declaring Listview which will contain the list of the data
    ListView mStudentListView;
    StudentModel mStudentModel1,mStudentModel2,mStudentModel3;
    List<StudentModel> mStudentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_home);

        //Initilization  : listview
        mStudentListView=(ListView)findViewById(R.id.student_list_view);

        //Creating object of Model and List
        mStudentModel1 = new StudentModel("Amitabh","75","music","amit123@gmail.com");
        mStudentModel2 = new StudentModel("Govinda","50","music","bas42@yahoo.com");
        mStudentModel3 = new StudentModel("dipika","29","music","rabvir143@gmail.com");
        mStudentList = new ArrayList<>();

        //adding the obbjects of the student model to the List
        mStudentList.add(mStudentModel1);
        mStudentList.add(mStudentModel2);
        mStudentList.add(mStudentModel3);

        //setting the adapter of the Listview
        mStudentListView.setAdapter(new StudentBaseAdapter(this,mStudentList));
        mStudentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Name : "+mStudentList.get(position).getStudentName(),Toast.LENGTH_LONG).show();
            }
        });

    }
}
