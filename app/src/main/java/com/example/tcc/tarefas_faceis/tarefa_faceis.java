package com.example.tcc.tarefas_faceis;
import com.example.tcc.R;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tcc.tarefas_geral.tarefa_menu;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tarefa_faceis extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarefa_faceis);

        Button btntarefa1 = findViewById(R.id.btn_identificaW);
        Button btntarefa2 = findViewById(R.id.btn_mandarMsg);
        Button btntarefa3 = findViewById(R.id.btn_enviarFoto);
        Button btnavoltar = findViewById(R.id.btn_voltarTF);

        btntarefa1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tarefa_faceis.this, trf_facil_ident_whats.class));
            }
        });
        btntarefa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tarefa_faceis.this, trf_facil_send_message_pt1.class));
            }
        });
        btntarefa3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tarefa_faceis.this, trf_facil_send_photo_pt1.class));
            }
        });
        btnavoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(tarefa_faceis.this, tarefa_menu.class));
            }
        });
    }
}