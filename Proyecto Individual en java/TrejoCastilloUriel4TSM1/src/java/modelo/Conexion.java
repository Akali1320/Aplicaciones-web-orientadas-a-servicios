/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private Connection con;
    private String user,passwd,url;
      public Conexion(){
          user="postgres";
          passwd="bd";
          /*
           NOTA IMPORTANTE
          EN LA URL ES POSTGRESQL NO POSTGRES
          */
          url="jdbc:postgresql://localhost:5432/UTTEC";
      }
      //para la conexion el public Connection debe estar afuera de mi public Conexion()
          public Connection obtenerConexion(){
              try{
                  
                  Class.forName("org.postgresql.Driver");
                  return con=DriverManager.getConnection(url,user,passwd);
                  
              }catch(Exception e){//En caso de que se encuentre un error lo imprimira con el catch
                  e.printStackTrace();
              }
              return con=null;
          }
          
         
 }

