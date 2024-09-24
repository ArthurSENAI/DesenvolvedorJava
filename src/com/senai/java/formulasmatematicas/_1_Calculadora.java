package com.senai.java.formulasmatematicas;

import java.util.Scanner;

/*
    Escreva um programa que calcule e exiba a soma, subtração, multiplicação e divisão de dois números informados pelo usuário
*/
public class _1_Calculadora {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.printf("Divisão: %.2f" , divisao);

        scanner.close();
    }
}
