package com.senai.java.polimorfismo;

public class Gerente extends Funcionario{
    public Gerente(String nome, int horasTrabalhadas, double valorPorHoras) {
        super(nome, horasTrabalhadas, valorPorHoras);
    }

    @Override
    public double calcularSalario() {
        return 0;
    }
}
