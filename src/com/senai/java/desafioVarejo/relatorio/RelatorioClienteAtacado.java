package com.senai.java.desafioVarejo.relatorio;

import com.senai.java.desafioVarejo.Pedido;
import com.senai.java.desafioVarejo.produto.Produto;
import com.senai.java.desafioVarejo.cliente.ClienteAtacado;

public class RelatorioClienteAtacado extends RelatorioPedido {
    private ClienteAtacado cliente;
    private Pedido pedido;

    public RelatorioClienteAtacado(ClienteAtacado cliente, Pedido pedido) {
        this.cliente = cliente;
        this.pedido = pedido;
    }


    @Override
    public void gerarRelatorio() {
        System.out.println("===== Relatório Cliente Atacado =====");
        System.out.println("Titular: "+ cliente.getNome());
        System.out.println("CPF: " +  cliente.getCPF());
        System.out.println("Desconto: " + cliente.getDesconto());
        System.out.printf("Valor Total: %.2f%n", pedido.getValorTotal());
        System.out.println("Lista de compras:");
        for (Produto produto : pedido.getListaProdutos()) {
            System.out.println(produto);
        }
        System.out.println("=====================================\n");
    }

}
