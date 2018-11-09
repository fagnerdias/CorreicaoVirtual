package com.example.f202340.correicaovirtual;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ItensDashboardFragments extends ListFragment {

    private ArrayAdapter<ItemDashboard> adapter;
    private OnItemClick listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (!(context instanceof OnItemClick)){
            throw new RuntimeException("O contexto deve ser OnItemClick");
        }

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1);

        String[] qnts = getActivity().getResources().getStringArray(R.array.itensDashboard_qnt);
        String[] descricoes = getActivity().getResources().getStringArray(R.array.itensDashboard_descricao);

        for (int i = 0; i < descricoes.length; i++){
            ItemDashboard item = new ItemDashboard(i, descricoes[i]);
            adapter.add(item);
        }

        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        ItemDashboard item = adapter.getItem(position);
        if(listener != null){
            listener.onClick(item);
        }
    }

    public interface OnItemClick{
        void onClick(ItemDashboard item);
    }
}
