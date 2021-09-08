/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

/**
 *
 * @author Vanessa
 */
public abstract class Titulo {
    private String nombre;
    public Titulo(){
        nombre = "";
    }
    public Titulo(String n){
        nombre = n;
    }
    public String leerNombre(){
        return nombre;
    }
    public void cambiarNombre(String n){
        nombre = n;
    }
    public String dameDescripcion(){
        return "Nombre: " + nombre;
    }
}
