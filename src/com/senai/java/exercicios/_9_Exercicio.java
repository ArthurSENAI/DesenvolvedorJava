package com.senai.java.exercicios;

import java.util.Scanner;

/*
9. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda.
Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário.
 */
public class _9_Exercicio {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de custo do produto: ");
        double custo = scanner.nextDouble();

        System.out.println("Qual a porcentagem de lucro que deseja receber?(0 a 100): ");
        double lucro = scanner.nextDouble();

        double venda = custo * (1 + (lucro/100));

        System.out.printf("O valor de venda é: R$ %.2f%n", venda);

        scanner.close();
    }
}
