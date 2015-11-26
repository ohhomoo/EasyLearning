package com.ezgenius.easylearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub);
    }   // onCreate

    public void clickListView(View view) {

        Intent objIntent = new Intent(HubActivity.this, VideoListView.class);
        startActivity(objIntent);

    }

    public void clickExercise(View view) {

    }

}   // Main Class
