package com.senai.java.exercicios;

import java.util.Scanner;

/*
Exercício 15: Exibe o nome do mês correspondente.
Enunciado: Crie um algoritmo que lê um número de 1 a 12 e exibe o nome do mês correspondente.
Utilize a estrutura switch para implementar a lógica.
 */
public class _15_Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número do mês
        System.out.println("Digite um número de 1 a 12 para exibir o nome do mês correspondente: ");
        int numeroMes = scanner.nextInt();

        // Utiliza o switch para exibir o nome do mês correspondente
        switch (numeroMes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Número inválido! Digite um número entre 1 e 12.");
                break;
        }

        scanner.close();
    }
}
