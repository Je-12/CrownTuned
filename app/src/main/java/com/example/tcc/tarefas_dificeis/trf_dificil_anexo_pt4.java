package com.example.tcc.tarefas_dificeis;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.tcc.R;
import com.example.tcc.tarefas_faceis.trf_facil_send_photo_final;
import com.example.tcc.tarefas_faceis.trf_facil_send_photo_pt3;

public class trf_dificil_anexo_pt4 extends AppCompatActivity {
    ImageView imgenvia;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trf_dificil_anexo_pt4);

        imgenvia = findViewById(R.id.imgenviaphoto);


        imgenvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(trf_dificil_anexo_pt4.this, trf_dificil_anexo_final.class));
            }
        });
    }
}