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
public class Module extends Composant {
    ArrayList<Composant> listComposants;

    public Module(int id, String nom){
        super(id, nom);
        this.listComposants = new ArrayList();
    }
    
    
    @Override
    public double calculMoyenne(int idEtudiant) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getCoafficient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Composant> getListComposants() {
        return listComposants;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }
    
    
}
