package com.example.tcc.tarefas_dificeis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.tcc.R;

public class trf_dificil_add_contato_pt2 extends AppCompatActivity {
 TextView add, criar;
 LinearLayout ll_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trf_dificil_add_contato_pt2);

        ll_add = findViewById(R.id.ll_addcontato);
        add = findViewById(R.id.txtadicionar);
        criar = findViewById(R.id.txt_criacontato);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll_add.setVisibility(View.VISIBLE);
            }
        });
        criar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(trf_dificil_add_contato_pt2.this, trf_dificil_add_contato_pt3.class));
            }
        });


    }
}