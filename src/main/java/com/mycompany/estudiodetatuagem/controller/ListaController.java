/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiodetatuagem.controller;

import com.mycompany.estudiodetatuagem.model.Agendamento;
import java.util.ArrayList;

/**
 *
 * @author amara
 */
public class ListaController {

    private ArrayList<Agendamento> agendamentos;

    public ListaController(ArrayList<Agendamento> agendamentos){
        this.agendamentos = agendamentos;
    }

    public ArrayList<Agendamento> listarTodos(){
        return agendamentos;
    }

    public ArrayList<Agendamento> filtrarPorArtista(String artista){
        if (artista == null || artista.equals("Selecione...") || artista.equals("Todos(as)")){
            return agendamentos;
        }

        ArrayList<Agendamento> filtrados = new ArrayList<>();
        for (Agendamento a : agendamentos){
            if (a.getArtista().equals(artista)){
                filtrados.add(a);
            }
        }
        return filtrados;
    }
}
