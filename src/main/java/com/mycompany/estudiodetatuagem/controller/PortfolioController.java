/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiodetatuagem.controller;

import com.mycompany.estudiodetatuagem.model.Portfolio;
import java.util.ArrayList;

/**
 *
 * @author amara
 */
public class PortfolioController {
    private ArrayList<Portfolio> imagens;
    
    public PortfolioController(){
        imagens = new ArrayList<>();
    }
    
    public void adicionar(Portfolio imagem){
        imagens.add(imagem);
    }
    
    public ArrayList<Portfolio> listar(){
        return imagens;
    }
}
