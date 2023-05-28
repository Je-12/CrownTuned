package com.example.tcc.tarefas_dificeis;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tcc.R;
import com.example.tcc.tarefas_geral.tarefa_menu;

public class tarefa_dificeis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarefa_dificeis);

        Button btntarefa1 = findViewById(R.id.btn_adicionaContato);
        Button btntarefa2 = findViewById(R.id.btn_enviaAnexo);
        Button btntarefa3 = findViewById(R.id.btn_enviaAudio);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button btnavoltar = findViewById(R.id.btn_voltarTD);

        btntarefa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tarefa_dificeis.this, trf_dificil_add_contato_pt1.class));
            }
        });
        btntarefa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tarefa_dificeis.this, trf_dificil_anexo_pt1.class));
            }
        });
        btntarefa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tarefa_dificeis.this, trf_dificil_audio_pt1.class));
            }
        });
        btnavoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tarefa_dificeis.this, tarefa_menu.class));
            }
        });
    }
}