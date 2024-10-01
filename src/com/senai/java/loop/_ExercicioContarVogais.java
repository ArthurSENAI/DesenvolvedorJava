package com.senai.java.loop;

/*
    Desenvolva um programa que leia uma palavra ou frase e exiba a quantidade de vogais presentes na mesma - Utilize
    laço for
*/

import java.util.Scanner;

public class _ExercicioContarVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite uma palavra ou frase: ");
        String frase = scanner.nextLine();

        // Contador
        int contadorVogais = 0;


        for (int i = 0; i < frase.length(); i++) {
            // Obtém o caractere atual e transforma em maiúscula
            char caractere = Character.toUpperCase(frase.charAt(i));

            // Verifica se o caractere é uma vogal (apenas maiúsculas agora)
            if (caractere == 'A' || caractere == 'E' || caractere == 'I' ||
                    caractere == 'O' || caractere == 'U') {
                contadorVogais++;
            }
        }


        System.out.println("A quantidade de vogais na frase é: " + contadorVogais);

        scanner.close();
    }
}
