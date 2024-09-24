package com.senai.java.formulasmatematicas;

import java.util.Scanner;

/*
    Escreva um programa que calcule e exiba a média aritmética de dois números informados pelo usuário
*/
public class _2_MediaAritmetica {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double media = (numero1 + numero2) / 2;

        System.out.println("Media: " + media);

        scanner.close();
    }

}
