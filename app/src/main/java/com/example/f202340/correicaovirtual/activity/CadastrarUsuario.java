package com.example.f202340.correicaovirtual.activity;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.f202340.correicaovirtual.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class CadastrarUsuario extends AppCompatActivity {

    private EditText edt_email_cadastro;
    private EditText edt_senha_cadastro;

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_usuario);

        edt_email_cadastro = findViewById(R.id.edt_email);
        edt_senha_cadastro = findViewById(R.id.edt_senha);

        auth = FirebaseAuth.getInstance();
    }

    public void cadastrarUsuario(View view) {

        String email = edt_email_cadastro.getText().toString().trim();
        String senha = edt_senha_cadastro.getText().toString();

        auth.createUserWithEmailAndPassword(email,senha).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(CadastrarUsuario.this, "Usuário cadastrado como sucesso", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(CadastrarUsuario.this, "Erro ao cadastrar usuário", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
