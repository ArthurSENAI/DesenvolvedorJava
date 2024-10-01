package com.senai.java.provaMercado;

import java.util.ArrayList;
import java.util.List;

public class RelatorioClienteComum extends RelatorioVenda{
    private ClienteComum cliente;
    private Venda venda;

    public RelatorioClienteComum(ClienteComum cliente, Venda venda) {
        this.cliente = cliente;
        this.venda = venda;
    }


    @Override
    public void gerarRelatorio() {
        System.out.println("===== Relatório Cliente Varejo =====");
        System.out.println("Titular: "+ cliente.getNome());
        System.out.println("CPF: " +  cliente.getCPF());
        System.out.printf("Valor Total: %.2f%n", venda.getValorTotal());
        System.out.println("Lista de compras:");
        for (Produto produto : venda.getListaProdutos()) {
            System.out.println(produto);
        }
        System.out.println("=====================================\n");
    }
}
