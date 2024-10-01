package com.senai.java.provaMercado;

import java.util.InputMismatchException;
import java.util.Scanner;

// Alunos: Arthur, Edson e Geraldo.

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mercado mercado = new Mercado();
        int opcao;

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        criarPedidoClienteComum(scanner, mercado);
                        break;
                    case 2:
                        criarPedidoClienteFrequente(scanner, mercado);
                        break;
                    case 3:
                        gerarRelatorioPedidos(mercado);
                        break;
                    case 4:
                        System.out.println("Saindo do sistema. Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.\n");
                scanner.nextLine();
                opcao = -1;
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("===== Sistema de Varejo =====");
        System.out.println("1. Criar Pedido para Cliente Comum");
        System.out.println("2. Criar Pedido para Cliente Frequente");
        System.out.println("3. Gerar Relatórios");
        System.out.println("4. Sair");
        System.out.println("============================");
    }

    // Método para criar pedido para Cliente Atacado
    private static void criarPedidoClienteComum(Scanner scanner, Mercado mercado) {
        try {
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o CPF do cliente: ");
            String cpf = scanner.nextLine();

            System.out.print("Digite a data da compra (XX/XX/XXXX): ");
            String data = scanner.nextLine();
            scanner.nextLine(); // Consumir a quebra de linha

            ClienteComum cliente = new ClienteComum(nome, cpf);

            System.out.print("Digite o número do pedido: ");
            int numeroPedido = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            Venda venda = new Venda(numeroPedido, cliente, data);
            adicionarProdutosAoPedido(scanner, venda);

            mercado.adicionarPedido(venda);
            System.out.println("Pedido para Cliente Atacado adicionado com sucesso!\n");

        } catch (InputMismatchException e) {
            System.out.println("Erro na criação do pedido. Certifique-se de inserir os dados corretamente.\n");
            scanner.nextLine(); // Consumir a entrada inválida
        }
    }

    // Método para criar pedido para Cliente Varejo
    private static void criarPedidoClienteFrequente(Scanner scanner, Mercado mercado) {
        try {
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o CPF do cliente: ");
            String cpf = scanner.nextLine();

            System.out.print("Aplicar Desconto de promoção? (Senão clique 0): ");
            int desconto = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            System.out.print("Digite a data da compra (XX/XX/XXXX): ");
            String data = scanner.nextLine(); // Coletando a data corretamente

            ClienteFrequente cliente = new ClienteFrequente(nome, cpf, desconto);

            System.out.print("Digite o número do pedido: ");
            int numeroPedido = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            Venda venda = new Venda(numeroPedido, cliente, data); // Use a data coletada
            adicionarProdutosAoPedido(scanner, venda);

            double valorTotal = venda.getValorTotal(); // Obtém o valor total da venda
            cliente.gerarNotaFiscal(valorTotal); // Gera a nota fiscal

            mercado.adicionarPedido(venda); // Adiciona o pedido ao mercado
            System.out.println("Pedido para Cliente Frequente adicionado com sucesso!\n");

        } catch (InputMismatchException e) {
            System.out.println("Erro na criação do pedido. Certifique-se de inserir os dados corretamente.\n");
            scanner.nextLine(); // Consumir a entrada inválida
        }
    }



    // Método para adicionar produtos ao pedido
    private static void adicionarProdutosAoPedido(Scanner scanner, Venda venda) {
        System.out.print("Quantos produtos deseja adicionar ao pedido? ");
        int quantidadeProdutos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.print("Digite o nome do produto: ");
            String nomeProduto = scanner.nextLine();

            System.out.print("Digite o preço do produto: ");
            double precoProduto = scanner.nextDouble();
            scanner.nextLine();

            Produto produto = new Produto(nomeProduto, precoProduto);
            venda.adicionarProduto(produto);
        }
    }

    private static void removerProdutosAoPedido(Scanner scanner, Venda venda) {
        System.out.print("Quantos produtos deseja remover? ");
        int quantidadeProdutos = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.print("Digite o nome do produto a ser removido: ");
            String nomeProduto = scanner.nextLine();

            Produto produtoRemover = null;
            for (Produto produto : venda.getListaProdutos()) {
                if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
                    produtoRemover = produto;
                    break;
                }
            }

            if (produtoRemover != null) {
                venda.removerProduto(produtoRemover);
                System.out.println("Produto removido com sucesso: " + nomeProduto);
            } else {
                System.out.println("Produto não encontrado: " + nomeProduto);
            }
        }
    }



    private static void gerarRelatorioPedidos(Mercado mercado) {
        mercado.gerarRelatorios();
    }
}
