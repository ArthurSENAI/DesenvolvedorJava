package com.senai.java.desafioVarejo.cliente;

import com.senai.java.desafioVarejo.Processamento;

public class ClienteVarejo extends Cliente implements Processamento {
    private int pontosFidelidade;

    public ClienteVarejo(String nome, String CPF, int pontosFidelidade) {
        super(nome, CPF);
        this.pontosFidelidade = pontosFidelidade;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }

    public void adicionarPontosFidelidade(int pontos) {
        this.pontosFidelidade += pontos;
        System.out.println("Pontos fidelidade adicionados. Total: " + pontosFidelidade);
    }


    @Override
    public double calcularDesconto(double valorTotal) {
        int desconto = pontosFidelidade / 10;
        return valorTotal - desconto;
    }

    @Override
    public double calcularFrete(double valorTotal) {
        return valorTotal * 0.05;
    }

    @Override
    public void gerarNotaFiscal(double valorTotal) {
        double descontoAplicado = calcularDesconto(valorTotal);
        double valorFinal = valorTotal - descontoAplicado;
        System.out.println("-----------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("Valor total: " + valorTotal);
        System.out.println("Desconto: " + descontoAplicado);
        System.out.println("Valor Final: " + valorFinal);
        System.out.println("Frete: " + calcularFrete(valorTotal));
        System.out.println("-----------------------");
    }

}
