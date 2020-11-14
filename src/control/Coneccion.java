/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author u
 */
public class Coneccion {
    private Connection coneccion;

    public Coneccion() {
    }

    public Connection getConeccion() {
        return coneccion;
    }

    public void setConeccion(Connection coneccion) {
        this.coneccion = coneccion;
    }
    
    public Connection crearConeccion(){
        if (coneccion == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                coneccion = DriverManager.getConnection(VariablesFinal.URL,
                        VariablesFinal.USER,
                        VariablesFinal.PASS);
                //coneccion = DriverManager.getConnection("jdbc:mysql://localhost/ejemplo1","root","root");
            } catch (ClassNotFoundException ex) {
                System.out.println("Class not found " + ex);
            } catch (SQLException ex) {
                System.out.println("SQLException " + ex);
            }
        }
        return coneccion;
    }

     public void cerrar() {
        if (coneccion != null) {
            try {
                coneccion.close();
            } catch (SQLException ex) {
                System.out.println("No se puede cerrar " + ex);
            }
        }  
    }
    
    
}

