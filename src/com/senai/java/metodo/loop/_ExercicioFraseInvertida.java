package com.senai.java.metodo.loop;

/*
    Desenvolva um programa que solicite ao usuário uma frase e exiba a frase de trás para frente - Utilize laço for
*/

import java.util.Scanner;

public class _ExercicioFraseInvertida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();


        System.out.print("Frase de tras pra frente: ");
        for (int i = frase.length() - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }

        scanner.close();
    }
}
