package com.example.f202340.correicaovirtual.activity;


import android.content.Intent;
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
import com.example.f202340.correicaovirtual.others.AuthClass;
import com.example.f202340.correicaovirtual.others.Menu;

public class MainActivity extends AppCompatActivity implements ItensDashboardFragments.OnItemClick, PopupMenu.OnMenuItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void showPopup(View view){
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.actions);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        AuthClass auth = AuthClass.getInstance();
        switch (item.getItemId()){
            case R.id.menu_sair:
                auth.getAuth().signOut();
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                finish();
        }
        Menu menu = new Menu(item);
        return menu.popupManu(this);
    }

    @Override
    public void onClick(ItemDashboard item) {
        Toast.makeText(this, "TESTE", Toast.LENGTH_SHORT).show();
    }
}
