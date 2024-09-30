package com.senai.java.provaMercado;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int numeroVenda;
    private Cliente cliente;
    private List<Produto> listaProdutos;
    private double valorTotal;
    private String dataVenda;

    //Construtor
    public Venda (int numeroVenda, Cliente cliente, String dataVenda) {
        this.numeroVenda = numeroVenda;
        this.cliente = cliente;
        this.listaProdutos = new ArrayList<>();
        this.valorTotal = 0.0;
        this.dataVenda = dataVenda;
    }

    //Getter e Setter
    public int getnumeroVenda() {
        return numeroVenda;
    }

    public void setnumeroVenda(int numeroVenda) {
        this.numeroVenda = numeroVenda;
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

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
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