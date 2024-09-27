package com.senai.java.desafioFintech;

// Programa.java
import com.senai.java.desafioFintech.conta.Conta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        int opcao;

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha

                switch (opcao) {
                    case 1:
                        criarContaCorrente(scanner, banco);
                        break;
                    case 2:
                        criarContaPoupanca(scanner, banco);
                        break;
                    case 3:
                        realizarDeposito(scanner, banco);
                        break;
                    case 4:
                        realizarSaque(scanner, banco);
                        break;
                    case 5:
                        realizarTransferencia(scanner, banco);
                        break;
                    case 6:
                        banco.gerarRelatorios();
                        break;
                    case 7:
                        banco.aplicarRendimentos();
                        break;
                    case 8:
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
        } while (opcao != 8);

        scanner.close();
    }

    // Método para exibir o menu de opções
    private static void exibirMenu() {
        System.out.println("===== Sistema Bancário =====");
        System.out.println("1. Criar Conta Corrente");
        System.out.println("2. Criar Conta Poupança");
        System.out.println("3. Realizar Depósito");
        System.out.println("4. Realizar Saque");
        System.out.println("5. Realizar Transferência");
        System.out.println("6. Gerar Relatórios");
        System.out.println("7. Aplicar Rendimentos Mensais");
        System.out.println("8. Sair");
        System.out.println("============================");
    }

    // Método para criar uma Conta Corrente
    private static void criarContaCorrente(Scanner scanner, Banco banco) {
        try {
            System.out.print("Digite o nome do titular: ");
            String titular = scanner.nextLine();

            System.out.print("Digite o número da conta: ");
            int numeroConta = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            System.out.print("Digite o limite de cheque especial: ");
            double limite = scanner.nextDouble();

            System.out.print("Digite o saldo inicial: ");
            double saldoInicial = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha

            banco.criarContaCorrente(titular, numeroConta, limite, saldoInicial);
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Erro na criação da Conta Corrente. Certifique-se de inserir os dados corretamente.\n");
            scanner.nextLine(); // Consumir a entrada inválida
        }
    }

    // Método para criar uma Conta Poupança
    private static void criarContaPoupanca(Scanner scanner, Banco banco) {
        try {
            System.out.print("Digite o nome do titular: ");
            String titular = scanner.nextLine();

            System.out.print("Digite o número da conta: ");
            int numeroConta = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            System.out.print("Digite a taxa de rendimento mensal (%): ");
            double taxa = scanner.nextDouble();

            System.out.print("Digite o saldo inicial: ");
            double saldoInicial = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha

            banco.criarContaPoupanca(titular, numeroConta, taxa, saldoInicial);
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Erro na criação da Conta Poupança. Certifique-se de inserir os dados corretamente.\n");
            scanner.nextLine(); // Consumir a entrada inválida
        }
    }

    // Método para realizar um depósito
    private static void realizarDeposito(Scanner scanner, Banco banco) {
        try {
            System.out.print("Digite o número da conta para depósito: ");
            int numeroConta = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            Conta conta = banco.getConta(numeroConta);
            if (conta == null) {
                System.out.println("Conta não encontrada.\n");
                return;
            }

            System.out.print("Digite o valor do depósito: ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha

            conta.realizarDeposito(valor);
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Erro no depósito. Certifique-se de inserir os dados corretamente.\n");
            scanner.nextLine(); // Consumir a entrada inválida
        }
    }

    // Método para realizar um saque
    private static void realizarSaque(Scanner scanner, Banco banco) {
        try {
            System.out.print("Digite o número da conta para saque: ");
            int numeroConta = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            Conta conta = banco.getConta(numeroConta);
            if (conta == null) {
                System.out.println("Conta não encontrada.\n");
                return;
            }

            System.out.print("Digite o valor do saque: ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha

            conta.realizarSaque(valor);
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Erro no saque. Certifique-se de inserir os dados corretamente.\n");
            scanner.nextLine(); // Consumir a entrada inválida
        }
    }

    // Método para realizar uma transferência
    private static void realizarTransferencia(Scanner scanner, Banco banco) {
        try {
            System.out.print("Digite o número da conta de origem: ");
            int numeroOrigem = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            Conta contaOrigem = banco.getConta(numeroOrigem);
            if (contaOrigem == null) {
                System.out.println("Conta de origem não encontrada.\n");
                return;
            }

            System.out.print("Digite o número da conta de destino: ");
            int numeroDestino = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            Conta contaDestino = banco.getConta(numeroDestino);
            if (contaDestino == null) {
                System.out.println("Conta de destino não encontrada.\n");
                return;
            }

            System.out.print("Digite o valor da transferência: ");
            double valor = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha

            contaOrigem.realizarTransferencia(valor, contaDestino);
            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Erro na transferência. Certifique-se de inserir os dados corretamente.\n");
            scanner.nextLine(); // Consumir a entrada inválida
        }
    }
}


