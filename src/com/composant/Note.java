/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.composant;

/**
 *
 * @author Ayano
 */
public class Note {
    int idEdutiant;
    int idMatiere;
    double note;
    
    public Note(int idEtudiant, int idMatiere, double note){
        this.idEdutiant = idEtudiant;
        this.idMatiere = idMatiere;
        this.note = note;
    }
}
