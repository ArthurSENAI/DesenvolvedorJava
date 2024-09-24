package com.senai.java.atividadeEmDupla;

public class Grao {
    private String nome;
    private double quantidade;
    private double precoPorTonelada;

    //Construtor
    public Grao(String nome, double quantidade, double precoPorTonelada) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoPorTonelada = precoPorTonelada;
    }

    // Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoPorTonelada() {
        return precoPorTonelada;
    }

    public void setPrecoPorTonelada (double precoPorTonelada) {
        this.precoPorTonelada = precoPorTonelada;
    }


    // Faturamento

    public double calcularFaturamento() {
        return quantidade * precoPorTonelada;
    }

    public double preverFaturamento (double percentualAlteracao) {
        double precoFinal = precoPorTonelada * (1 + percentualAlteracao / 100);
        return quantidade * precoFinal;
    }

    // Info
    public void exibirInfo() {
        System.out.println("Grão: " + nome + ", Quantidade: " + quantidade + " toneladas, Preço por tonelada: R$" + precoPorTonelada);
    }

}
