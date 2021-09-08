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
public class Pizza {
    private String nombre, ingredientes[], tamanio;
    private float precio;
    
    public Pizza(){
        
    }
    public Pizza(String n, String i[], String t, float p){
        nombre = n;
        ingredientes = i;
        tamanio = t;
        precio = p;
    }
    public void setNombre(String n){
        nombre = n;
    }
    public String getNombre(){
        return nombre;
    }
    public void setIngredientes(String i[]){
        ingredientes = i;
    }
    public String[] getIngredientes(){
        return ingredientes;
    }
    public void setTamanio(String t){
        tamanio = t;
    }
    public String getTamanio(){
        return tamanio;
    }
    public void setPrecio(float p){
        precio = p;
    }
    public float getPrecio(){
        return precio;
    }
    
}
