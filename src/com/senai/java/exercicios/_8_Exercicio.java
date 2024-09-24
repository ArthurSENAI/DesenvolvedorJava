package com.senai.java.exercicios;

import java.util.Scanner;

/*
Elaborar um algoritmo que efetue a  apresentação do valor da conversão em real
(R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e
também a quantidade de dólares disponíveis com o usuário.
 */

public class _8_Exercicio {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em Dolar que deseja converter: ");
        double dolar = scanner.nextDouble();

        System.out.println("Qual a cotação atual do dolar?: ");
        double convercao = scanner.nextDouble();

        double real = dolar * convercao;

        System.out.printf("O valor em Reais é: R$ %.2f%n", real);

        scanner.close();
    }
}
