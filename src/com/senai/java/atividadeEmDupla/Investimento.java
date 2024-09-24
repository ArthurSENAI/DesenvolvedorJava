package com.senai.java.atividadeEmDupla;

public class Investimento {
    protected String nome;
    protected double valorInvestido;
    protected double taxaRetorno;

    public Investimento(String nome, double valorInvestido, double taxaRetorno) {
        this.nome = nome;
        this.valorInvestido = valorInvestido;
        this.taxaRetorno = taxaRetorno;
    }

    // Método abstrato para calcular rendimento
    public double calcularRendimento() {
        return 0;
    }

    // Relatório básico
    public String relatorio() {
        return "Investimento: " + nome + ", Valor: R$ " + valorInvestido + ", Taxa de retorno: " + taxaRetorno + "%, Rendimento: R$ " + calcularRendimento();
    }

    // Getters e Setters
    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public double getValorInvestido() {

        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {

        this.valorInvestido = valorInvestido;
    }

    public double getTaxaRetorno() {

        return taxaRetorno;
    }

    public void setTaxaRetorno(double taxaRetorno) {
        this.taxaRetorno = taxaRetorno;
    }
}
