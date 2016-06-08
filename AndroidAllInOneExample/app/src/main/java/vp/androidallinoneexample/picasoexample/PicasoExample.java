package vp.androidallinoneexample.picasoexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import vp.androidallinoneexample.R;

/**
 * Created by Vyas on 6/8/2016.
 */
public class PicasoExample extends Activity {
    ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picaso_layout);
        mImageView=(ImageView)findViewById(R.id.picaso_image_view);
        Picasso.with(this)
                .load("https://cms-assets.tutsplus.com/uploads/users/21/posts/19431/featured_image/CodeFeature.jpg")
                .resize(200,200)
                .placeholder(R.drawable.card_view_background1)
                .error(R.drawable.home_giraffe_icon)
                .into(mImageView);
    }
}
