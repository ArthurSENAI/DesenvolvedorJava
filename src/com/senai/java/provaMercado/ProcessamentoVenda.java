package com.senai.java.provaMercado;

public interface ProcessamentoVenda {
    double calcularDesconto(double valorTotal);
    double calcularFrete(double valorTotal);
    void gerarNotaFiscal(double valorTotal);
}