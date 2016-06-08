package vp.androidallinoneexample.androidversionpicasocardview;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import vp.androidallinoneexample.R;
import vp.androidallinoneexample.cardview.RecyclerViewBaseAdapter;

/**
 * Created by Vyas on 6/8/2016.
 */
public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<AndroidVersion> androidVersionsList;
    private Context context;

    public DataAdapter(ArrayList<AndroidVersion> androidVersionsList, Context context) {
        this.androidVersionsList = androidVersionsList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.android_version_demo_base,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv_android.setText(androidVersionsList.get(position).getAndroid_version_name());
        Picasso.with(context).load(androidVersionsList.get(position).getAndroid_image_url()).resize(120,60).into(holder.img_android);
    }

    @Override
    public int getItemCount() {
        return androidVersionsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv_android;
        ImageView img_android;
        public ViewHolder(View itemView) {
            super(itemView);
            tv_android=(TextView)itemView.findViewById(R.id.tv_android);
            img_android=(ImageView)itemView.findViewById(R.id.img_android);
        }
    }
}
