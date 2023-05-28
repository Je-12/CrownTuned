package com.example.tcc.tarefas_faceis;

import static java.lang.Thread.sleep;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tcc.R;
import com.example.tcc.tarefas_geral.acerto;
import com.example.tcc.tarefas_geral.erro;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

import java.util.Timer;
import java.util.concurrent.Executor;

public class trf_facil_send_message_joao_pt2 extends AppCompatActivity {

    ImageView imgenvia;
    TextView txtenvia;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trf_facil_send_message_joao_pt2);

        imgenvia = findViewById(R.id.imgenviamsg);
        txtenvia = findViewById(R.id.txtmsgenviada);
        EditText etenvia = findViewById(R.id.ettxtmsg);

        imgenvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "oi joao bom dia";
                String digitado = etenvia.getText().toString();
                if(digitado.equals(msg)){
                    startActivity(new Intent(trf_facil_send_message_joao_pt2.this, trf_facil_send_message_joao_final.class));
                }else {
                    startActivity(new Intent(trf_facil_send_message_joao_pt2.this, erro.class));
                }

            }
        });
    }


}