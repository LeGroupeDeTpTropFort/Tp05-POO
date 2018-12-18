/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author p1703136
 */
public class SingletonConnect{
    Connection cnx;
    Statement lien;
    String nomDB;
    public SingletonConnect(String nomDB){
        this.nomDB = nomDB;
        connect(nomDB);
    }
    public void connect(String path){
      try{
          
          Class.forName("org.sqlite.JDBC").newInstance();
          this.cnx = DriverManager.getConnection("jdbc:sqlite:"+path+".sqlite");
          this.lien = this.cnx.createStatement();
          System.out.println("reussite");
      } 
      catch(Exception e){
          System.out.println(e.toString());
      }
    }
    public ResultSet select(String Request, String nomTable){
        try{
            ResultSet result = lien.executeQuery("select "+Request+" from "+nomTable); 
            return result;
        }
        catch(Exception e){
            System.out.println(e.toString());
            return null;
        }
    }
}
