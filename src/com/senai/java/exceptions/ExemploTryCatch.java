package com.senai.java.exceptions;

import javax.swing.text.Style;

public class ExemploTryCatch {
    public static void main(String[] args) {
        String palavra = "Pedro";
        int[] numeros = {1,2,3};
        try {
            System.out.println("Numero da lista: " + numeros[10]);

            for(int i = 0; i <= palavra.length(); i++){
                System.out.println("Imprimindo String por letra: " + palavra.charAt(i));
            };
        }catch(StringIndexOutOfBoundsException e) {
            System.out.print("Erro ao percorrer o indice da String: " + e.getMessage()  + " Stacktrace: " + e.getStackTrace());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Erro ao percorrer o indice da Array: " + e.getMessage());
        }
        finally {

        }

    }
}
