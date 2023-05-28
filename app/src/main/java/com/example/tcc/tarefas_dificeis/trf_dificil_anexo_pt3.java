package com.example.tcc.tarefas_dificeis;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.tcc.R;

public class trf_dificil_anexo_pt3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trf_dificil_anexo_pt3);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView txtdesc = findViewById(R.id.txtdescLUZ);

        txtdesc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(trf_dificil_anexo_pt3.this, trf_dificil_anexo_pt4.class));
            }
        });
    }
}