package com.guaman.pmat_programador_1.viewsuper;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class show_video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_video);
        VideoView simpleview = (VideoView) findViewById(R.id.videoView);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(simpleview);

        Uri uri = Uri.parse("http://192.168.1.243/mapbox/video1.mp4");

        simpleview.setMediaController(mediaController);
        simpleview.setVideoURI(uri);
        simpleview.requestFocus();
        simpleview.start();

    }

}
