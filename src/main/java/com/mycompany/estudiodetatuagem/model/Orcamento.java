/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiodetatuagem.model;

/**
 *
 * @author amara
 */

public class Orcamento {
    private String estilo;
    private int tamanho;
    private double valor;

    public Orcamento(String estilo, int tamanho, double valor) {
        this.estilo = estilo;
        this.tamanho = tamanho;
        this.valor = valor;
    }

    public String getEstilo(){ 
        return estilo; 
    }
    
    public void setEstilo(String estilo){ 
        this.estilo = estilo; 
    }

    public int getTamanho(){ 
        return tamanho; 
    }
    
    public void setTamanho(int tamanho){ 
        this.tamanho = tamanho; 
    }

    public double getValor(){ 
        return valor; 
    }
    
    public void setValor(double valor){ 
        this.valor = valor; 
    }

    @Override
    public String toString() {
        return String.format("Estilo: %s | Tamanho: %dcm | Valor: R$ %.2f", estilo, tamanho, valor);
    }
}