package com.senai.java.desafioFintech.relatorio;

import com.senai.java.desafioFintech.conta.ContaCorrente;
import com.senai.java.desafioFintech.conta.Transacao;

// RelatorioContaCorrente.java
public class RelatorioContaCorrente extends RelatorioFinanceiro {
    private ContaCorrente conta;

    // Construtor que recebe uma instância de ContaCorrente
    public RelatorioContaCorrente(ContaCorrente conta) {
        this.conta = conta;
    }

    // Implementação do método gerarRelatorio
    @Override
    public void gerarRelatorio() {
        System.out.println("===== Relatório Conta Corrente =====");
        System.out.printf("Titular: %s%n", conta.getTitular());
        System.out.printf("Número da Conta: %d%n", conta.getNumeroConta());
        System.out.printf("Saldo Atual: %.2f%n", conta.getSaldo());
        System.out.printf("Limite Cheque Especial: %.2f%n", conta.getLimiteChequeEspecial());
        System.out.println("Histórico de Transações:");
        for (Transacao transacao : conta.getHistoricoTransacoes()) {
            System.out.println(transacao);
        }
        System.out.println("=====================================\n");
    }
}

