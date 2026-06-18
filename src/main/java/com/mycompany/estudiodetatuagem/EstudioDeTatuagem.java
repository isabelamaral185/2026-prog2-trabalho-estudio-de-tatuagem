/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudiodetatuagem;
import com.formdev.flatlaf.FlatDarkLaf;
import com.mycompany.estudiodetatuagem.view.Principal;

/**
 *
 * @author amara
 */
public class EstudioDeTatuagem {

    public static void main(String[] args) {
        
        FlatDarkLaf.setup();
        
        new Principal().setVisible(true);
    }
}
