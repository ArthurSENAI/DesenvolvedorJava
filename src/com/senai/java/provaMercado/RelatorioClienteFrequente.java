package com.senai.java.provaMercado;


public class RelatorioClienteFrequente extends RelatorioVenda{
    private ClienteFrequente cliente;
    private Venda venda;
    private final double descontoAplicado = cliente.calcularDesconto(venda.getValorTotal());
    private final double frete = cliente.calcularFrete(venda.getValorTotal());
    private final double valorFinal = venda.getValorTotal() - descontoAplicado + frete;

    public RelatorioClienteFrequente(ClienteFrequente cliente, Venda venda) {
        this.cliente = cliente;
        this.venda = venda;
    }


    @Override
    public void gerarRelatorio() {
        System.out.println("===== Relatório Cliente Varejo =====");
        System.out.println("Titular: "+ cliente.getNome());
        System.out.println("CPF: " +  cliente.getCPF());
        System.out.println("Desconto: " + cliente.getDesconto());
        System.out.printf("Valor Total: %.2f%n", valorFinal);
        System.out.println("Lista de compras:");
        for (Produto produto : venda.getListaProdutos()) {
            System.out.println(produto);
        }
        System.out.println("=====================================\n");
    }
}
