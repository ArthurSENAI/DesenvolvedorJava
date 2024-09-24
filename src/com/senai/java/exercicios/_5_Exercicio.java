package com.senai.java.exercicios;

import java.util.Scanner;

/*
Desenvolver um algoritmo que leia o nome de um vendedor, seu salário fixo e o total de vendas efetuadas por ele no
mês. O vendedor ganha uma comissão de 15% sobre as vendas realizadas. No entanto, se o total de vendas for superior a R$ 20.000,00,
ele recebe  uma bonificação adicional de R$ 1.000,00. O algoritmo deve informar o nome do vendedor, o salário fixo, valor da comissão,
se ele recebeu ou não a bonificação e o salário final no mês.
 */
public class _5_Exercicio {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Vendedor: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o salario fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o total de vendas: ");
        double totalVendas = scanner.nextDouble();

        double comissao = totalVendas * 0.15;
        double salarioFinal = salarioFixo + comissao;

        if(totalVendas > 20000){
            salarioFinal += 1000;
            System.out.println("Nome do vendedor: " + nome);
            System.out.println("Salário fixo: R$ " + salarioFixo);
            System.out.println("Valor da comissão: R$ " + comissao);
            System.out.println("Recebeu bonificação de R$ 1.000,00");
        } else {
            System.out.println("Nome do vendedor: " + nome);
            System.out.println("Salário fixo: R$ " + salarioFixo);
            System.out.println("Valor da comissão: R$ " + comissao);
            System.out.println("Não recebeu bonificação");
        }

        System.out.println("Salário final no mês: R$ " + salarioFinal);

        scanner.close();
    }
}