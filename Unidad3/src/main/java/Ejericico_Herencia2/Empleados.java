/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejericico_Herencia2;

/**
 * Nobre: Vanessa Melenciano Llamas
 * Tema del programa: Relaciones entre objetos
 * Descripcion: Herencia entre clases
 * Fecha: 19/11/20
 */
public abstract class Empleados {
    private String RFC, nombre, departamento, puesto;
    
    public Empleados(){
    }
    public Empleados(String rfc, String nom){
        RFC=rfc;
        nombre=nom;
    }
    
    public void setRFC(String rfc){
        RFC = rfc;
    }
    public String getRFC(){
        return RFC;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    public String getNombre(){
        return nombre;
    }
    public void setDepartamento(String dep){
        departamento = dep;
    }
    public String getDepartamento(){
        return departamento;
    }
    public void setPuesto(String p){
        puesto = p;
    }
    public String getPuesto(){
        return puesto;
    }
    
    //METODO ABSTRACTO
    public abstract float calcularQuincena();
    /*public float calcularQuincena(){
        return 0;public float abstract calcularQuincena()
    }*/
}
