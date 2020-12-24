package com.example.opencv_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CategoryActivity extends AppCompatActivity {

    Button gallery, camera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        gallery = findViewById(R.id.category_gallery);
        camera = findViewById(R.id.category_camera);

        Button.OnClickListener btnOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.category_gallery:
                        Intent intent = new Intent(CategoryActivity.this, GalleryActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.category_camera:
                        Intent intent2 = new Intent(CategoryActivity.this, CameraActivity.class);
                        startActivity(intent2);
                        break;
                }
            }
        };

        gallery.setOnClickListener(btnOnClickListener);
        camera.setOnClickListener(btnOnClickListener);
    }
}