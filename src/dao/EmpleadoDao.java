/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import control.Coneccion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Empleado;

/**
 *
 * @author u
 */
public class EmpleadoDao {
    private Coneccion coneccion;
    private List<Empleado> listaEmpleados = new ArrayList<Empleado>();
    private Empleado empleado;
    
    public EmpleadoDao(Coneccion coneccion){
        this.coneccion=coneccion;
    }
    
    public Empleado buscarEmpleado(String cod){
        coneccion.crearConeccion();
        
        try {
            PreparedStatement consultaBD= coneccion.getConeccion().prepareStatement("SELECT * FROM PERSONA WHERE PERSONA.IDPERSONA = " + cod);
            ResultSet resultado = consultaBD.executeQuery();//obtener
            if (resultado.next()) {
                int id = resultado.getInt("idPersona");
                String nombre = resultado.getString("nombrePersona");
                String apellidoP = resultado.getString("apellidoPaterno");
                String apellidoM = resultado.getString("apellidoMaterno");
                //System.out.println(id + " " + nombre + " " + apellidoP + " " + apellidoM);
                empleado = new Empleado(id, cod, apellidoM, id, nombre, apellidoM, cod, nombre, apellidoM);

            }
            coneccion.cerrar();

            
        } catch (SQLException ex) {
            System.out.println("Error de sintaxis " + ex);
        }
        
        
        return empleado;
    }
    
     public List<Empleado> buscarEmpleados(String param) {

        coneccion.crearConeccion();
        try {
            PreparedStatement consultaBD = coneccion.getConeccion().prepareStatement("SELECT * from empleado;");
            ResultSet resultado = consultaBD.executeQuery();
            while (resultado.next()) {
                int idE = resultado.getInt("idEmpleado");
                String nombre = resultado.getString("nombre");
                int idP = resultado.getInt("idEmpleado");
                String apellido = resultado.getString("apellido");
                
                //System.out.println(id + " " + nombre + " " + apellidoP + " " + apellidoM);
                listaEmpleados.add(new Empleado(idE, param, apellido, idP, nombre, apellido, nombre, param, apellido));

            }
            coneccion.cerrar();

        } catch (SQLException ex) {
            System.out.println("Error de sintaxis " + ex);
        }
        return listaEmpleados;
    }
    
    
}






//    public int eliminarEmpleado(Empleado e){
//        int done=0;
//       // PreparedStatement consultaBD = coneccion.getConeccion().prepareStatement("DELETE FROM EMPLEADO WHERE idEmpleado=" +e.get)
//        
//        return done;
//    }

    