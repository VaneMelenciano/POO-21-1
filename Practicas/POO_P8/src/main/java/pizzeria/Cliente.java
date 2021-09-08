/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author Vanessa
 */
public class Cliente {
    private String nombre, direccion;
    private Cliente(){
        
    }
    public Cliente(String n, String d){
        nombre = n;
        direccion = d;
    }
    public void setNombre(String n){
        nombre = n;
    }
    public String getNombre(){
        return nombre;
    }
    public void setDireccion(String d){
        direccion = d;
    }
    public String getDireccion(){
        return direccion;
    }
}
