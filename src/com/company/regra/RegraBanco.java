package com.company.regra;


import java.util.List;

public class RegraBanco {

    public String nome;
    private List<RegraContaPai> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<RegraContaPai> getContas() {
        return contas;
    }

    public void setContas(List<RegraContaPai> contas) {
        this.contas = contas;
    }
}
