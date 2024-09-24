package com.senai.java.polimorfismo;

public class Assistente extends Funcionario{
    public Assistente(String nome, int horasTrabalhadas, double valorPorHoras) {
        super(nome, horasTrabalhadas, valorPorHoras);
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorPorHoras;
    }
}
