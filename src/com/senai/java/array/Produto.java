package com.senai.java.array;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    //Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //Métodos para aumentar e diminuir a quantidade
    public void aumentarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void diminuirQuantidade(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente para diminuir.");
        }
    }


    public double calcularValorTotal() {
        return preco * quantidade;
    }

    public String ExibirInfo() {
        return "Nome: " + nome + ", Preço: R$" + preco + ", Quantidade: " + quantidade + ", Valor Total: R$" + calcularValorTotal();
    }
}
