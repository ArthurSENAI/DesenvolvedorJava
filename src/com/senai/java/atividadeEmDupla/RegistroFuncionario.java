package com.senai.java.atividadeEmDupla;

import java.util.Scanner;

public class RegistroFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista de funcionários
        Funcionario[] funcionarios = new Funcionario[10];
        int index = 0;

        while (true) {
            System.out.println("1 - Registrar novo funcionário");
            System.out.println("2 - Exibir total de funcionários cadastrados");
            System.out.println("3 - Exibir todos os funcionários");
            System.out.println("4 - Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    // Registrar novo funcionário
                    if (index >= funcionarios.length) {
                        System.out.println("Número máximo de funcionários atingido.");
                        break;
                    }

                    System.out.println("Digite o nome do funcionário:");
                    String nome = scanner.nextLine();

                    System.out.println("Digite o cargo do funcionário:");
                    String cargo = scanner.nextLine();

                    System.out.println("Digite o salário do funcionário:");
                    double salario = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a nova linha

                    // Cria um novo objeto Funcionario e armazena no array
                    funcionarios[index] = new Funcionario(nome, cargo, salario);
                    index++;
                    System.out.println("Funcionário registrado com sucesso!");
                    break;

                case 2:
                    // Exibir total de funcionários cadastrados
                    System.out.println("Total de funcionários cadastrados: " + index);
                    break;

                case 3:
                    // Listar os funcionários
                    if (index == 0) {
                        System.out.println("Nenhum funcionário cadastrado.");
                    } else {
                        for (int i = 0; i < index; i++) {
                            System.out.println("Nome: " + funcionarios[i].getName());
                            System.out.println("Cargo: " + funcionarios[i].getCargo());
                            System.out.println("Salário: " + funcionarios[i].getSalario() + "\n");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return; // Termina o loop e sai do programa

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}


