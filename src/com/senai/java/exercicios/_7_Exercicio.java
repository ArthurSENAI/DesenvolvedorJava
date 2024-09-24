package com.senai.java.exercicios;

import java.util.Scanner;

/*
Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
 */

public class _7_Exercicio {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor Celsius que deseja converter: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9*celsius+160) / 5;

        System.out.println("O valor em Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}
