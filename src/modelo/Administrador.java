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
public class Administrador extends Empleado {
    private String firmaResponsabilidad;

    public Administrador(String firmaResponsabilidad, int idEmpleado, String cargo, String sueldo, int idPersona, String nombre, String apellido, String cedula, String pasaporte, String telefono) {
        super(idEmpleado, cargo, sueldo, idPersona, nombre, apellido, cedula, pasaporte, telefono);
        this.firmaResponsabilidad = firmaResponsabilidad;
    }

   

    public Administrador() {
    }

    public String getFirmaResponsabilidad() {
        return firmaResponsabilidad;
    }

    public void setFirmaResponsabilidad(String firmaResponsabilidad) {
        this.firmaResponsabilidad = firmaResponsabilidad;
    }
    
    
    
}
