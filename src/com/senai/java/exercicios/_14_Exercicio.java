package com.senai.java.exercicios;

import java.util.Scanner;

public class _14_Exercicio {

    public int[] lerNumerosValidos(Scanner scanner, int quant) {
        int[] numeros = new int[quant];
        int i = 0;

        while (i < quant) {
            System.out.println("Digite um número de 1 a 10: ");
            int numero = scanner.nextInt();

            if (numero >= 1 && numero <= 10) {
                numeros[i] = numero;
                i++;
            } else {
                System.out.println("Número inválido. Digite um número de 1 a 10.");
            }
        }

        return numeros;
    }

    public String numeroPorExtenso(int numero) {
        String extenso = "";

        switch (numero) {
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

        return extenso;
    }
}
