package com.senai.java.metodo;

public class ExemploMetodo {

    public void saudacao() {
        System.out.println("Ola Mundo!");
    }

    public int soma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ExemploMetodo exemplo = new ExemploMetodo();

        exemplo.saudacao();

        int resultado = exemplo.soma(2 , 5);
        System.out.println("Resultado da Soma: " + resultado);
    }
}
