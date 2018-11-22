package com.example.f202340.correicaovirtual.model;

public class Execucao {

    Correicao correicao;

    public Execucao(String str){
        this.correicao = new Correicao(str);
    }

    public Correicao getCorreicao() {
        return correicao;
    }

    public void setCorreicao(Correicao correicao) {
        this.correicao = correicao;
    }

    
    @Override
    public String toString() {
        return correicao.getInfo();
    }
}
