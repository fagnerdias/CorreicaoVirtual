package com.example.f202340.correicaovirtual.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.f202340.correicaovirtual.R;

public class PlanejamentoInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planejamento_info);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
