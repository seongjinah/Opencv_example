package com.example.opencv_example;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.opencv.android.CameraBridgeViewBase;

import java.util.List;

import static android.Manifest.permission.CAMERA;

public class CameraActivity extends AppCompatActivity {

    Button camera_gray, camera_edge, camera_picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        camera_picture = findViewById(R.id.camera_picture);
        camera_gray = findViewById(R.id.camera_gray);
        camera_edge = findViewById(R.id.camera_edge);

        Button.OnClickListener btnOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.camera_picture:
                        Intent intent = new Intent(CameraActivity.this, CameraBasicActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.camera_gray:
                        Intent intent2 = new Intent(CameraActivity.this, CameraToGrayActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.camera_edge:
                        Intent intent3 = new Intent(CameraActivity.this, CameraToEdgeActivity.class);
                        startActivity(intent3);
                        break;
                }
            }
        };

        camera_picture.setOnClickListener(btnOnClickListener);
        camera_gray.setOnClickListener(btnOnClickListener);
        camera_edge.setOnClickListener(btnOnClickListener);
    }
}