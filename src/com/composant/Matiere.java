/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.composant;

import java.util.ArrayList;

/**
 *
 * @author Ayano
 */
public class Matiere extends Composant {
    double coefficient;
    ArrayList<Note> listeNotes;
    
    public Matiere(int id, String nom){
        super(id, nom);
        this.listeNotes = new ArrayList();
    }
    
    @Override
    public double calculMoyenne(int idEtudiant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getCoafficient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
