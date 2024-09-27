package com.senai.java.desafioFintech.conta;

// ContaPoupanca.java
public class ContaPoupanca extends Conta {
    // Atributo para a taxa de rendimento mensal (em percentual)
    private double taxaRendimento;

    // Construtor
    public ContaPoupanca(String titular, int numeroConta, double taxaRendimento, double saldoInicial) {
        super(titular, numeroConta, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    // Getter para a taxa de rendimento
    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    // Setter para a taxa de rendimento
    public void setTaxaRendimento(double taxaRendimento) {
        if (taxaRendimento >= 0) {
            this.taxaRendimento = taxaRendimento;
        } else {
            System.out.println("A taxa de rendimento deve ser não negativa.");
        }
    }

    // Implementação do método realizarSaque com regras específicas (sem cheque especial)
    @Override
    public boolean realizarSaque(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            Transacao transacao = new Transacao("Saque", valor, "Saque da conta");
            getHistoricoTransacoes().add(transacao);
            System.out.printf("Saque de %.2f realizado com sucesso! Saldo atual: %.2f%n", valor, saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
            return false;
        }
    }

    // Método para aplicar o rendimento mensal
    public void aplicarRendimento() {
        if (saldo > 0) {
            double rendimento = saldo * (taxaRendimento / 100);
            saldo += rendimento;
            Transacao transacao = new Transacao("Rendimento", rendimento, "Rendimento mensal");
            getHistoricoTransacoes().add(transacao);
            System.out.printf("Rendimento de %.2f aplicado. Saldo atual: %.2f%n", rendimento, saldo);
        } else {
            System.out.println("Não há saldo para aplicar rendimento.");
        }
    }
}


