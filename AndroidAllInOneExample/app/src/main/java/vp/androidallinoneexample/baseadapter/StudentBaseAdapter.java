package vp.androidallinoneexample.baseadapter;
import vp.androidallinoneexample.R;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;
import vp.androidallinoneexample.baseadapter.StudentModel;

/**
 * Created by Vyas on 6/4/2016.
 * This is the Custome adapter or the base adapter.
 */
public class StudentBaseAdapter extends BaseAdapter {
    Context context;
    List<StudentModel> studentList;
    LayoutInflater layoutInflater; // Layout inflater is used to inflate(Increase) new child


    public StudentBaseAdapter(Context context, List<StudentModel> studentList) {
        //Constructor will accept context and list of type StudentModel
        this.context = context;
        this.studentList = studentList;
        layoutInflater=LayoutInflater.from(this.context);
    }

    @Override
    public int getCount() {
        // this will return the number of the element in the adapter
        return studentList.size();
    }


    @Override
    public Object getItem(int position) {
        // this will return child for particular position
        return studentList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        layoutInflater=(LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        // below checking is because if the adapter is null then what  ?
        if(convertView==null){
            convertView=layoutInflater.inflate(R.layout.student_base,parent,false);
            holder=new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder=(ViewHolder)convertView.getTag();
        }
        //creating the model class obbject and assigning the value of getItem in it
        StudentModel model=(StudentModel)getItem(position);
        holder.mStudentName.setText(model.getStudentName());
        holder.mStudentAge.setText(model.getStudentAge());
        return convertView;
    }

    private class ViewHolder{
        //This is the custom class which is used to hold the object so that is do not have to create child view every time
        TextView mStudentName,mStudentAge;
        public ViewHolder(View item){
            mStudentName=(TextView)item.findViewById(R.id.student_name);
            mStudentAge=(TextView)item.findViewById(R.id.student_age);
        }
    }
}
