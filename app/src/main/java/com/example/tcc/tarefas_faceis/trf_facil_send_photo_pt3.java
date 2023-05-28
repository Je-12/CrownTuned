package com.example.tcc.tarefas_faceis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.tcc.R;

public class trf_facil_send_photo_pt3 extends AppCompatActivity {

    ImageView imgenvia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trf_facil_send_photo_pt3);

        imgenvia = findViewById(R.id.imgenviaphoto);


        imgenvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(trf_facil_send_photo_pt3.this, trf_facil_send_photo_final.class));
            }
        });
    }
}