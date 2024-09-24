package com.senai.java.atividadeEmTrio.relatorio;

import com.senai.java.atividadeEmTrio.conta.ContaPoupanca;
import com.senai.java.atividadeEmTrio.conta.Transacao;

// RelatorioContaPoupanca.java
public class RelatorioContaPoupanca extends RelatorioFinanceiro {
    private ContaPoupanca conta;

    // Construtor que recebe uma instância de ContaPoupanca
    public RelatorioContaPoupanca(ContaPoupanca conta) {
        this.conta = conta;
    }

    // Implementação do método gerarRelatorio
    @Override
    public void gerarRelatorio() {
        System.out.println("===== Relatório Conta Poupança =====");
        System.out.printf("Titular: %s%n", conta.getTitular());
        System.out.printf("Número da Conta: %d%n", conta.getNumeroConta());
        System.out.printf("Saldo Atual: %.2f%n", conta.getSaldo());
        System.out.printf("Taxa de Rendimento: %.2f%%%n", conta.getTaxaRendimento());
        System.out.println("Histórico de Transações:");
        for (Transacao transacao : conta.getHistoricoTransacoes()) {
            System.out.println(transacao);
        }
        System.out.println("=====================================\n");
    }
}


