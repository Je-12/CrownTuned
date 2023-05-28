package com.example.tcc.tarefas_faceis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.tcc.R;

public class trf_facil_send_photo_pt1 extends AppCompatActivity {
    ImageView imgcamera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trf_facil_send_photo_pt1);

        imgcamera = findViewById(R.id.imgcameraphoto);

        imgcamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(trf_facil_send_photo_pt1.this, trf_facil_send_photo_pt2.class));
            }
        });
    }
}