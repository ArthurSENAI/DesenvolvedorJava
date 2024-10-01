package com.senai.java.desafioVarejo;

import com.senai.java.desafioVarejo.cliente.ClienteAtacado;
import com.senai.java.desafioVarejo.cliente.ClienteVarejo;
import com.senai.java.desafioVarejo.produto.Produto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Varejo varejo = new Varejo();
        int opcao;

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                switch (opcao) {
                    case 1:
                        criarPedidoClienteAtacado(scanner, varejo);
                        break;
                    case 2:
                        criarPedidoClienteVarejo(scanner, varejo);
                        break;
                    case 3:
                        gerarRelatorioPedidos(varejo);
                        break;
                    case 4:
                        System.out.println("Saindo do sistema. Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.\n");
                scanner.nextLine(); // Consumir a entrada inválida
                opcao = -1; // Manter o loop ativo
            }
        } while (opcao != 4);

        scanner.close();
    }

    // Método para exibir o menu de opções
    private static void exibirMenu() {
        System.out.println("===== Sistema de Varejo =====");
        System.out.println("1. Criar Pedido para Cliente Atacado");
        System.out.println("2. Criar Pedido para Cliente Varejo");
        System.out.println("3. Gerar Relatórios");
        System.out.println("4. Sair");
        System.out.println("============================");
    }

    // Método para criar pedido para Cliente Atacado
    private static void criarPedidoClienteAtacado(Scanner scanner, Varejo varejo) {
        try {
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o CPF do cliente: ");
            String cpf = scanner.nextLine();

            System.out.print("Digite o desconto (%): ");
            double desconto = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha

            ClienteAtacado cliente = new ClienteAtacado(nome, cpf, desconto);

            System.out.print("Digite o número do pedido: ");
            int numeroPedido = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            Pedido pedido = new Pedido(numeroPedido, cliente);
            adicionarProdutosAoPedido(scanner, pedido);

            varejo.adicionarPedido(pedido);
            System.out.println("Pedido para Cliente Atacado adicionado com sucesso!\n");

        } catch (InputMismatchException e) {
            System.out.println("Erro na criação do pedido. Certifique-se de inserir os dados corretamente.\n");
            scanner.nextLine(); // Consumir a entrada inválida
        }
    }

    // Método para criar pedido para Cliente Varejo
    private static void criarPedidoClienteVarejo(Scanner scanner, Varejo varejo) {
        try {
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o CPF do cliente: ");
            String cpf = scanner.nextLine();

            System.out.print("Digite os pontos de fidelidade: ");
            int pontosFidelidade = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            ClienteVarejo cliente = new ClienteVarejo(nome, cpf, pontosFidelidade);

            System.out.print("Digite o número do pedido: ");
            int numeroPedido = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            Pedido pedido = new Pedido(numeroPedido, cliente);
            adicionarProdutosAoPedido(scanner, pedido);

            varejo.adicionarPedido(pedido);
            System.out.println("Pedido para Cliente Varejo adicionado com sucesso!\n");

        } catch (InputMismatchException e) {
            System.out.println("Erro na criação do pedido. Certifique-se de inserir os dados corretamente.\n");
            scanner.nextLine(); // Consumir a entrada inválida
        }
    }

    // Método para adicionar produtos ao pedido
    private static void adicionarProdutosAoPedido(Scanner scanner, Pedido pedido) {
        System.out.print("Quantos produtos deseja adicionar ao pedido? ");
        int quantidadeProdutos = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.print("Digite o nome do produto: ");
            String nomeProduto = scanner.nextLine();

            System.out.print("Digite o preço do produto: ");
            double precoProduto = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha

            Produto produto = new Produto(nomeProduto, precoProduto);
            pedido.adicionarProduto(produto);
        }
    }

    // Método para gerar relatório dos pedidos diferenciando atacado e varejo
    private static void gerarRelatorioPedidos(Varejo varejo) {
        varejo.gerarRelatorios();
    }
}
