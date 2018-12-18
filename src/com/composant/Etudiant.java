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
public class Etudiant {
    int idEtudiant;
    String prenom;
    String nom;
    
    public Etudiant (int id, String prenom, String nom){
       this.idEtudiant = id;
       this.nom = nom;
       this.prenom = prenom;
    }
}
