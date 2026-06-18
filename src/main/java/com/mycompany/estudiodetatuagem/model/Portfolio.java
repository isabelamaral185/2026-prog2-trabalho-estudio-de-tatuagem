/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiodetatuagem.model;

/**
 *
 * @author amara
 */

public class Portfolio {
    private String caminhoImagem;

    public Portfolio(String caminhoImagem){
        this.caminhoImagem = caminhoImagem;
    }

    public String getCaminhoImagem(){ 
        return caminhoImagem; 
    }
    
    public void setCaminhoImagem(String caminhoImagem){ 
        this.caminhoImagem = caminhoImagem; 
    }

    @Override
    public String toString() {
        return caminhoImagem;
    }
}
