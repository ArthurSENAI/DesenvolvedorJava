package com.senai.java.formulasmatematicas;

import java.util.Scanner;

/*
    Crie um programa que calcule e exiba a média aritmética de três notas informadas pelo usuário
*/
public class _3_MediaAritmeticaNotas {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Media das Notas: " + media);


        scanner.close();
    }

}
