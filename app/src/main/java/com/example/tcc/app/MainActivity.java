package com.example.tcc.app;
import com.example.tcc.R;
import com.example.tcc.acesso.activity_sign_up;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button biniciar, bcadastrar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_splash);

        bcadastrar = findViewById(R.id.btn_cadastrar);
        biniciar = findViewById(R.id.btn_iniciar);

        //Acessa cadastrar
        bcadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activity_sign_up.class));
            }
        });

        //Acessa menu-principal
        biniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, menu_principal.class));
            }
        });


    }

}