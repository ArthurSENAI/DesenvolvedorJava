package com.senai.java.polimorfismo;

public class Funcionario {
    protected String nome;
    protected int horasTrabalhadas;
    protected double valorPorHoras;

    public Funcionario(String nome, int horasTrabalhadas, double valorPorHoras) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHoras = valorPorHoras;
    }

    // Setter e Getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHoras() {
        return valorPorHoras;
    }

    public void setValorPorHoras(double valorPorHoras) {
        this.valorPorHoras = valorPorHoras;
    }

    //Metodo
    public double calcularSalario() {
        return 0;
    }
}
