package com.senai.java.atividadeEmDupla;

public class Acoes extends Investimento {

    public Acoes(String nome, double valorInvestido, double taxaRetorno) {
        super(nome, valorInvestido, taxaRetorno);
    }

    @Override
    public double calcularRendimento() {
        return valorInvestido * (taxaRetorno / 100);
    }
}
