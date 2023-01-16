package com.mycompany.Codigo_fila;

public class Elementos {
    private String valor;
    private Elementos proximo;
    
    public Elementos(String novoValor){
        this.valor = novoValor;
    }

    public String getValor() {
        return valor;
    }

    
    public void setValor(String valor) {
        this.valor = valor;
    }

    
    public Elementos getProximo() {
        return proximo;
    }

    
    public void setProximo(Elementos proximo) {
        this.proximo = proximo;
    }
}