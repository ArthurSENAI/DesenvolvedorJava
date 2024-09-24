package com.senai.java.array;

import java.util.Random;
import java.util.Scanner;
/*
Crie um jogo de adivinhação de números onde o computador gera um número aleatório entre 1 e 100 e o
usuário deve adivinhar o número. O programa deve informar se o palpite está "muito alto", "muito baixo" ou
"correto", e contar o número de tentativas até que o usuário acerte.
 */

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int numeroAleatorio = rd.nextInt(101);
        boolean acerto = true;
        int contador = 0;
        while(acerto){

            System.out.println("Digite qual numero acha que é: ");
            int n = sc.nextInt();

            if (numeroAleatorio < n) {
                System.out.println("Muito Alto");

            } else if (numeroAleatorio > n) {
                System.out.println("Muito baixo");

            } else {
                System.out.println("Acertou!");
                acerto = false;
            }

           // System.out.println(numeroAleatorio < n ? "Muito Alto" : numeroAleatorio > n ? "Muito baixo" : "Acertou!");

            contador++;

        }

        System.out.println("Numero de tentativas até acertar: " + contador);
    }
}
