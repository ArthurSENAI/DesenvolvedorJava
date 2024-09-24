package com.senai.java.formulasmatematicas;

public class _8_Tabuada {
    private int a;
    private int b;

    // Construtor
    public _8_Tabuada(int a, int b) {
        this.a = a;
        this.b = b;
    }

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

    public void multiplicacao() {
        for(int i = 1; i <= b; i++) {
            System.out.println( a + " x " + i + " = " + (a*i));
        }
    }

    public void divisao() {
        for(int i = 1; i <= b; i++) {
            System.out.println( a + " / " + i + " = " + (a/i));
        }
    }

    public void soma() {
        for(int i = 1; i <= b; i++) {
            System.out.println( a + " + " + i + " = " + (a+i));
        }
    }

    public void subtracao() {
        for(int i = 1; i <= b; i++) {
            System.out.println( a + " - " + i + " = " + (a-i));
        }
    }
}
