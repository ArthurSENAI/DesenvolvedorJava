package com.senai.java.exceptions;

public class ExemploThrowTryCatch {
    public static int validaIdade(int idade) {
        if(idade < 18) {
            throw new IllegalArgumentException("A idade minima para votar é 18 anos. A idade é: " + idade);
        }
        return idade;
    }

    public static void main(String[] args) {
        try {
            validaIdade(17);
        }catch (IllegalArgumentException e) {
            System.out.print(e.getMessage());
        }finally {
            System.out.println("\nBloco que que sempre será executado!");
        }
    }
}
