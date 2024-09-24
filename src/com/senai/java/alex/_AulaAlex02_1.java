// utilizando o Scanner

package com.senai.java.alex;


import java.util.Scanner;

public class _AulaAlex02_1 {
    public static void main(String[] args) {

        // instancia a classe
        Pessoa_Aula02 usuario = new Pessoa_Aula02();
        Scanner sc = new Scanner(System.in);

        // setando os valores
        System.out.println("Informe o nome: ");
        usuario.setNome(sc.nextLine());
        System.out.println("Informe o e-mail: ");
        usuario.setEmail(sc.nextLine());
        System.out.println("Informe a idade: ");
        usuario.setIdade(sc.nextInt());

        // saída de dados
        System.out.println("Nome do usuário: " + usuario.getNome());
        System.out.println("E-mail do usuário: " + usuario.getEmail());
        System.out.println("Idade do usuário: " + usuario.getIdade());
    }
}
