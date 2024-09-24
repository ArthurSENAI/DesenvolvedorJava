package com.senai.java.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploThrows {
    public static void lerArquivo(String caminho) throws FileNotFoundException {
        File arquivo = new File (caminho);
        Scanner scanner = new Scanner(arquivo);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void main(String[] args){
        try{
            lerArquivo("arquivoInexistente.txt");
        }catch (FileNotFoundException e){
            System.out.println("ERRO ao buscar o arquivo: " + e.getMessage());
        }finally {
            System.out.println("FAZER ALGO DEPOIS DE TUDO");
        }
    }
}
