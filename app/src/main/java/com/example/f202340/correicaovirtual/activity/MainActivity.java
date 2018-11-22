package com.example.f202340.correicaovirtual.activity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.f202340.correicaovirtual.R;
import com.example.f202340.correicaovirtual.fragments.ItensDashboardFragments;
import com.example.f202340.correicaovirtual.model.ItemDashboard;
import com.example.f202340.correicaovirtual.others.Menu;

public class MainActivity extends AppCompatActivity implements ItensDashboardFragments.OnItemClick, PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showPopup(View view){
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.actions);
        popupMenu.show();
    }


    @Override
    public void onClick(ItemDashboard item) {
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
