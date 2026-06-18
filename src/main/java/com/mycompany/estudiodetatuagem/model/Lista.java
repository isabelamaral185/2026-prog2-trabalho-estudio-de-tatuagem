/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiodetatuagem.model;

/**
 *
 * @author amara
 */
public class Lista {
    private String cliente;
    private String data;
    private String artista;

    public Lista(String cliente, String data, String artista) {
        this.cliente = cliente;
        this.data = data;
        this.artista = artista;
    }

    public String getCliente(){ 
        return cliente; 
    }
    
    public void setCliente(String cliente){ 
        this.cliente = cliente; 
    }

    public String getData(){ 
        return data; 
    }
    
    public void setData(String data){ 
        this.data = data; 
    }

    public String getArtista(){ 
        return artista; 
    }
    
    public void setArtista(String artista){ 
        this.artista = artista; 
    }

    @Override
    public String toString() {
        return cliente + " - " + data + " (" + artista + ")";
    }
}