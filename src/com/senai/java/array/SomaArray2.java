package com.senai.java.array;

import java.util.Scanner;

/*
2.- Desenvolva dois vetores de números inteiros com o mesmo tamanho e
crie um novo array para guardar e exibir a soma dos elementos dentro de ambos arrays inseridos pelo usuário.
 */

public class SomaArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros deseja somar?");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        int[] numeros2 = new int[n];
        int[] somas = new int[2];

        for(int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i+1) + "º Numero do 1º Array:");
            numeros[i] = sc.nextInt();
            somas[0] += numeros[i];
        }
        for(int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i+1) + "º Numero do 2º Array:");
            numeros2[i] = sc.nextInt();
            somas[1] += numeros2[i];
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("O resultado da soma do " + (i+1)  +"º array: " + somas[i]);
        }

    }
}
