package vp.androidallinoneexample.cardview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import vp.androidallinoneexample.R;

/**
 * Created by Vyas on 6/5/2016.
 */
public class CardViewActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_home);
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        Students studentsA= new Students("amitabh","23","male");
        Students studentsB= new Students("aishwarya","24","female");
        Students studentsC= new Students("sharukh","19","male");
        Students studentsD= new Students("Rekha","20","female");
        Students studentsE= new Students("Rakhi","21","female");

        List<Students> list = new ArrayList<>();
        list.add(studentsA);
        list.add(studentsB);
        list.add(studentsC);
        list.add(studentsD);
        list.add(studentsE);

        RecyclerViewBaseAdapter baseAdapter = new RecyclerViewBaseAdapter(list);
        recyclerView.setAdapter(baseAdapter);
    }
}
