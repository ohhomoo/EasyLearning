package com.ezgenius.easylearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class VideoListView extends AppCompatActivity {

    //Explicit
    private ListView videoListView;
    private int[] pathVideoInts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_list_view);

        //Bind Widget
        videoListView = (ListView) findViewById(R.id.listView);

        //Create ListView
        createListView();

    }   // onCreate

    private void createListView() {

        ManageTABLE objManageTABLE = new ManageTABLE(this);

        //Array of Title
        String[] titleStrings = objManageTABLE.readAllAata(1);

        //Array Icon
        String[] iconStrings = objManageTABLE.readAllAata(3);
        int[] iconInts = new int[iconStrings.length];
        int[] imageInts = new int[iconStrings.length];
        pathVideoInts = new int[iconStrings.length];

        for (int i = 0; i < iconStrings.length; i++) {

            iconInts[i] = Integer.parseInt(iconStrings[i]);

            switch (iconInts[i]) {
                case 1:
                    imageInts[i] = R.drawable.food1;
                    pathVideoInts[i] = R.raw.video1;
                    break;
                case 2:
                    imageInts[i] = R.drawable.food2;
                    pathVideoInts[i] = R.raw.video2;

                    break;
                case 3:
                    imageInts[i] = R.drawable.food3;
                    pathVideoInts[i] = R.raw.video1;

                    break;
                case 4:
                    imageInts[i] = R.drawable.food4;
                    pathVideoInts[i] = R.raw.video1;

                    break;
                case 5:
                    imageInts[i] = R.drawable.food5;
                    pathVideoInts[i] = R.raw.video1;

                    break;
                case 6:
                    imageInts[i] = R.drawable.food6;
                    pathVideoInts[i] = R.raw.video1;

                    break;
                case 7:
                    imageInts[i] = R.drawable.food7;
                    pathVideoInts[i] = R.raw.video1;

                    break;
                case 8:
                    imageInts[i] = R.drawable.food8;
                    pathVideoInts[i] = R.raw.video1;

                    break;
                case 9:
                    imageInts[i] = R.drawable.food9;
                    pathVideoInts[i] = R.raw.video1;

                    break;
                case 10:
                    imageInts[i] = R.drawable.food10;
                    pathVideoInts[i] = R.raw.video1;

                    break;
                default:
                    imageInts[i] = R.drawable.food1;
                    break;



            }   //switch

        }   //for

        myAdapter objMyAdapter = new myAdapter(VideoListView.this, imageInts, titleStrings);
        videoListView.setAdapter(objMyAdapter);

        videoListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                Intent objIntent = new Intent(VideoListView.this, VideoViewActivity.class);
                objIntent.putExtra("Video", pathVideoInts[i]);
                startActivity(objIntent);

            }   // event
        });

    }   //createListView

}   //Main Class
