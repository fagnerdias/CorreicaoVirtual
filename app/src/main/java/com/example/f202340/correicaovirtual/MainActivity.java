package com.example.f202340.correicaovirtual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ItensDashboardFragments.OnItemClick{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(ItemDashboard item) {
        Toast.makeText(getApplicationContext(), "Teste", Toast.LENGTH_LONG).show();
    }
}
