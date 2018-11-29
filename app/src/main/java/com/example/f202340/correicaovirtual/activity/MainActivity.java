package com.example.f202340.correicaovirtual.activity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
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

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.i("MyApp", "onCreate dashboard Activity ");

    }

    public void showPopup(View view){
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.actions);
        popupMenu.show();
    }





    @Override
    public boolean onMenuItemClick(MenuItem item) {
        Menu menu = new Menu(item);
        return menu.popupManu(this);
    }

    @Override
    public void onClick(ItemDashboard item) {
        Log.i("MyApp", "OnListItemClick: dashboard Activity ");
    }
}
