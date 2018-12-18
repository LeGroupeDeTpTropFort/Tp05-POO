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
public class Promotion {
    ArrayList<Etudiant> etudiants;
    ArrayList<Note> notes;
    
    public Promotion(){
        this.etudiants = new ArrayList();
        this.notes = new ArrayList();
    }

    public ArrayList<Etudiant> getEtudiants() {
        return etudiants;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }
    
    
}
