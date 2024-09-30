package com.senai.java.provaMercado;

public class ClienteFrequente extends Cliente implements ProcessamentoVenda {
    private int desconto;

    public ClienteFrequente(String nome, String CPF, int desconto) {
        super(nome, CPF);
        this.desconto = desconto;
    }

    // Getter para o desconto
    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    @Override
    public double calcularDesconto(double valorTotal) {
        double descontoPadrao = valorTotal * 0.05;  // 5% padrão
        double descontoCliente = valorTotal * ((double) desconto / 100);
        return descontoPadrao + descontoCliente;
    }

    @Override
    public double calcularFrete(double valorTotal) {
        return valorTotal * 0.05;
    }

    @Override
    public void gerarNotaFiscal(double valorTotal) {
        double descontoAplicado = calcularDesconto(valorTotal);
        double frete = calcularFrete(valorTotal);
        double valorFinal = valorTotal - descontoAplicado + frete;

        System.out.println("-----------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
        System.out.printf("Valor total: %.2f%n", valorTotal);
        System.out.printf("Desconto aplicado: %.2f%n", descontoAplicado);
        System.out.printf("Frete: %.2f%n", frete);
        System.out.printf("Valor final: %.2f%n", valorFinal);
        System.out.println("-----------------------");
    }
}