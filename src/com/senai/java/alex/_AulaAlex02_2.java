// utilização de laço de repetição

package com.senai.java.alex;

import java.util.Scanner;

public class _AulaAlex02_2 {
    public static void main(String[] args) {

        // instancia de classe Scanner
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        int n;

        // entrada de dados
        System.out.println("Informe um número inteiro positivo: ");
        n = sc.nextInt();

        // laço de repetição
        while (n >= 0) {
            System.out.println(n);
            n--;
        }
    }

}
