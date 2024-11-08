/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud_consultas;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class conexion_fest {
    String host = "team05.c7wkc62gg6v0.us-east-1.rds.amazonaws.com";
    String jdbcUrl = "jdbc:mysql://" + host + ":3306/holiday?useSSL=false";
    String username = "admin";
    String password = "equipo05";
    Connection con;
    
    public conexion_fest(){
        try {
             con = DriverManager.getConnection(jdbcUrl, username, password);
             if (con != null){
                 System.out.println("Conexion exitosa");
             }
        } catch (Exception e) {
            System.out.println("Error en la conexion: " + e);
        }
    }
    
    public Connection getConection(){
       return con;
    }
}
