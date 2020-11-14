/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import control.Coneccion;
import java.util.ArrayList;
import java.util.List;
import modelo.Persona;

/**
 *
 * @author usuario1
 */
public class Personadao {
//        private Coneccion coneccion;
//    private List<Persona> listaPersona = new ArrayList<Persona>();
//    private Persona persona;
//
//    public Personadao(Coneccion coneccion) {
//        this.coneccion = coneccion;
//    }
//    
//   
//    
//    public Persona buscarPersona(String cod){
//        coneccion.crearConeccion();
//        
//        try {
//            PreparedStatement consultaBD= coneccion.getConeccion().prepareStatement("SELECT * FROM PERSONA WHERE PERSONA.IDPERSONA = " + cod);
//            ResultSet resultado = consultaBD.executeQuery();//obtener
//            if (resultado.next()) {
//                int id = resultado.getInt("idPersona");
//                String nombre = resultado.getString("nombrePersona");
//                String apellidoP = resultado.getString("apellidoPaterno");
//                String apellidoM = resultado.getString("apellidoMaterno");
//                //System.out.println(id + " " + nombre + " " + apellidoP + " " + apellidoM);
//                empleado = new Empleado(id, cod, apellidoM, id, nombre, apellidoM, cod, nombre, apellidoM);
//
//            }
//            coneccion.cerrar();
//
//            
//        } catch (SQLException ex) {
//            System.out.println("Error de sintaxis " + ex);
//        }
//        
//        
//        return empleado;
//    }
//    
//     public List<Empleado> buscarEmpleados(String param) {
//
//        coneccion.crearConeccion();
//        try {
//            PreparedStatement consultaBD = coneccion.getConeccion().prepareStatement("SELECT * FROM Empleado WHERE apellido LIKE '" + param + "%'");
//            ResultSet resultado = consultaBD.executeQuery();
//            while (resultado.next()) {
//                int idE = resultado.getInt("idEmpleado");
//                String nombre = resultado.getString("nombre");
//                int idP = resultado.getInt("idEmpleado");
//                String apellido = resultado.getString("apellido");
//                
//                //System.out.println(id + " " + nombre + " " + apellidoP + " " + apellidoM);
//                listaEmpleados.add(new Empleado(idE, param, apellido, idP, nombre, apellido, nombre, param, apellido));
//
//            }
//            coneccion.cerrar();
//
//        } catch (SQLException ex) {
//            System.out.println("Error de sintaxis " + ex);
//        }
//        return listaEmpleados;
//    }
    
}
