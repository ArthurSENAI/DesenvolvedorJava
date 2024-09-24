package com.senai.java.encapsulamento;

public class Carro {
    private String modelo;
    private int ano;
    // Getter para o atributo modelo
    public String getModelo() {
        return modelo;
    }
    // Setter para o atributo modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    // Getter para o atributo ano
    public int getAno() {
        return ano;
    }
    // Setter para o atributo ano
    public void setAno(int ano) {
        if (ano > 1885) { // Verifica se o ano é válido
            this.ano = ano;
        }
    }
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setModelo("Fusca");
        carro.setAno(1969);

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
    }
}