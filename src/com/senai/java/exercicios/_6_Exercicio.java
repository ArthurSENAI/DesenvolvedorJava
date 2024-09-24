package com.senai.java.exercicios;

import java.util.Scanner;

/*
Ler dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a possuir o valor da
variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
 */
public class _6_Exercicio {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double A = scanner.nextDouble();

        System.out.println("Digite o Valor de B: ");
        double B = scanner.nextDouble();

        double C = A;
        A = B;
        B = C;


        System.out.println("Valor de A: " + A);
        System.out.println("Valor de B: " + B);

        scanner.close();
    }
}
