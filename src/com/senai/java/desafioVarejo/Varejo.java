package com.senai.java.desafioVarejo;

import com.senai.java.desafioVarejo.cliente.ClienteAtacado;
import com.senai.java.desafioVarejo.cliente.ClienteVarejo;
import com.senai.java.desafioVarejo.relatorio.RelatorioClienteAtacado;
import com.senai.java.desafioVarejo.relatorio.RelatorioClienteVarejo;

import java.util.ArrayList;
import java.util.List;

public class Varejo {
    private List<Pedido> pedidos;

    public Varejo() {
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void gerarRelatorios() {
        for (Pedido pedido : pedidos) {
            if (pedido.getCliente() instanceof ClienteAtacado) {
                RelatorioClienteAtacado relatorioAtacado = new RelatorioClienteAtacado((ClienteAtacado) pedido.getCliente(), pedido);
                relatorioAtacado.gerarRelatorio();
            } else if (pedido.getCliente() instanceof ClienteVarejo) {
                RelatorioClienteVarejo relatorioVarejo = new RelatorioClienteVarejo((ClienteVarejo) pedido.getCliente(), pedido);
                relatorioVarejo.gerarRelatorio();
            }
        }
    }
}
