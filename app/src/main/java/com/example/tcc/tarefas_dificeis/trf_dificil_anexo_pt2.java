package com.example.tcc.tarefas_dificeis;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.tcc.R;

public class trf_dificil_anexo_pt2 extends AppCompatActivity {
    LinearLayout anexo;
    ImageView clip, doc, docfundo;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trf_dificil_anexo_pt2);

        anexo = findViewById(R.id.LL_anexo);
        clip = findViewById(R.id.imganexo);
        doc = findViewById(R.id.imgarquivo);
        docfundo = findViewById(R.id.imgcdoc);

        clip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                anexo.setVisibility(View.VISIBLE);
            }
        });

        doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(trf_dificil_anexo_pt2.this, trf_dificil_anexo_pt3.class));
            }
        });
        docfundo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(trf_dificil_anexo_pt2.this, trf_dificil_anexo_pt3.class));
            }
        });
    }
}