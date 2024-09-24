package com.senai.java.estatico;

public class Contador {
    private static int count = 0; // Variável estática
    public static void incrementar() {
        count++;
    }
    public static void mostrarCount() {
        System.out.println("Contador: " + count);
    }
    public static void main(String[] args) {
        Contador.incrementar();
        Contador.mostrarCount();
        Contador.incrementar();
        Contador.mostrarCount();
    }
}
