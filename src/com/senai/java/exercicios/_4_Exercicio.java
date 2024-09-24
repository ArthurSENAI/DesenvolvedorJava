package com.senai.java.exercicios;

import java.util.Scanner;

/*
    Escrever um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
    Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês.
 */
public class _4_Exercicio {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Vendedor: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o salario fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o total de vendas no mês: ");
        double totalVendas = scanner.nextDouble();

        double salarioFinal = salarioFixo + (totalVendas * 0.15);


        System.out.println("o vendedor: " + nome + " - Salario fixo de: " + salarioFixo +" - Salario Final de: " + salarioFinal);

        scanner.close();
    }
}