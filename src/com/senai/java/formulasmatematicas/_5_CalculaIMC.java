package com.senai.java.formulasmatematicas;

import java.util.Scanner;

/*
    Escreva um programa que calcule e exiba o IMC de um individuo utilizando a fórmula  IMC= peso/(altura*altura)
*/
public class _5_CalculaIMC {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.println("IMC: " + imc);


        scanner.close();
    }

}
