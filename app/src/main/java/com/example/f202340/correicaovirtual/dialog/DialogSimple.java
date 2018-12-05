package com.example.f202340.correicaovirtual.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

import com.example.f202340.correicaovirtual.activity.CadastrarUsuario;
import com.example.f202340.correicaovirtual.activity.LoginActivity;

public class DialogSimple extends DialogFragment implements DialogInterface.OnClickListener {




    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity()).setTitle("Erro ao tentar logar")
                .setMessage("O login e senha não podem ser vazios, caso não tenha cadastro selecione o botão de cadastrar ")
                .create();
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
    }

}
