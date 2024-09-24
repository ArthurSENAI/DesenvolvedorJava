package com.senai.java.heranca;

public class Moto extends Veiculo{
    public Moto(String modelo, String marca) {
        super(modelo, marca);
    }

    public void Acelerar() {
        System.out.println("A moto está acelerando");
    }
}
