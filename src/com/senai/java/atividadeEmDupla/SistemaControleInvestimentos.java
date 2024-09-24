package com.senai.java.atividadeEmDupla;

/*
    Uma fintech está desenvolvendo um sistema para gerenciar a carteira de investimentos de seus clientes. O sistema
    deverá permitir ao usuário adicionar diferentes tipos de investimentos, calcular os rendimentos e fornecer um
    relatório detalhado da carteira.
 */


import java.util.Scanner;


public class SistemaControleInvestimentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array para armazenar os investimentos
        Investimento[] carteira = new Investimento[10];
        int index = 0;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar novo investimento");
            System.out.println("2 - Exibir relatório da carteira");
            System.out.println("3 - Calcular total de rendimentos");
            System.out.println("4 - Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Cadastro de novo investimento
                    System.out.println("Escolha o tipo de investimento:");
                    System.out.println("1 - Renda Fixa");
                    System.out.println("2 - Ações");
                    System.out.println("3 - Fundos Imobiliários");
                    int tipo = scanner.nextInt();

                    System.out.println("Digite o nome do investimento:");
                    String nome = scanner.next();

                    System.out.println("Digite o valor investido:");
                    double valorInvestido = scanner.nextDouble();

                    System.out.println("Digite a taxa de retorno anual (%):");
                    double taxaRetorno = scanner.nextDouble();

                    switch (tipo) {
                        case 1:
                            carteira[index] = new RendaFixa(nome, valorInvestido, taxaRetorno);
                            break;
                        case 2:
                            carteira[index] = new Acoes(nome, valorInvestido, taxaRetorno);
                            break;
                        case 3:
                            carteira[index] = new FundosImobiliarios(nome, valorInvestido, taxaRetorno);
                            break;
                        default:
                            System.out.println("Tipo de investimento inválido.");
                    }
                    index++;
                    break;

                case 2:
                    // Exibir relatório da carteira
                    System.out.println("Relatório da Carteira de Investimentos:");
                    for (int i = 0; i < index; i++) {
                        System.out.println(carteira[i].relatorio());
                    }
                    break;

                case 3:
                    // Calcular o total de rendimentos
                    double totalRendimentos = 0;
                    for (int i = 0; i < index; i++) {
                        totalRendimentos += carteira[i].calcularRendimento();
                    }
                    System.out.println("Total de rendimentos da carteira: R$ " + totalRendimentos);
                    break;

                case 4:
                    // Sair do programa
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
