package com.senai.java.desafioFintech;

// Banco.java
import com.senai.java.desafioFintech.conta.Conta;
import com.senai.java.desafioFintech.conta.ContaCorrente;
import com.senai.java.desafioFintech.conta.ContaPoupanca;
import com.senai.java.desafioFintech.relatorio.RelatorioContaCorrente;
import com.senai.java.desafioFintech.relatorio.RelatorioContaPoupanca;
import com.senai.java.desafioFintech.relatorio.RelatorioFinanceiro;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<Integer, Conta> contas;

    public Banco() {
        this.contas = new HashMap<>();
    }

    // Método para criar uma conta corrente
    public void criarContaCorrente(String titular, int numeroConta, double limiteChequeEspecial, double saldoInicial) {
        if (contas.containsKey(numeroConta)) {
            System.out.println("Erro: Número de conta já existe.");
        } else {
            ContaCorrente cc = new ContaCorrente(titular, numeroConta, limiteChequeEspecial, saldoInicial);
            contas.put(numeroConta, cc);
            System.out.printf("Conta Corrente criada: %s, Número: %d, Saldo Inicial: %.2f, Limite: %.2f%n",
                    titular, numeroConta, saldoInicial, limiteChequeEspecial);
        }
    }

    // Método para criar uma conta poupança
    public void criarContaPoupanca(String titular, int numeroConta, double taxaRendimento, double saldoInicial) {
        if (contas.containsKey(numeroConta)) {
            System.out.println("Erro: Número de conta já existe.");
        } else {
            ContaPoupanca cp = new ContaPoupanca(titular, numeroConta, taxaRendimento, saldoInicial);
            contas.put(numeroConta, cp);
            System.out.printf("Conta Poupança criada: %s, Número: %d, Saldo Inicial: %.2f, Taxa de Rendimento: %.2f%%%n",
                    titular, numeroConta, saldoInicial, taxaRendimento);
        }
    }

    // Método para obter uma conta pelo número
    public Conta getConta(int numeroConta) {
        return contas.get(numeroConta);
    }

    // Método para aplicar rendimentos a todas as contas poupança
    public void aplicarRendimentos() {
        for (Conta conta : contas.values()) {
            if (conta instanceof ContaPoupanca) {
                ((ContaPoupanca) conta).aplicarRendimento();
            }
        }
    }

    // Método para gerar relatórios para todas as contas
    public void gerarRelatorios() {
        for (Conta conta : contas.values()) {
            if (conta instanceof ContaCorrente) {
                RelatorioFinanceiro relatorioCC = new RelatorioContaCorrente((ContaCorrente) conta);
                relatorioCC.gerarRelatorio();
            } else if (conta instanceof ContaPoupanca) {
                RelatorioFinanceiro relatorioCP = new RelatorioContaPoupanca((ContaPoupanca) conta);
                relatorioCP.gerarRelatorio();
            }
        }
    }

    // Método para listar todas as contas
    public void listarContas() {
        System.out.println("===== Lista de Contas =====");
        for (Conta conta : contas.values()) {
            System.out.printf("Titular: %s, Número: %d, Saldo: %.2f%n",
                    conta.getTitular(), conta.getNumeroConta(), conta.getSaldo());
        }
        System.out.println("==========================\n");
    }
}


