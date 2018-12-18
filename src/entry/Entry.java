/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entry;

import com.composant.Etudiant;
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
        
    }
    
}
