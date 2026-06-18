/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiodetatuagem.controller;

import com.mycompany.estudiodetatuagem.model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author amara
 */
public class ClienteController {
    private ArrayList<Cliente> clientes;

    public ClienteController(){
        clientes = new ArrayList<>();
    }

    public void cadastrar(Cliente cliente){
        clientes.add(cliente);
    }

    public ArrayList<Cliente> listar(){
        return clientes;
    }
}
