package com.senai.java.metodo.loop;

/*
    Escreva um programa que receba uma palavra e exiba cada letra separadamente - Utilize um laço for
*/

import java.util.Scanner;

public class _ExercicioLetrasSeparadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();


        for (int i = 1; i <= palavra.length(); i++) {

            System.out.println("Letra " + (i) + ": " + palavra.charAt(i - 1));
        }

        scanner.close();
    }
}
