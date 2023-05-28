package com.example.tcc.tarefas_geral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tcc.R;
import com.example.tcc.acesso.activity_sign_up;
import com.example.tcc.app.menu_principal;
import com.example.tcc.tarefas_dificeis.tarefa_dificeis;
import com.example.tcc.tarefas_faceis.tarefa_faceis;

public class tarefa_menu extends AppCompatActivity {

    Button bfacil, bdificil, bvoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_tarefa);

        bfacil = findViewById(R.id.btn_tarefaFacil);
        bdificil = findViewById(R.id.btn_tarefaDificil);
        bvoltar = findViewById(R.id.btn_voltarMenutarefa);

        //acessa menu-tarefa-faceis
        bfacil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tarefa_menu.this, tarefa_faceis.class));
            }
        });

        //acessa menu-tarefa-dificeis
        bdificil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tarefa_menu.this, tarefa_dificeis.class));
            }
        });

        //acessa menu-principal
        bvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tarefa_menu.this, menu_principal.class));
            }
        });

    }
}