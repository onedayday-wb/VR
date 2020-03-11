package com.onedayday.vr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView iv_pic, iv_video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        iv_pic = findViewById(R.id.iv_pic);
        iv_video = findViewById(R.id.iv_video);
        iv_pic.setOnClickListener(this);
        iv_video.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_pic:
                Intent pic = new Intent(MainActivity.this, VRPicActivity.class);
                startActivity(pic);
                break;
            case R.id.iv_video:
                Intent video = new Intent(MainActivity.this, VRVideoActivity.class);
                startActivity(video);
                break;
        }
    }
}
