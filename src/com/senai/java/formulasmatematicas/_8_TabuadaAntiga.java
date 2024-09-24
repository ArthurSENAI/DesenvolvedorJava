package com.senai.java.formulasmatematicas;

import java.util.Scanner;

public class _8_TabuadaAntiga {
    int a;
    int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        _8_TabuadaAntiga td =  new _8_TabuadaAntiga();

        int sair = 1;

        while(sair == 1){
            System.out.println("Qual numero deseja fazer a tabuada?");
            td.setA(sc.nextInt());
            System.out.println("Tabuada de quantos numeros?");
            td.setB(sc.nextInt());

            System.out.println("1 - Multiplicação");
            System.out.println("2 - Divisão");
            System.out.println("3 - Soma");
            System.out.println("4 - Subtração");

            System.out.println("Escolha o tipo de tabuada?");
            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    multiplicacao(td.getA(), td.getB());
                    break;
                case 2:
                    divisao(td.getA(), td.getB());
                    break;
                case 3:
                    soma(td.getA(), td.getB());
                    break;
                case 4:
                    subtracao(td.getA(), td.getB());
                    break;
                default:
                    System.out.println("Numero Invalido");
                    return;
            }

            System.out.println("1 - Continuar ");
            System.out.println("2 - Sair ");
            sair = sc.nextInt();

        }


    }

    public static void multiplicacao(int a, int b) {
        for(int i = 1; i <= b; i++) {
            System.out.println( a + " x " + i + " = " + (a*i));
        }
    }

    public static void divisao(int a, int b) {
        for(int i = 1; i <= b; i++) {
            System.out.println( a + " / " + i + " = " + (a/i));
        }
    }

    public static void soma(int a, int b) {
        for(int i = 1; i <= b; i++) {
            System.out.println( a + " + " + i + " = " + (a+i));
        }
    }

    public static void subtracao(int a, int b) {
        for(int i = 1; i <= b; i++) {
            System.out.println( a + " - " + i + " = " + (a-i));
        }
    }
}
