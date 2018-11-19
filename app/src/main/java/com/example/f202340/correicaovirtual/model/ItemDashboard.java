package com.example.f202340.correicaovirtual.model;

public class ItemDashboard {

    private int qnt;
    private String descricao;

    public ItemDashboard(int qnt, String descricao){
        this.qnt = qnt;
        this.descricao = descricao;
    }


    @Override
    public String toString() {
        return descricao + String.valueOf(qnt);
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
