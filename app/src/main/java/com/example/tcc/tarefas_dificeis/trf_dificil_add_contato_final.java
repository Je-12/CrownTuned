package com.example.tcc.tarefas_dificeis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tcc.R;
import com.example.tcc.tarefas_faceis.trf_facil_send_message_joao_final;
import com.example.tcc.tarefas_geral.acerto;

public class trf_dificil_add_contato_final extends AppCompatActivity {
    Button btnfinalizatarefa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trf_dificil_add_contato_final);

        btnfinalizatarefa = findViewById(R.id.btnfinaliza);

        btnfinalizatarefa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(trf_dificil_add_contato_final.this, acerto.class));
            }
        });



    }
}