package com.example.tcc.app;
import com.example.tcc.R;
import com.example.tcc.tarefas_dificeis.trf_dificil_add_contato_final;
import com.example.tcc.tarefas_geral.acerto;
import com.example.tcc.tarefas_geral.tarefa_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class guia extends AppCompatActivity {
    Button iniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia);

        iniciar = findViewById(R.id.btn_iniciarjornada);

        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(guia.this, tarefa_menu.class));
            }
        });
    }
}