package com.senai.java.provaMercado;

public class ClienteComum extends Cliente implements ProcessamentoVenda{
    public ClienteComum(String nome, String CPF) {
        super(nome, CPF);
    }

    @Override
    public double calcularDesconto(double valorTotal) {
        return 0;
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
        System.out.println("Valor Final: " + valorFinal);
        System.out.println("Frete: " + calcularFrete(valorTotal));
        System.out.println("-----------------------");
    }
}
