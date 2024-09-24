package com.senai.java.atividadeEmDupla;

import java.util.Scanner;

public class GerenciamentoDeProducao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produtor:");
        String nome = sc.nextLine();
        System.out.println("Digite o nome da fazenda");
        String fazenda = sc.nextLine();
        Produtor produtor = new Produtor(nome, fazenda);

        String[] nomeGraos = {"Soja", "Milho", "Trigo"};
        Grao[] graos = new Grao[3];

        for (int i = 0; i < nomeGraos.length; i++) {
            System.out.println("Digite a quantidade produzida de " + nomeGraos[i] + " em toneladas: ");
            double quantidade = sc.nextDouble();
            System.out.println("Digite o preco por tonelada de  " + nomeGraos[i] + "em reais: ");
            double preco = sc.nextDouble();

            graos[i] = new Grao(nomeGraos[i], quantidade, preco);
            produtor.adicionarGrao(graos[i]);
        }

        double totalToneladas = 0;
        double totalFaturamento = 0;

        System.out.println("\nRelatorio de Produção: ");
        for (Grao grao : produtor.getGraosProduzidos()) {
            totalToneladas += grao.getQuantidade();
            double faturamento = grao.calcularFaturamento();
            totalFaturamento += faturamento;
            System.out.println(grao);
            System.out.println("Faturamento: R$" + faturamento);
        }

        double percentual = 10.0;
        System.out.println("Previsão de Alteração");

        double faturamentoAltoPrevisto = 0;
        double faturamentoBaixoPrevisto = 0;

        for (Grao grao : produtor.getGraosProduzidos()) {
            double faturamentoAlto = grao.preverFaturamento(percentual);
            double faturamentoBaixo = grao.preverFaturamento(-percentual);
            faturamentoAltoPrevisto += faturamentoAlto;
            faturamentoBaixoPrevisto += faturamentoBaixo;
            System.out.println(grao.getNome() + " com aumento: R$" + faturamentoAlto);
            System.out.println(grao.getNome() + " com redução: R$" + faturamentoBaixo);
        }

        System.out.println("\nTotal de toneladas produzidas: " + totalToneladas);
        System.out.println("Faturamento total: R$" + totalFaturamento);
        System.out.println("Previsão de faturamento com aumento de 10%: R$" + faturamentoAltoPrevisto);
        System.out.println("Previsão de faturamento com redução de 10%: R$" + faturamentoBaixoPrevisto);

        sc.close();
    }
}
