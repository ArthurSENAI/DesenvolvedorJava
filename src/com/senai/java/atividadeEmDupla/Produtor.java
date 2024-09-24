package com.senai.java.atividadeEmDupla;

import java.util.List;
import java.util.ArrayList;

public class Produtor {
    private String nome;
    private String nomeFazenda;
    private List<Grao> graosProduzidos;

    // Construtor
    public Produtor(String nome, String nomeFazenda) {
        this.nome = nome;
        this.nomeFazenda = nomeFazenda;
        this.graosProduzidos = new ArrayList<>();
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeFazenda() {
        return nomeFazenda;
    }

    public void setNomeFazenda(String nomeFazenda) {
        this.nomeFazenda = nomeFazenda;
    }

    public List<Grao> getGraosProduzidos() {
        return graosProduzidos;
    }

    public void adicionarGrao(Grao grao) {
        graosProduzidos.add(grao);
    }

    public void removerGrao(String nomeGrao) {
        graosProduzidos.removeIf(grao -> grao.getNome().equalsIgnoreCase(nomeGrao));
    }
}
