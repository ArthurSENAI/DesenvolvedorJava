package com.senai.java.atividadeEmTrio.conta;

// ContaCorrente.java
public class ContaCorrente extends Conta {
    // Atributo específico para o limite de cheque especial
    private double limiteChequeEspecial;

    // Construtor
    public ContaCorrente(String titular, int numeroConta, double limiteChequeEspecial, double saldoInicial) {
        super(titular, numeroConta, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    // Getter para o limite de cheque especial
    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    // Setter para o limite de cheque especial
    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        if (limiteChequeEspecial >= 0) {
            this.limiteChequeEspecial = limiteChequeEspecial;
        } else {
            System.out.println("O limite de cheque especial deve ser não negativo.");
        }
    }

    // Implementação do método realizarSaque com regras específicas
    @Override
    public boolean realizarSaque(double valor) {
        if (valor > 0 && (saldo + limiteChequeEspecial) >= valor) {
            saldo -= valor;
            Transacao transacao = new Transacao("Saque", valor, "Saque da conta");
            getHistoricoTransacoes().add(transacao);
            System.out.printf("Saque de %.2f realizado com sucesso! Saldo atual: %.2f%n", valor, saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente e limite de cheque especial excedido.");
            return false;
        }
    }
}


