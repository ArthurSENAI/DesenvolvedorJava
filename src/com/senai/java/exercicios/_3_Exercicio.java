package com.senai.java.exercicios;

import java.util.Scanner;

/*
    Escrever um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.
 */
public class _3_Exercicio {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o consumo total: ");
        double consumo = scanner.nextDouble();

        System.out.println("Digite a distancia percorrida: ");
        double distancia = scanner.nextDouble();

        double consumoMedio = distancia/consumo;


        System.out.println("Consumo Medio: " + consumoMedio);

        scanner.close();
    }
}
