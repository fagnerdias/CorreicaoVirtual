package com.example.f202340.correicaovirtual.model;

public class Planejamento {
    String nome;
    String unidades;
    Correicao[] correicao;


    public Planejamento(String nome){
        this.nome = nome;
    }

    public Planejamento(String nome, String unidades) {
        this.nome = nome;
        this.unidades = unidades;
    }


    @Override
    public String toString() {
        return nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public Correicao[] getCorreicao() {
        return correicao;
    }

    public void setCorreicao(Correicao[] correicao) {
        this.correicao = correicao;
    }
}
