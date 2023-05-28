package com.example.tcc.tarefas_faceis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.tcc.R;



public class trf_facil_send_message_pt1 extends AppCompatActivity {

    LinearLayout llJ, llM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trf_facil_send_message_pt1);

        llJ = findViewById(R.id.joaoLL);
        llM = findViewById(R.id.mariaLL);

        llJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(trf_facil_send_message_pt1.this, trf_facil_send_message_joao_pt2.class));
            }

        });
        llM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(trf_facil_send_message_pt1.this, trf_facil_send_message_maria_pt2.class));
            }
        });
    }

}