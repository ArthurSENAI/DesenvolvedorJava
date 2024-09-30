package com.senai.java.metodo.loop;

/*
    Escreva um programa que receba uma frase e verifique quantas letras 'A' existem na frase - Utilize laço for
*/

import java.util.Scanner;

public class _ExercicioContarLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a frase ao usuário
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Variável para contar o número de letras 'A'
        int contadorA = 0;

        // Laço for para percorrer cada caractere da frase
        for (int i = 0; i < frase.length(); i++) {
            // Verifica se o caractere atual é 'A' ou 'a'
            if (frase.charAt(i) == 'A' || frase.charAt(i) == 'a') {
                contadorA++;
            }
        }

        // Exibe o total de letras 'A' encontradas
        System.out.println("A frase contém " + contadorA + " letras 'A'.");

        scanner.close();
    }
}
