package com.senai.java.construtor;

/*
OVERLOAD (SOBRE CARGA)
OVERLINE (SOBRE ESCRITA)
 */
public class Pessoa {
    private String Nome;
    private int Idade;

    // Construtor Padrao
    public Pessoa() {

    }

    // Construtor I
    public Pessoa(String nome, int idade) {
        this.Nome = nome;
        this.Idade = idade;
    }

    // OVERLOAD
    public Pessoa(String nome) {
        this.Nome = nome;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + Nome);
        System.out.println("Idade: " + Idade);
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25); // Chamada do construtor
        Pessoa pessoa_2 = new Pessoa("Caio");
        pessoa.mostrarInformacoes();
        pessoa_2.mostrarInformacoes();
    }
}
