package com.senai.java.loop;

import java.util.Scanner;

/*
Escreva um programa que substitua todas as letras 'a' por 'e' - Utilize um laço for
 */

public class _ExercicioSubstituirLetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a palavra:");
        String palavra = sc.nextLine();

        String novaPalavra = "";

        for (int i = 0; i < palavra.length(); i++) {
            char caracter = palavra.charAt(i);
            if (caracter == 'a') {
                novaPalavra += 'e';
            } else if (caracter == 'A') {
                novaPalavra += 'E';
            } else {
                novaPalavra += caracter;
            }
        }

        System.out.println("A palavra convertida é: " + novaPalavra);

    }
}
