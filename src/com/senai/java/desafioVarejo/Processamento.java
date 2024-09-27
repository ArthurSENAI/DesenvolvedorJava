package com.senai.java.desafioVarejo;

public interface Processamento {
    double calcularDesconto(double valorTotal);
    double calcularFrete(double valorTotal);
    void gerarNotaFiscal(double valorTotal);
}
