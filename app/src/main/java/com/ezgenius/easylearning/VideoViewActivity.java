package com.ezgenius.easylearning;

import android.media.MediaPlayer;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoViewActivity extends AppCompatActivity {

    //Explicit
    private VideoView myVideoView;
    private int positionAnInt;
    private String pathVideoString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        //Bind Widget
        myVideoView = (VideoView) findViewById(R.id.videoView);

        //Find Path Video
        findPathVideo();

        //Create Video View
        createVideoView();

    }   // onCreate

    private void createVideoView() {

        Uri objUri = Uri.parse(pathVideoString);
        myVideoView.setVideoURI(objUri);
        myVideoView.requestFocus();

        //For Controller
        MediaController objMediaController = new MediaController(this);
        objMediaController.setAnchorView(myVideoView);
        myVideoView.setMediaController(objMediaController);

        myVideoView.start();

    }

    private void findPathVideo() {

        positionAnInt = getIntent().getIntExtra("Video", 1);
        switch (positionAnInt) {
            case 1:
                pathVideoString = "android.resource://com.ezgenius.easylearning/" + R.raw.video1;
                break;
            case 2:
                pathVideoString = "android.resource://com.ezgenius.easylearning/" + R.raw.video2;
                break;
            case 3:
                pathVideoString = "android.resource://com.ezgenius.easylearning/" + R.raw.video1;
                break;
            case 4:
                pathVideoString = "android.resource://com.ezgenius.easylearning/" + R.raw.video1;
                break;
            case 5:
                pathVideoString = "android.resource://com.ezgenius.easylearning/" + R.raw.video1;
                break;
            case 6:
                pathVideoString = "android.resource://com.ezgenius.easylearning/" + R.raw.video1;
                break;
            case 7:
                pathVideoString = "android.resource://com.ezgenius.easylearning/" + R.raw.video1;
                break;
            case 8:
                pathVideoString = "android.resource://com.ezgenius.easylearning/" + R.raw.video1;
                break;
            case 9:
                pathVideoString = "android.resource://com.ezgenius.easylearning/" + R.raw.video1;
                break;
            case 10:
                pathVideoString = "android.resource://com.ezgenius.easylearning/" + R.raw.video1;
                break;
            default:
                pathVideoString = "android.resource://com.ezgenius.easylearning/" + R.raw.video1;
                break;
        }   //switch


    }   //findPathVideo
}   // Main Class
