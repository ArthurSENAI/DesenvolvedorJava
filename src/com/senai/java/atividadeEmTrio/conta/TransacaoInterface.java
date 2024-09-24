package com.senai.java.atividadeEmTrio.conta;

// TransacaoInterface.java
public interface TransacaoInterface {
    void realizarDeposito(double valor);
    boolean realizarSaque(double valor);
    boolean realizarTransferencia(double valor, Conta destino);
}


