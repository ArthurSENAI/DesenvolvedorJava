package com.senai.java.array;

import java.util.Scanner;
/*
 Desenvolva um programa para uma pequena loja de conveniência que ajude a gerenciar o estoque de produtos. O sistema deve permitir o
 cadastro de até 10 produtos, cada um com um nome, preço, e quantidade em estoque.
Requisitos:
            Crie uma classe Produto com atributos: nome (String), preco (double), e quantidade (int).
            O sistema deve exibir a lista de produtos cadastrados e o valor total de cada item em estoque (preço * quantidade).
            O usuário deve ser capaz de adicionar e remover produtos da lista.
 */

public class GerenciarEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto[] produtos = new Produto[10];
        int numProdutos = 0;
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Exibir produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha deixada pelo nextInt()

            switch (opcao) {
                case 1:
                    if (numProdutos < 10) {
                        System.out.print("Digite o nome do produto: ");
                        String nome = sc.nextLine();
                        System.out.print("Digite o preço do produto: ");
                        double preco = sc.nextDouble();
                        System.out.print("Digite a quantidade em estoque: ");
                        int quantidade = sc.nextInt();
                        sc.nextLine(); // Consumir a nova linha

                        produtos[numProdutos] = new Produto(nome, preco, quantidade);
                        numProdutos++;
                        System.out.println("Produto adicionado com sucesso!");
                    } else {
                        System.out.println("Não é possível adicionar mais produtos. O limite de 10 produtos foi alcançado.");
                    }
                    break;

                case 2:
                    System.out.println("Digite o número do produto para remover:");
                    for (int i = 0; i < numProdutos; i++) {
                        System.out.println((i + 1) + ". " + produtos[i].getNome());
                    }
                    int produtoNumero = sc.nextInt();
                    sc.nextLine(); // Limpar cache

                    if (produtoNumero >= 1 && produtoNumero <= numProdutos) {
                        for (int i = produtoNumero - 1; i < numProdutos - 1; i++) {
                            produtos[i] = produtos[i + 1];
                        }
                        produtos[numProdutos - 1] = null; // Limpar a última posição
                        numProdutos--;
                        System.out.println("Produto removido com sucesso.");
                    } else {
                        System.out.println("Número do produto inválido.");
                    }
                    break;

                case 3:
                    System.out.println("\nLista de Produtos:");
                    for (int i = 0; i < numProdutos; i++) {
                        System.out.println((i + 1) + ". " + produtos[i].ExibirInfo());
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
