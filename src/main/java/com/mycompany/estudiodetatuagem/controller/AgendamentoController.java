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
public class AgendamentoController {
    private ArrayList<Agendamento> agendamentos;

    public AgendamentoController(){
        agendamentos = new ArrayList<>();
    }

    public void adicionar(Agendamento agendamento){
        agendamentos.add(agendamento);
    }

    public ArrayList<Agendamento> listar(){
        return agendamentos;
    }
}
