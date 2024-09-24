package com.senai.java.heranca;

public class Carro extends Veiculo {
    public Carro(String modelo, String marca) {
        super(modelo, marca);
    }

    public void acelerar() {
        System.out.println("O carro está acelerando");
    }
}
