package com.senai.java.desafioVarejo;

import com.senai.java.desafioFintech.conta.Transacao;

public class ClienteAtacado extends Cliente implements Processamento {
    private double desconto;

    public ClienteAtacado(String nome, int CPF, double desconto) {
        super(nome, CPF);
        this.desconto = desconto;
    }

    // Getter para o limite de cheque especial
    public double getDesconto() {
        return desconto;
    }

    // Setter para o limite de cheque especial
    public void aplicarDesconto(double valor) {
        double valorDesconto = valor - (valor * desconto / 100);
        System.out.println("Valor com desconto: R$ " + valorDesconto);
    }


    @Override
    public double calcularDesconto(double valorTotal) {
        if(valorTotal > 1000) {
            return valorTotal* (desconto / 100);
        }
        return 0;
    }

    @Override
    public double calcularFrete(double valorTotal) {
        return valorTotal * 0.05;
    }

    @Override
    public void gerarNotaFiscal(double valorTotal) {
        double descontoAplicado = calcularDesconto(valorTotal);
        double valorFinal = valorTotal - descontoAplicado;
        System.out.println("-----------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("Valor total: " + valorTotal);
        System.out.println("Desconto: " + descontoAplicado);
        System.out.println("Valor Final: " + valorFinal);
        System.out.println("Frete: " + calcularFrete(valorTotal));
        System.out.println("-----------------------");
    }
}
