/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiodetatuagem.controller;

/**
 *
 * @author amara
 */
public class OrcamentoController {
    public double calcular(String estilo, int tamanho){
        double valor = tamanho * 20;
        
        switch (estilo) {
            case "Realista":
                valor += 500;
                break;
                
            case "Old School":
                valor += 300;
                break;
                
            case "Geométrica":
                valor += 250;
                break;
                
            case "Minimalista":
                valor += 150;
                break;
        }
        
        return valor;
    }
}
