package vp.androidallinoneexample.cardview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import vp.androidallinoneexample.R;

/**
 * Created by Vyas on 6/5/2016.
 */
public class RecyclerViewBaseAdapter extends RecyclerView.Adapter<RecyclerViewBaseAdapter.ViewHolder> {
    List<Students> studentsList;

    public RecyclerViewBaseAdapter(List<Students> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_base,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.mTitle.setText(studentsList.get(position).getStudentName());
        holder.mTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Name: "+studentsList.get(position).getStudentName()+" ,  " +
                        "Age: "+studentsList.get(position).getStudentAge(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        CardView mCardView;
        TextView mTitle;
        public ViewHolder(View itemView) {
            super(itemView);
            mCardView=(CardView)itemView.findViewById(R.id.card_view);
            mTitle=(TextView)itemView.findViewById(R.id.card_view_title);
        }
    }
}
