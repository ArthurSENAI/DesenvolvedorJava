package com.senai.java.atividadeEmDupla;

import java.util.Scanner;

public class GerenciarProducao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produtor produtor = new Produtor("João Silva", "Fazenda Boa Vista");

        String[] nomesGraos = {"Soja", "Milho", "Trigo"};
        Grao[] graos = new Grao[3];

        for (int i = 0; i < nomesGraos.length; i++) {
            System.out.println("Digite a quantidade produzida de " + nomesGraos[i] + " (em toneladas): ");
            double quantidade = sc.nextDouble();
            System.out.println("Digite o preço por tonelada de " + nomesGraos[i] + " (em R$): ");
            double preco = sc.nextDouble();
            sc.nextLine(); // Consumir a nova linha

            graos[i] = new Grao(nomesGraos[i], quantidade, preco);
            produtor.adicionarGrao(graos[i]);
        }

        // Exibir a quantidade total de toneladas produzidas
        double totalToneladas = 0;
        double faturamentoTotal = 0;

        System.out.println("\nRelatório de Produção:");
        for (Grao grao : produtor.getGraosProduzidos()) {
            totalToneladas += grao.getQuantidade();
            double faturamento = grao.calcularFaturamento();
            faturamentoTotal += faturamento;
            System.out.println(grao);
            System.out.println("Faturamento: R$" + faturamento);
        }

        // Previsão de faturamento com alteração de preço
        double percentualAlteracao = 10.0; // Alteração de preço em porcentagem
        System.out.println("\nPrevisão de Faturamento com alteração de " + percentualAlteracao + "% no preço:");

        double faturamentoPrevisaoAlta = 0;
        double faturamentoPrevisaoBaixa = 0;

        for (Grao grao : produtor.getGraosProduzidos()) {
            double faturamentoAlta = grao.preverFaturamento(percentualAlteracao);
            double faturamentoBaixa = grao.preverFaturamento(-percentualAlteracao);
            faturamentoPrevisaoAlta += faturamentoAlta;
            faturamentoPrevisaoBaixa += faturamentoBaixa;
            System.out.println(grao.getNome() + " com aumento: R$" + faturamentoAlta);
            System.out.println(grao.getNome() + " com redução: R$" + faturamentoBaixa);
        }

        System.out.println("\nTotal de toneladas produzidas: " + totalToneladas);
        System.out.println("Faturamento total: R$" + faturamentoTotal);
        System.out.println("Previsão de faturamento com aumento de 10%: R$" + faturamentoPrevisaoAlta);
        System.out.println("Previsão de faturamento com redução de 10%: R$" + faturamentoPrevisaoBaixa);

        sc.close();
    }
}
