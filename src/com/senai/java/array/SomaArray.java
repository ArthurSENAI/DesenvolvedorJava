package com.senai.java.array;

/*
Desenvolva um programa que receba um array de tamanho N de números inteiros e exiba a soma de todos os elementos.
 */

import java.util.Scanner;

public class SomaArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros deseja somar?");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        int soma = 0;

        for(int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i+1) + "º Numero:");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        System.out.println("O resultado da soma é: " + soma);
    }
}
