package com.mezonworks.camera2;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        onClick();
    }

    public void onClick(View v) {
        Intent myIntent = new Intent();
        myIntent.setAction(Intent.ACTION_VIEW);
        myIntent.setData(MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivity(myIntent);
    }
}
