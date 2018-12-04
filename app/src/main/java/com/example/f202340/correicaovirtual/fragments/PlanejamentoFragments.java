package com.example.f202340.correicaovirtual.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.f202340.correicaovirtual.R;
import com.example.f202340.correicaovirtual.model.ItemDashboard;
import com.example.f202340.correicaovirtual.model.Planejamento;

public class PlanejamentoFragments extends ListFragment {
    private ArrayAdapter<Planejamento> adapter;
    private PlanejamentoFragments.OnItemClick listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (!(context instanceof PlanejamentoFragments.OnItemClick)){
            throw new RuntimeException("O contexto deve ser OnItemClick");
        }
        this.listener = (OnItemClick) context;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1);

        String[] qnts = getActivity().getResources().getStringArray(R.array.itensDashboard_qnt);
        String[] descricoes = getActivity().getResources().getStringArray(R.array.itensDashboard_descricao);

        for (int i = 0; i < descricoes.length; i++){
            Planejamento planejamento = new Planejamento(descricoes[i], descricoes[i]);
            adapter.add(planejamento);
        }

        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Planejamento item = adapter.getItem(position);
        if(listener != null){
            listener.onClick(item);
        }
    }

    public interface OnItemClick{
        void onClick(Planejamento planejamento);
    }
}
