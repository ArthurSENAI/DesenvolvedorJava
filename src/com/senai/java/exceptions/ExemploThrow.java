package com.senai.java.exceptions;

public class ExemploThrow {
    public static int retornaIdade(){
        return 17;
    }
    public static void main (String[] args){
        if (retornaIdade() < 18){
            throw new IllegalArgumentException("Somente pessoas maiores de 18 podem votar");
        }
    }
}
