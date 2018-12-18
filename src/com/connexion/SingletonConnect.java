/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author p1703136
 */
public class SingletonConnect{
    
    public SingletonConnect(){ 
        connect();
    }
    public void connect(){
      try{
          
          Class.forName("org.sqlite.JDBC").newInstance();
          Connection cnx = DriverManager.getConnection("baseTest.sqlite");
          Statement lien=cnx.createStatement();
          System.out.println("reussite");
      } 
      catch(Exception e){
          System.out.println(e.toString());
      }
    }
}
