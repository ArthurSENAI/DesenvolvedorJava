package com.senai.java.alex;

import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;
        double resultado = 0;
        String operacao;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        operacao = scanner.nextLine();

        switch (operacao) {
            case "1":
                resultado = num1 + num2;
                break;
            case "2":
                resultado = num1 - num2;
                break;
            case "3":
                resultado = num1 * num2;
                break;
            case "4":
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Numero invalido.");
                break;
        }
        System.out.println("Resultado: " + resultado + ".");
    }
}
