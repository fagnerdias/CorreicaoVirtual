package com.example.f202340.correicaovirtual.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.f202340.correicaovirtual.R;
import com.example.f202340.correicaovirtual.fragments.ItensDashboardFragments;
import com.example.f202340.correicaovirtual.model.ItemDashboard;

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
        Toast.makeText(getApplicationContext(), "Teste", Toast.LENGTH_LONG).show();
    }

    public void openPlanejamento(View view){
        Intent intent =  new Intent(this, PlanejamentoActivity.class);
        startActivity(intent);
    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_dashboard:
                Toast.makeText(this, "TESTE", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_execucao:
                Toast.makeText(this, "TESTE", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_oficio:
                Toast.makeText(this, "TESTE", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_planejamento:
                Intent intent =  new Intent(this, PlanejamentoActivity.class);
                startActivity(intent);
                return true;
            default:
                return false;
        }

    }
}
