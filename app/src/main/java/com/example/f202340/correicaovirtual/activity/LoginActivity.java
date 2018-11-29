package com.example.f202340.correicaovirtual.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.f202340.correicaovirtual.R;

public class LoginActivity extends AppCompatActivity {

    private EditText edtLogin;
    private EditText edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtLogin = findViewById(R.id.edtLogin);
        edtSenha = findViewById(R.id.edtSenha);
    }

    public void logar(View view){
        /*
        Fazer a verificação de usuário
         */

        String login = edtLogin.getText().toString();
        String senha = edtSenha.getText().toString();

        Intent dashboardintent =  new Intent(this, MainActivity.class);
        startActivity(dashboardintent);
    }
}
