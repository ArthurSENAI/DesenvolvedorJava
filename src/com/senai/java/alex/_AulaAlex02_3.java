// utilização de laço de repetição

package com.senai.java.alex;

import java.util.Scanner;

public class _AulaAlex02_3 {
    public static void main(String[] args) {

        // instancia de classe Scanner
        Scanner sc = new Scanner(System.in);
        Pessoa_Aula02_1 usuario = new Pessoa_Aula02_1();

         // declaração de variável
         int sair;
         double imc;

        // laço de repetição
        do {
            // entrada de dados
            System.out.println("Informe o nome do usuário: ");
            usuario.setNome(sc.nextLine());
            System.out.println("Informe o peso em Kg do usuário: ");
            usuario.setPeso(sc.nextDouble());
            System.out.println("Informe a altura em metros do usuário: ");
            usuario.setAltura(sc.nextDouble());

            // cálculo do imc
            imc = usuario.getPeso() / (usuario.getAltura() * usuario.getAltura());

            // exibe o imc
            System.out.println("IMC do usuário: " + String.format("%.2f", imc));

            // pergunta ao usuário se deseja continuar
            System.out.println("Deseja sair?");
            System.out.println("1 - Continuar");
            System.out.println("2 - Sair");
            sair = sc.nextInt();

            // limpeza de buffer
            sc.nextLine();

        } while (sair == 1);
    }
}
