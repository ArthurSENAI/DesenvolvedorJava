package com.senai.java.abstracao;

public class Main {
    public static void main(String[] args) {
        Empregado vendedor = new Vendedor();
        Empregado programador = new Programador();

        System.out.println("Bonificação do Vendedor: " + vendedor.calcularBonificacao());
        System.out.println("Bonificação do Programador: " + programador.calcularBonificacao());
    }
}
