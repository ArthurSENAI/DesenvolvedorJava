package com.senai.java.desafioFintech.conta;

// Transacao.java
import java.util.Date;

public class Transacao {
    private Date data;
    private String tipo; // "Depósito", "Saque", "Transferência", "Rendimento"
    private double valor;
    private String descricao;

    public Transacao(String tipo, double valor, String descricao) {
        this.data = new Date(); // Data e hora atuais
        this.tipo = tipo;
        this.valor = valor;
        this.descricao = descricao;
    }

    // Getters
    public Date getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    // Método para exibir a transação
    @Override
    public String toString() {
        return String.format("[%tF %<tT] %s: %.2f - %s", data, tipo, valor, descricao);
    }
}


