package com.senai.java.atividadeEmTrio.conta;

// Conta.java
import java.util.ArrayList;
import java.util.List;


public abstract class Conta implements TransacaoInterface {
    // Atributos privados
    private String titular;
    protected double saldo;
    private int numeroConta;
    private List<Transacao> historicoTransacoes;

    // Construtor para inicializar a conta
    public Conta(String titular, int numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.historicoTransacoes = new ArrayList<>();
    }

    // Getter para o titular
    public String getTitular() {
        return titular;
    }

    // Setter para o titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Getter para o saldo
    public double getSaldo() {
        return saldo;
    }

    // Getter para o número da conta
    public int getNumeroConta() {
        return numeroConta;
    }

    // Getter para o histórico de transações
    public List<Transacao> getHistoricoTransacoes() {
        return historicoTransacoes;
    }

    // Implementação do método realizarDeposito
    @Override
    public void realizarDeposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            Transacao transacao = new Transacao("Depósito", valor, "Depósito na conta");
            historicoTransacoes.add(transacao);
            System.out.printf("Depósito de %.2f realizado com sucesso!%n", valor);
        } else {
            System.out.println("O valor de depósito deve ser positivo.");
        }
    }

    // Implementação do método realizarTransferencia
    @Override
    public boolean realizarTransferencia(double valor, Conta destino) {
        if (this.realizarSaque(valor)) {
            destino.realizarDeposito(valor);
            Transacao transacao = new Transacao("Transferência", valor, "Transferência para a conta " + destino.getNumeroConta());
            historicoTransacoes.add(transacao);
            System.out.printf("Transferência de %.2f para a conta %d realizada com sucesso!%n", valor, destino.getNumeroConta());
            return true;
        } else {
            System.out.println("Transferência falhou devido a saldo insuficiente.");
            return false;
        }
    }

    // Método abstrato para realizar saque, que deve ser implementado pelas subclasses
    @Override
    public abstract boolean realizarSaque(double valor);

    public void aplicarRendimento() {
    }
}


