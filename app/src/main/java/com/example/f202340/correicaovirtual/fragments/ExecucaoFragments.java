package com.example.f202340.correicaovirtual.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.f202340.correicaovirtual.R;
import com.example.f202340.correicaovirtual.model.Execucao;

public class ExecucaoFragments extends ListFragment {
    private ArrayAdapter<Execucao> adapter;
    private OnItemClick listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (!(context instanceof  OnItemClick)){
            throw new RuntimeException("O contexto deve ser OnItemClick");
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1);
        String[] data = getActivity().getResources().getStringArray(R.array.itensDashboard_descricao);

        for (int i =0; i < data.length; i++){
            Execucao exe = new Execucao(data[i]);
            adapter.add(exe);
        }

        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Execucao item = adapter.getItem(position);
        if(listener != null){
            listener.onClick(item);
        }
    }

    public interface OnItemClick{
        void onClick(Execucao exe);
    }
}
