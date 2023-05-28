package com.example.tcc.tarefas_dificeis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.tcc.R;
import com.example.tcc.tarefas_faceis.trf_facil_send_message_joao_pt2;
import com.example.tcc.tarefas_faceis.trf_facil_send_message_pt1;

public class trf_dificil_add_contato_pt1 extends AppCompatActivity {
    LinearLayout llJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trf_dificil_add_contato_pt1);

        llJ = findViewById(R.id.joaoLL);

        llJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(trf_dificil_add_contato_pt1.this, trf_dificil_add_contato_pt2.class));
            }
        });

    }
}