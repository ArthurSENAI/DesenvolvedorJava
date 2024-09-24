package com.senai.java.exceptions;

import java.util.Scanner;

public class Emprestimo2 {
    public static double validaValor(double valor) {
        if(valor < 100 || valor > 10000) {
            throw new IllegalArgumentException("o valor está fora do limite permitido");
        }
        return valor;
    }

    public static double calcularEmprestimo(double valor) throws IllegalArgumentException {
        return validaValor(valor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Qual valor deseja solicitar como emprestimo?");
        double emprestimo = sc.nextDouble();

        try {
            double valorAprovado = calcularEmprestimo(emprestimo);
            System.out.println("Empréstimo aprovado: R$ " + valorAprovado);
        }catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        }finally {
            System.out.println("\nBloco que que sempre será executado!");
            sc.close();
        }

    }
}
