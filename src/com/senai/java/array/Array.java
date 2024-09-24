package com.senai.java.array;

public class Array {
    public static void main(String[] args) {

        String[] marcas = {"Toyota","Honda","Nissan","Mercedes"};
        //[0],[1],[2],[3]

        for (int i = 0; i < marcas.length; i++){
            System.out.println("A marca do carro é: " + marcas[i]);
        }

        System.out.println();
        for (int i = marcas.length - 1; i >= 0; i--){
            System.out.println("A marca do carro é: " + marcas[i]);
        }

        System.out.println();
        for (String marca : marcas){
            System.out.println("A marca do carro é: " + marca);

        }

    }
}
