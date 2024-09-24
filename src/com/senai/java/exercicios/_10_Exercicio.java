package com.senai.java.exercicios;

import java.util.Scanner;
/*
Desenvolver um algoritmo que leia o nome de um
vendedor, seu salário fixo, o total de vendas efetuadas por ele no mês e
o número de horas extras trabalhadas. O vendedor ganha uma comissão de
15% sobre as vendas realizadas. Se o total de vendas for superior a R$
20.000,00, ele recebe uma bonificação adicional de R$ 1.000,00. Além
disso, se as vendas forem superiores a R$ 50.000,00, ele recebe uma
bonificação extra de R$ 2.000,00. O vendedor também recebe um valor
adicional de R$ 50,00 por hora extra trabalhada, desde que tenha vendido
mais de R$ 10.000,00 no mês. Se as vendas forem inferiores a R$
5.000,00, o vendedor recebe uma penalidade de 10% sobre o salário fixo. O
algoritmo deve informar o nome do vendedor, o salário fixo, o valor da
comissão, se ele recebeu ou não as bonificações, o valor das horas
extras, a penalidade (se houver), e o salário final no mês.
 */

public class _10_Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite o nome do Vendedor: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.println("Digite o total de vendas efetuadas no mês: ");
        double totalVendas = scanner.nextDouble();

        System.out.println("Digite o número de horas extras trabalhadas: ");
        int horasExtras = scanner.nextInt();

        // Comissão e bonificações
        double comissao = totalVendas * 0.15;
        double salarioFinal = salarioFixo + comissao;

        boolean recebeuBonificacao = false;
        boolean recebeuBonificacaoExtra = false;

        if (totalVendas > 50000) {
            salarioFinal += 2000;
            recebeuBonificacaoExtra = true;
        } else if (totalVendas > 20000) {
            salarioFinal += 1000;
            recebeuBonificacao = true;
        }

        // Horas extras
        double valorHorasExtras = 0;
        if (totalVendas > 10000) {
            valorHorasExtras = horasExtras * 50;
            salarioFinal += valorHorasExtras;
        }

        // Penalidade
        double penalidade = 0;
        if (totalVendas < 5000) {
            penalidade = salarioFixo * 0.10;
            salarioFinal -= penalidade;
        }


        System.out.println("Nome do vendedor: " + nome);
        System.out.println("Salário fixo: R$ " + salarioFixo);
        System.out.println("Valor da comissão: R$ " + comissao);

        if (recebeuBonificacao) {
            System.out.println("Recebeu bonificação de R$ 1.000,00");
        }
        if (recebeuBonificacaoExtra) {
            System.out.println("Recebeu bonificação extra de R$ 2.000,00");
        }
        if (valorHorasExtras > 0) {
            System.out.println("Valor das horas extras: R$ " + valorHorasExtras);
        }
        if (penalidade > 0) {
            System.out.println("Penalidade aplicada: R$ " + penalidade);
        }
        System.out.println("Salário final no mês: R$ " + salarioFinal);

        scanner.close();
    }
}

