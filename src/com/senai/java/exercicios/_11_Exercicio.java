package com.senai.java.exercicios;

import java.util.Scanner;

/*
Soma dos N primeiros números
Escreva um programa que some os primeiros N números inteiros e exiba o resultado.
 */

public class _11_Exercicio {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros deseja somar: ");
        int num = scanner.nextInt();

        int soma = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("Qual o : " + (i+1) + "º numero?");
            int num1 = scanner.nextInt();
            soma += num1;
        }

        System.out.println("O valor da soma dos " + num + " numeros é: " + soma);

        scanner.close();
    }
}
