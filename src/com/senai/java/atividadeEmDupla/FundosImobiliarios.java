package com.senai.java.atividadeEmDupla;

public class FundosImobiliarios extends Investimento {

    public FundosImobiliarios(String nome, double valorInvestido, double taxaRetorno) {
        super(nome, valorInvestido, taxaRetorno);
    }

    @Override
    public double calcularRendimento() {
        return valorInvestido * (taxaRetorno / 100);
    }
}

