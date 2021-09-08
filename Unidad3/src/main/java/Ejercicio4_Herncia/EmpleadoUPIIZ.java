/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4_Herncia;

/**
 *
 * @author Vanessa
 */
public class EmpleadoUPIIZ{
    public String nombre;
    public int noEmpleado;
    public EmpleadoUPIIZ(){
        nombre = "Pancho Madrigal";
        noEmpleado=657;
    }
    public EmpleadoUPIIZ(String nom, int nE){
        nombre = nom;
        noEmpleado = nE;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNoEmpleado(int nE){
        noEmpleado = nE;
    }
    public int getNoEmpleado(){
        return noEmpleado;
    }
    
}
