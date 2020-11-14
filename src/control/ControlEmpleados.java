/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.EmpleadoDao;
import java.util.List;
import modelo.Empleado;
import vistas.PantallaEmpleado;

/**
 *
 * @author usuario1
 */
public class ControlEmpleados {

    public ControlEmpleados() {
    }
    
    EmpleadoDao empleadoDao;
    
    public List<Empleado> buscarEmpleados(Coneccion coneccion, String param){
        empleadoDao = new EmpleadoDao(coneccion);
        List<Empleado> listaEmpleados = empleadoDao.buscarEmpleados(param);  //revisar cast
        return listaEmpleados;
    }

    
    public Empleado buscarEmpleado(Coneccion coneccion, String cod){
    empleadoDao = new EmpleadoDao(coneccion);
    return empleadoDao.buscarEmpleado(cod);
    }
    
  

}
