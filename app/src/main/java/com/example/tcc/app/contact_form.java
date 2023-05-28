package com.example.tcc.app;



import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tcc.R;
import com.example.tcc.acesso.HelperClass;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.hbb20.CountryCodePicker;

public class contact_form  extends AppCompatActivity {
    EditText nome, eemail, ssugestao;
    Button enviar, enviarw;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_form);

        nome = (EditText) findViewById(R.id.editTextnome);
        eemail = (EditText) findViewById(R.id.editTextemail);
        ssugestao = (EditText) findViewById(R.id.editTextsugestao);
        enviar = findViewById(R.id.buttonSendcontact);
        enviarw= findViewById(R.id.btn_whatsapp);


        enviar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nome.getText().toString();
                String email = eemail.getText().toString();
                String sugestao = ssugestao.getText().toString();

                if (name.isEmpty()){
                    nome.setError("Preencha o nome");
                    return;
                }
                if (email.isEmpty()){
                    eemail.setError("Preencha o e-mail");
                    return;
                }
                if (sugestao.isEmpty()){
                    ssugestao.setError("Escreva sua sugestão");
                    return;
                }else{
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference reference = database.getReference("sugestao");

                    HelperClass helperClass = new HelperClass(name, email, sugestao);
                    reference.child(name).setValue(helperClass);

                    Toast.makeText(contact_form.this, "Sugestão enviada com sucesso", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(contact_form.this, menu_principal.class);
                    startActivity(intent);
                }
            }
        });

        enviarw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //String contact = "961741685"; // use country code with your phone number913399832
                String url = "https://api.whatsapp.com/send?phone=961741685";
                try {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                } finally {

                }
            }
        });

    }

}


