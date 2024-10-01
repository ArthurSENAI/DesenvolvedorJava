package com.senai.java.desafioVarejo;

import com.senai.java.desafioVarejo.cliente.Cliente;
import com.senai.java.desafioVarejo.produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private Cliente cliente;
    private List<Produto> listaProdutos;
    private double valorTotal;

    //Construtor
    public Pedido (int numeroPedido, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.listaProdutos = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    //Getter e Setter
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getListaProdutos() {
        return new ArrayList<>(listaProdutos);
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    //Metodos
    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
        valorTotal += produto.getPreco();
    }

    public void removerProduto(Produto produto) {
        listaProdutos.remove(produto);
        valorTotal -= produto.getPreco();
    }


}
