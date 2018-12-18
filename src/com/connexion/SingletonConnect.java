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
    public static void connect(){
      try{
          Class.forName("org.sqlite.JDCB").newInstance();
          Connection cnx = DriverManager.getConnection("jdcb:sqlite:baseTest.sqlite");
          Statement lien=cnx.createStatement();
      } 
      catch(Exception e){
          System.out.println(e.getMessage());
      }
    }
}
