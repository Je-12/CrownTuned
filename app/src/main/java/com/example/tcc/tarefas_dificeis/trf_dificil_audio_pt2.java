package com.example.tcc.tarefas_dificeis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.tcc.R;
import com.example.tcc.tarefas_faceis.trf_facil_send_message_joao_final;
import com.example.tcc.tarefas_faceis.trf_facil_send_message_joao_pt2;
import com.example.tcc.tarefas_geral.erro;

public class trf_dificil_audio_pt2 extends AppCompatActivity {
    ImageView imgenvia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trf_dificil_audio_pt2);

        imgenvia = findViewById(R.id.imgenviamsg);

        imgenvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(trf_dificil_audio_pt2.this, trf_dificil_audio_final.class));
            }
        });

    }
}