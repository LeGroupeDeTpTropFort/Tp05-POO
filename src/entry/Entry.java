/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entry;

import com.composant.Etudiant;
import com.composant.Matiere;
import com.composant.Module;
import com.composant.Promotion;
import com.connexion.SingletonConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author p1703136
 */
public class Entry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Test database connection
        Promotion promo = new Promotion();
        Module root = new Module(0, "root");
        Module annee;
        
        SingletonConnect sg = new SingletonConnect("baseComposite");
        ResultSet resultats = sg.select("id, prenom, nom","etudiants");
        
        try {
            while(resultats.next()){
                promo.getEtudiants().add(new Etudiant(resultats.getInt("id"),
                                                      resultats.getString("prenom"), 
                                                      resultats.getString("nom")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Entry.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        resultats = sg.select("*", "modules");
        
        try {
            while(resultats.next()){
                if(resultats.getInt("idPere") == root.getId()){
                    annee = new Module(resultats.getInt("id"), resultats.getString("nom"));
                    root.getListComposants().add(annee);
                }
                   if(resultats.getInt("idPere")== r.getId()){
                       
                   }
                
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(Entry.class.getName()).log(Level.SEVERE, null, ex);
        } </*
            resultats = sg.select("idModule, idEtudiant, note","notes");
            try {
            while(resultats.next()){
            
            System.out.println(resultats.getDouble("note"));
            }
            } catch (SQLException ex) {
            Logger.getLogger(Entry.class.getName()).log(Level.SEVERE, null, ex);
            }
            */
    }
    
}
