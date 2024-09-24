// sem utilização do Scanner

package com.senai.java.alex;


public class _AulaAlex02 {
    public static void main(String[] args) {

        // instancia a classe
        Pessoa_Aula02 usuario = new Pessoa_Aula02();

        // setando os valores
        usuario.setNome("Neo");
        usuario.setEmail("neo@gmail.com");
        usuario.setIdade(35);

        // saída de dados
        System.out.println("Nome do usuário: " + usuario.getNome());
        System.out.println("E-mail do usuário: " + usuario.getEmail());
        System.out.println("Idade do usuário: " + usuario.getIdade());
    }
}
