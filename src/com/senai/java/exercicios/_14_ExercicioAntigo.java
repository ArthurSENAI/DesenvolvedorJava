package com.senai.java.exercicios;

import java.util.Scanner;

/*
Exercício 14: Leitura e Escrita de Números por Extenso

Faça um algoritmo que leia N números inteiros, cada um deles no intervalo de 1 a 10, e escreva por extenso o número correspondente.
Caso o usuário digite um número fora do intervalo, exiba a mensagem: "Número inválido" e continue solicitando a
entrada até que todos os N números válidos sejam digitados.
 */

public class _14_ExercicioAntigo {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros deseja armazenar?");
        int quant = scanner.nextInt();

        int[] numeros = new int[quant];
        int i = 0;

        // Loop para garantir que todos os N números válidos sejam digitados
        while (i < quant) {

            System.out.println("Digite um numero de 1 a 10: ");
            int numero = scanner.nextInt();

            if ((1 <= numero) && (numero <= 10)) {
                // Armazena o número no array e avança para o próximo
                numeros[i] = numero;
                i++;
            } else {
                // Solicita a entrada novamente se o número for inválido
                System.out.println("Esse numero é invalido. Digite um numero de 1 a 10");
            }

        };

        System.out.println("Números digitados por extenso:");
        for (int j = 0; j < quant; j++) {
            String extenso = "";
            switch (numeros[j]){
                case 1:
                    extenso = "Um";
                    break;
                case 2:
                    extenso = "Dois";
                    break;
                case 3:
                    extenso = "Três";
                    break;
                case 4:
                    extenso = "Quatro";
                    break;
                case 5:
                    extenso = "Cinco";
                    break;
                case 6:
                    extenso = "Seis";
                    break;
                case 7:
                    extenso = "Sete";
                    break;
                case 8:
                    extenso = "Oito";
                    break;
                case 9:
                    extenso = "Nove";
                    break;
                case 10:
                    extenso = "Dez";
                    break;
            }
            System.out.println(extenso);
        }

        scanner.close();
    }
}
