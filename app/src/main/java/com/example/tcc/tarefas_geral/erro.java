package com.example.tcc.tarefas_geral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tcc.R;
import com.example.tcc.app.menu_principal;
import com.example.tcc.tarefas_dificeis.tarefa_dificeis;

public class erro extends AppCompatActivity {

    Button bvoltar, brefaz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erro);

        brefaz = findViewById(R.id.btn_refazer);
        bvoltar = findViewById(R.id.btn_evoltar);


        brefaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(erro.this, tarefa_menu.class));
            }
        });


        bvoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(erro.this, menu_principal.class));
            }
        });


    }
}