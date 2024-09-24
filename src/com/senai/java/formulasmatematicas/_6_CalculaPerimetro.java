package com.senai.java.formulasmatematicas;

import java.util.Scanner;

/*
    Escreva um programa que calcule e exiba o perímetro de um círculo, solicitando o raio ao usuário
*/
public class _6_CalculaPerimetro {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        double raio= scanner.nextDouble();


        double perimetro = Math.PI * 2 * raio ;

        System.out.printf("Perimetro: %.2f ", perimetro);


        scanner.close();
    }

}
