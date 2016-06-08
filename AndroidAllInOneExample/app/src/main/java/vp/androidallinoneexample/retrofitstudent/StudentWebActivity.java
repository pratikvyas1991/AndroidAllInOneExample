package vp.androidallinoneexample.retrofitstudent;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;
import vp.androidallinoneexample.R;
import vp.androidallinoneexample.retrofitstudent.model.Books;
import vp.androidallinoneexample.retrofitstudent.model.Student;
import vp.androidallinoneexample.retrofitstudent.model.StudentList;
import vp.androidallinoneexample.retrofitstudent.model.StudentServiceInterface;

/**
 * Created by Vyas on 6/8/2016.
 */
public class StudentWebActivity extends Activity {
    TextView mCityName,mCityPopulation;
    StudentList mStudentList;
    Books books;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.retrofit_geoname);
        mCityName=(TextView)findViewById(R.id.city_name_value);
        mCityPopulation=(TextView)findViewById(R.id.population_value);
        getStudentList("java");
        Toast.makeText(getApplicationContext(),"started !!",Toast.LENGTH_LONG).show();
    }

    public  void getStudentList(String name){
        StudentServiceInterface serviceInterface =  StudentServiceClass.siteConnection();
        Call<Books> call = serviceInterface.getNames(name);
        call.enqueue(new Callback<Books>() {
            @Override
            public void onResponse(Response<Books> response, Retrofit retrofit) {
                if(response.isSuccess()){
                    books = response.body();
                    displayStudents(books);
                }
            }

            @Override
            public void onFailure(Throwable t) {
                Log.d("Error",t.getMessage());
            }
        });
    }

    public void displayStudents(Books studentList){
        Log.d("Output","###################");
        Log.d("Data : ",String.valueOf(studentList.getData()));
        Log.d("Status message: ",studentList.getStatusMessage());
        Log.d(" status ",String.valueOf(studentList.getStatus()));
    }
}
