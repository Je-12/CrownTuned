package com.example.tcc.app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.tcc.R;
import com.example.tcc.acesso.LoginActivity;
import com.example.tcc.acesso.activity_sign_up;
import com.example.tcc.tarefas_geral.tarefa_menu;

public class cursos extends AppCompatActivity {
    ImageView cursow;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);

       cursow  = findViewById(R.id.img_whats);

        cursow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(cursos.this, tarefa_menu.class));
            }
        });
    }
}