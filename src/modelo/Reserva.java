/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;


/**
 *
 * @author u
 */
public class Reserva extends Persona{
    private int numeroPersonas;
    private Date fecha;

    public Reserva(int numeroPersonas, Date fecha, int idPersona, String nombre, String apellido, String cedula, String pasaporte, String telefono) {
        super(idPersona, nombre, apellido, cedula, pasaporte, telefono);
        this.numeroPersonas = numeroPersonas;
        this.fecha = fecha;
    }

  
    
  

    public Reserva() {
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    
    
    
    
}
    
    

