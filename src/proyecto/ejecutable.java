/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import control.Coneccion;
import control.ControlEmpleados;
import dao.EmpleadoDao;
import java.util.List;
import modelo.Empleado;
import modelo.Persona;

/**
 *
 * @author u
 */
public class ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //conectando
        Coneccion coneccion= new Coneccion();
        if(coneccion.crearConeccion()!=null){
            System.out.println("Conexion correcta");
        }
        else{
            System.out.println("No coneccion");
        }
        
        
        //buscar
        List<Empleado> listaEmpleados = new ControlEmpleados().buscarEmpleados(coneccion, "");
        for (Empleado listaEmpleado : listaEmpleados) {
            System.out.println(listaEmpleado);
        }
        
        
        
    }
    
}
//List<Persona> listaPersonas = new ControlPersonas().buscarPersonas(coneccion);
////        for (Persona listaPersona : listaPersonas) {
////            System.out.println(listaPersona);
////        }
////        System.out.println(new ControlPersonas().buscarPersona(coneccion, "5"));
////        System.out.println(new ControlPersonas().