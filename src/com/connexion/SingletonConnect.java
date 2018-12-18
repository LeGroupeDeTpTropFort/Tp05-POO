/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connexion;

/**
 *
 * @author p1703136
 */
public class SingletonConnect{
    public static void connect(){
      try{
          Class.forName("org.dslite.JDCB").newInstance();
      } 
      catch(Exception e){
          System.out.println(e.getMessage());
      }
    }
}
