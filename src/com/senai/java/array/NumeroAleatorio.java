package com.senai.java.array;

/*
Desenvolva um programa que gere automaticamente um array de números inteiros entre 0 e 100 com tamanho N inserido pelo usuário.
 */

import java.util.Random;
import java.util.Scanner;



public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();


        System.out.println("Digite quantos numeros deve-se ter o array: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        int maior = 0;

        for (int i = 0; i < n; i++) {
            numeros[i] = rd.nextInt(100) + 1;
            System.out.println(i + "º numeros: " + numeros[i]);
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }


        System.out.println("O maior numero do array é: " + maior);
    }
}
