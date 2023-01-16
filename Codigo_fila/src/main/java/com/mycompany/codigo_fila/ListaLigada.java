package com.mycompany.Codigo_fila;

public class ListaLigada {
      private Elementos primeiro;
      private Elementos ultimo;
      private int tamanho;
      
      public ListaLigada(){
          this.tamanho = 0;
      }
    
    public Elementos getPrimeiro() {
        return primeiro;
    }

    
    public void setPrimeiro(Elementos primeiro) {
        this.primeiro = primeiro;
    }

    
    public Elementos getUltimo() {
        return ultimo;
    }

    
    public void setUltimo(Elementos ultimo) {
        this.ultimo = ultimo;
    }

    
    public int getTamanho() {
        return tamanho;
    }

    
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void adicionar(String novoValor){
        Elementos novoElementos = new Elementos(novoValor);
        if (this.primeiro == null && this.ultimo == null){
            this.primeiro = novoElementos;
            this.ultimo = novoElementos;
        }else{
            this.ultimo.setProximo(novoElementos);
            this.ultimo = novoElementos;
        }
        this.tamanho++;
    }    
        
    public void remover(String valorProcurado){
        Elementos anterior = null;
        Elementos atual = this.primeiro;
        for(int i=0; i < this.getTamanho(); i++){
            if (atual.getValor().equalsIgnoreCase(valorProcurado)){
                if (this.tamanho == 1){
                    this.primeiro = null;
                    this.ultimo = null;
                }else if (atual == primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                }else if (atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                }else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }    
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }    
    }
    
    public Elementos get(int posicao){
        Elementos atual = this.primeiro;
        for(int i=0; i <= posicao; i++){
            if (atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }
}
