package com.example.tcc.tarefas_faceis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.tcc.R;
import com.example.tcc.acesso.activity_sign_up;
import com.example.tcc.app.menu_principal;
import com.example.tcc.tarefas_geral.acerto;
import com.example.tcc.tarefas_geral.erro;

public class trf_facil_ident_whats extends AppCompatActivity {

    ImageView bwhats, bface, bsnap, bgoogle, btwitter, byoutube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trf_facil_ident_whats);


        bwhats = findViewById(R.id.imgv_whatsapp);
        bface = findViewById(R.id.imgv_facebook);
        bsnap = findViewById(R.id.imgv_snapchat);
        bgoogle = findViewById(R.id.imgv_google);
        btwitter = findViewById(R.id.imgv_twitter);
        byoutube = findViewById(R.id.imgv_youtube);

        //acerto
        bwhats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(trf_facil_ident_whats.this, acerto.class));
            }
        });

        //erro
        bface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(trf_facil_ident_whats.this, erro.class));
            }
        });

        //erro
        bsnap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(trf_facil_ident_whats.this, erro.class));
            }
        });

        //erro
        bgoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(trf_facil_ident_whats.this, erro.class));
            }
        });

        //erro
        btwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(trf_facil_ident_whats.this, erro.class));
            }
        });

        //erro
        byoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(trf_facil_ident_whats.this, erro.class));
            }
        });

    }
}