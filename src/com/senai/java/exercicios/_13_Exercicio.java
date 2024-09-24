package com.senai.java.exercicios;

import java.util.Scanner;

public class _13_Exercicio {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números deseja informar?");
        int quant = scanner.nextInt();

        if (quant <= 0) {
            System.out.println("A quantidade deve ser maior que zero.");
            scanner.close();
            return;
        }

        int[] num = new int[quant];
        int[] ant = new int[quant];
        boolean todosIguais = true;
        int soma = 0;
        int maior = 0;
        int somaDiferentes = 0;

        // Leitura dos números
        for (int i = 0; i < quant; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            num[i] = scanner.nextInt();

            // Verifica se todos os números são iguais
            if (i > 0 && num[i] != num[0]) {
                todosIguais = false;
            }

            // Calcula a soma e o maior número
            soma += num[i];
            if (num[i] > maior) {
                maior = num[i];
            }

            // Preenche o array ant com os números lidos
            ant[i] = num[i];
        }

        if (todosIguais) {
            System.out.println("Todos os números são iguais.");
            System.out.println("Quantidade de números: " + quant);
            System.out.println("Soma dos números: " + soma);
        } else {
            // Calcula a soma dos números diferentes
            for (int i = 0; i < quant; i++) {
                boolean diferente = true;
                for (int j = 0; j < quant; j++) {
                    if (i != j && ant[i] == ant[j]) {
                        diferente = false;
                        break;
                    }
                }
                if (diferente) {
                    somaDiferentes += ant[i];
                }
            }

            System.out.println("O maior número foi: " + maior);
            System.out.println("Soma dos números diferentes: " + somaDiferentes);
        }

        scanner.close();
    }
}
