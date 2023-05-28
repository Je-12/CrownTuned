package com.example.tcc.tarefas_dificeis;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.tcc.R;
import com.example.tcc.tarefas_geral.erro;

public class trf_dificil_add_contato_pt3 extends AppCompatActivity {
    EditText nome, sobrenome;
    Button salvar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trf_dificil_add_contato_pt3);

        nome =findViewById(R.id.edittextnomeadd);
        sobrenome = findViewById(R.id.edittextsobrenomeadd);
        salvar = findViewById(R.id.btn_salvacontato);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nnome = nome.getText().toString();
                String ssobrenome = sobrenome.getText().toString();
                String nn = "Joao";
                String sn = "Silva";
                if(nnome.equals(nn) && ssobrenome.equals(sn)){
                    startActivity(new Intent(trf_dificil_add_contato_pt3.this, trf_dificil_add_contato_final.class));
                }else{
                    startActivity(new Intent(trf_dificil_add_contato_pt3.this, erro.class));
                }

            }
        });




    }
}