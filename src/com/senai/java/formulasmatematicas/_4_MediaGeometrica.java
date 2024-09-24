package com.senai.java.formulasmatematicas;

import java.util.Scanner;

/*
    Escreva um programa que calcule e exiba a média geométrica de três números informados pelo usuário
*/
public class _4_MediaGeometrica {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double media = Math.sqrt(numero1 * numero2) ;

        System.out.println("Media: " + media);


        scanner.close();
    }

}
