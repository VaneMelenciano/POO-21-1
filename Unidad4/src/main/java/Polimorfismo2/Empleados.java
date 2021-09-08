/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo2;

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
    public Empleados(String rfc, String nom, String dep, String pue){
        RFC=rfc;
        nombre=nom;
        departamento = dep;
        puesto = pue;
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
    public abstract String calcularQuincena();
    /*public float calcularQuincena(){
        return 0;
    }*/
    
    public String toString(){
        return "RFC: " + this.RFC + "\n Nombre: " + this.nombre + "\n Departamento: " + this.departamento +"\n Puesto: " + this.puesto;
    }
}
