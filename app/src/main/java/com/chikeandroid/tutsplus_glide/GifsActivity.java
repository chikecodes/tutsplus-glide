package com.chikeandroid.tutsplus_glide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Chike on 2/12/2017.
 */

public class GifsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gifs);

        ImageView gifImageView = (ImageView) findViewById(R.id.iv_gif);

        Glide.with(this)
                .load("http://i.imgur.com/Vth6CBz.gif")
                .asBitmap()
                .placeholder(R.drawable.ic_cloud_off_red)
                .error(R.drawable.ic_cloud_off_red)
                .into(gifImageView);
    }

}
