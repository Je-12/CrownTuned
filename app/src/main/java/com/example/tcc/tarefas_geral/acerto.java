package com.example.tcc.tarefas_geral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tcc.R;
import com.example.tcc.app.menu_principal;

public class acerto extends AppCompatActivity {
    Button baproxima, bavoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerto);

        baproxima = findViewById(R.id.btn_proxima_tarefa);
        bavoltar = findViewById(R.id.btn_avoltar);


        baproxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(acerto.this, tarefa_menu.class));
            }
        });


        bavoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(acerto.this, menu_principal.class));
            }
        });

    }
}