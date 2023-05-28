package com.example.tcc.app;
import com.example.tcc.R;
import com.example.tcc.acesso.activity_sign_up;
import com.example.tcc.tarefas_geral.tarefa_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu_principal extends AppCompatActivity {

    Button btn_t, btn_c, btn_g, btn_s, bsair;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);


        btn_t = findViewById(R.id.btn_tarefa);
        btn_c = findViewById(R.id.btn_cursos);
        btn_g = findViewById(R.id.btn_guia);
        btn_s = findViewById(R.id.btn_sugestao);
        bsair = findViewById(R.id.btn_logout);

        //Acessa menu-tarefas
        btn_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu_principal.this, tarefa_menu.class));
            }
        });

        //Acessa cursos-menu
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu_principal.this, cursos.class));
            }
        });

        //Acessa guia
        btn_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu_principal.this, guia.class));
            }
        });
        //acessa a sugestao
        btn_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu_principal.this, contact_form.class));
            }
        });
        //acessa menu-splash
        bsair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(menu_principal.this, MainActivity.class));
            }
        });
    }
}