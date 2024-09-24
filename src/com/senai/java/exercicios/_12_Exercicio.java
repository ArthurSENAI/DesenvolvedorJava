package com.senai.java.exercicios;

import java.util.Scanner;

/*
Validação de entrada
Escreva um programa que solicite ao usuário um número positivo.
Caso o usuário insira um número negativo, o programa deve continuar solicitando até que um número válido seja inserido.
 */
public class _12_Exercicio {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean controle = true;

        do {
            System.out.println("Digite um numero positivo: ");
            int valido = scanner.nextInt();

            if (valido > 0) {
                System.out.println("O numero é positivo");
                controle = false;

            } else {
                System.out.println("Esse numero é invalido. Digite um numero positivo");
            }
        } while (controle);




        scanner.close();
    }
}
