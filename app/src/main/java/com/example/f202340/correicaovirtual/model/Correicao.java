package com.example.f202340.correicaovirtual.model;

public class Correicao {
    String unidade;
    String comarca;
    String equipe;
    String juiz;
    String info;


    public Correicao(String unidade, String comarca, String equipe, String juiz, String info){

        this.unidade = unidade;
        this.comarca = comarca;
        this.equipe = equipe;
        this.juiz = juiz;
        this.info = info;

    }

    public Correicao(String info){

        this.info = info;

    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getComarca() {
        return comarca;
    }

    public void setComarca(String comarca) {
        this.comarca = comarca;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public String getJuiz() {
        return juiz;
    }

    public void setJuiz(String juiz) {
        this.juiz = juiz;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
