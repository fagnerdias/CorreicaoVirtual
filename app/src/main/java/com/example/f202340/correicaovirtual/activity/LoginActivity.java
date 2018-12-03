package com.example.f202340.correicaovirtual.activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.f202340.correicaovirtual.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import java.io.IOException;

public class LoginActivity extends AppCompatActivity {

    private EditText edtLogin;
    private EditText edtSenha;

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtLogin = findViewById(R.id.edtLogin);
        edtSenha = findViewById(R.id.edtSenha);

        auth = FirebaseAuth.getInstance();
    }

    public void logar(View view) {
        Log.i("MyApp", "logar: ENTRA");
        String login = edtLogin.getText().toString().trim();
        String senha = edtSenha.getText().toString();
        Log.i("MyApp", "logar: ENTRA222222");

        auth.signInWithEmailAndPassword(login, senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {

            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                Log.i("MyApp", "logar: ENTRA");
                if (task.isSuccessful()) {
                    Log.i("MyApp", "logar: ENTRA");
                    Toast.makeText(LoginActivity.this, "Login realizado com sucesso", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    finish();
                } else {
                    Log.i("MyApp", "logar: ENTRA - else");
                    Toast.makeText(LoginActivity.this, "Error ao tentar logar", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    public void cadastrar(View view) {
        startActivity(new Intent(LoginActivity.this, CadastrarUsuario.class));
    }
}
