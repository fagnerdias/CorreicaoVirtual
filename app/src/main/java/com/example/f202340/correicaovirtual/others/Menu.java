package com.example.f202340.correicaovirtual.others;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.f202340.correicaovirtual.R;
import com.example.f202340.correicaovirtual.activity.ExecucaoActivity;
import com.example.f202340.correicaovirtual.activity.MainActivity;
import com.example.f202340.correicaovirtual.activity.OficioActivity;
import com.example.f202340.correicaovirtual.activity.PlanejamentoActivity;


public class Menu {

    MenuItem item;

    public Menu(MenuItem item) {
        this.item = item;
    }

    public boolean popupManu(Context context){
        switch (item.getItemId()) {
            case R.id.menu_dashboard:
                Intent dashboardintent =  new Intent(context, MainActivity.class);
                context.startActivity(dashboardintent);
                return true;
            case R.id.menu_execucao:
                Intent execucaoIntent =  new Intent(context, ExecucaoActivity.class);
                context.startActivity(execucaoIntent);
                return true;
            case R.id.menu_oficio:
                Intent oficioIntent =  new Intent(context, OficioActivity.class);
                context.startActivity(oficioIntent);
                return true;
            case R.id.menu_planejamento:
                Intent intent =  new Intent(context, PlanejamentoActivity.class);
                context.startActivity(intent);
                return true;
            default:
                return false;
        }

    }
}
