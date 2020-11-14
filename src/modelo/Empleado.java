/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author u
 */
public class Empleado extends Persona {
    private int idEmpleado;
    private String cargo,sueldo;

    public Empleado(int idEmpleado, String cargo, String sueldo, int idPersona, String nombre, String apellido, String cedula, String pasaporte, String telefono) {
        super(idPersona, nombre, apellido, cedula, pasaporte, telefono);
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }    
    

    public Empleado() {
    }

   

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
