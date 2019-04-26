package com.example.tests4;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.GridView;

import java.util.ArrayList;

public class ToViewImages extends AppCompatActivity {
    ArrayList<Uri> array;

    public ToViewImages(ArrayList<Uri> array) {
        this.array = array;
    }
    public ToViewImages()
    {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_view_images);
        GridView gridView=(GridView) findViewById(R.id.gridView);
        GridAdapter adapter=new GridAdapter(array,this);
        gridView.setAdapter(adapter);



    }
}
