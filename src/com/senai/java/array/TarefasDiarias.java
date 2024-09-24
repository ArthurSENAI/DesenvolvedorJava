package com.senai.java.array;

import java.util.Scanner;

/*
Desenvolva um programa que permita a um usuário controlar suas tarefas diárias. O sistema deve permitir ao usuário adicionar até 10 tarefas,
visualizar todas as tarefas e marcar as tarefas como concluídas.
Requisitos:
                Armazene as tarefas em um array de Strings.
                Use um loop for para exibir todas as tarefas.
                Utilize switch para definir opções de menu: 1 - Adicionar tarefa, 2 - Exibir tarefas, 3 - Marcar tarefa como concluída.
 */

public class TarefasDiarias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tarefas = new String[10];
        boolean[] concluido = new boolean[10];
        int numTarefas = 0;
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Exibir tarefas");
            System.out.println("3 - Marcar tarefa como concluída");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha deixada pelo nextInt()

            switch (opcao) {
                case 1:
                    if (numTarefas < 10) {
                        System.out.print("Digite a tarefa: ");
                        String tarefa = sc.nextLine();
                        tarefas[numTarefas] = tarefa;
                        concluido[numTarefas] = false;
                        numTarefas++;
                        System.out.println("Tarefa adicionada com sucesso!");
                    } else {
                        System.out.println("Não é possível adicionar mais tarefas. O limite de 10 tarefas foi alcançado.");
                    }
                    break;

                case 2:
                    System.out.println("\nLista de Tarefas:");
                    for (int i = 0; i < numTarefas; i++) {
                        String status = concluido[i] ? "[Concluída]" : "[Pendente]";
                        System.out.println((i + 1) + ". " + tarefas[i] + " " + status);
                    }
                    break;

                case 3:
                    System.out.println("\nDigite o número da tarefa para marcar como concluída:");
                    for (int i = 0; i < numTarefas; i++) {
                        String status = concluido[i] ? "[Concluída]" : "[Pendente]";
                        System.out.println((i + 1) + ". " + tarefas[i] + " " + status);
                    }
                    int tarefaNumero = sc.nextInt();
                    sc.nextLine(); // Consumir a nova linha deixada pelo nextInt()
                    if (tarefaNumero >= 1 && tarefaNumero <= numTarefas) {
                        concluido[tarefaNumero - 1] = true;
                        System.out.println("Tarefa marcada como concluída.");
                    } else {
                        System.out.println("Número da tarefa inválido.");
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
