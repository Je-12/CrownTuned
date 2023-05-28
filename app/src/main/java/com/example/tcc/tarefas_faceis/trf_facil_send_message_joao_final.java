package com.example.tcc.tarefas_faceis;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;

import com.example.tcc.R;
import com.example.tcc.tarefas_geral.acerto;

public class trf_facil_send_message_joao_final extends AppCompatActivity {

    Button btnfinalizatarefa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trf_facil_send_message_joao_final);

        btnfinalizatarefa = findViewById(R.id.btnfinaliza);

        btnfinalizatarefa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(trf_facil_send_message_joao_final.this, acerto.class));
            }
        });
    }
}