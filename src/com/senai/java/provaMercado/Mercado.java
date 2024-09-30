package com.senai.java.provaMercado;


import java.util.ArrayList;
import java.util.List;

public class Mercado {
    private List<Venda> vendas;

    public Mercado() {
        this.vendas = new ArrayList<>();
    }

    public void adicionarPedido(Venda venda) {
        vendas.add(venda);
    }

    public void gerarRelatorios() {
        for (Venda venda : vendas) {
            if (venda.getCliente() instanceof ClienteComum) {
                RelatorioClienteComum relatorioComum = new RelatorioClienteComum((ClienteComum) venda.getCliente(), venda);
                relatorioComum.gerarRelatorio();
            } else if (venda.getCliente() instanceof ClienteFrequente) {
                RelatorioClienteFrequente relatorioFrequente= new RelatorioClienteFrequente((ClienteFrequente) venda.getCliente(), venda);
                relatorioFrequente.gerarRelatorio();
            }
        }
    }
}