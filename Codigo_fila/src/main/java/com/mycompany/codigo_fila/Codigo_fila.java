package com.mycompany.codigo_fila;

import com.mycompany.Codigo_fila.Fila;


public class Codigo_fila {
    

    public static void main(String[] args) {
        Fila fila = new Fila();
        
        fila.adicionar("João");
        fila.adicionar("Pedro");
        fila.adicionar("Marcos");
        fila.adicionar("Isaias");
        fila.adicionar("Matheus");
        
        System.out.println("Primeiro da fila:" + fila.get());
        fila.remover();
        System.out.println("Novo Primeiro da fila:" + fila.get());
        fila.remover();
        System.out.println("Novo Primeiro da fila:" + fila.get());
        
    }
}

  //Aluno Evandro Salles De Sousa  
 // Matricula: 01497660
