package com.example.f202340.correicaovirtual.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.f202340.correicaovirtual.R;
import com.example.f202340.correicaovirtual.fragments.OficioFragments;
import com.example.f202340.correicaovirtual.model.Oficio;
import com.example.f202340.correicaovirtual.others.Menu;

public class OficioActivity extends AppCompatActivity implements OficioFragments.OnItemClick, PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oficio);
    }


    public void showPopup(View view){
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.actions);
        popupMenu.show();
    }


    @Override
    public void onClick(Oficio item) {
        /*
        Click no item dentro do fragment list
         */
        Toast.makeText(getApplicationContext(), "Teste", Toast.LENGTH_LONG).show();
    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {
        Menu menu = new Menu(item);
        return menu.popupManu(this);
    }
}
