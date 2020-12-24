package com.example.opencv_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class GalleryActivity extends AppCompatActivity {

    Button choose, gray, pixel, edge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        choose = findViewById(R.id.gallery_choose_picture);
        gray = findViewById(R.id.gallery_gray);
        pixel = findViewById(R.id.gallery_pixel);
        edge = findViewById(R.id.gallery_edge);


    }
}