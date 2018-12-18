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
public abstract class Composant {
    int id;
    String nom;
    
    public Composant(int id , String nom){
        this.id = id;
        this.nom = nom;
    }
    
    abstract public double calculMoyenne(int idEtudiant);
    abstract public double getCoafficient();
}
