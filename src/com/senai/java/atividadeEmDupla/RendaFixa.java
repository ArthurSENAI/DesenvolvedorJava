package com.senai.java.atividadeEmDupla;

public class RendaFixa extends Investimento {

    public RendaFixa(String nome, double valorInvestido, double taxaRetorno) {
        super(nome, valorInvestido, taxaRetorno);
    }

    @Override
    public double calcularRendimento() {
        return valorInvestido * (taxaRetorno / 100);
    }
}
