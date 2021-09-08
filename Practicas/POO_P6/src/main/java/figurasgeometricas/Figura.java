/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 * Nobre: Vanessa Melenciano Llamas
 * Tema del programa: Herencia
 * Descripcion: Relacion entre objetos
 * Fecha: 25/11/20
 */
public abstract class Figura {
    public String nombre;
    public int grosorBorde;
    public int color;
    
    public Figura(){
    }
    public Figura(int col){
        color = col;
    }
    public void setNombre(String nom){
        nombre=nom;
    }
    public String getNombre(){
        return nombre;
    }
    public void setGrosorBorde(int gb){
        grosorBorde = gb;
    }
    public int getGrosorBorde(){
        return grosorBorde;
    }
    public void setColor(int col){
        color=col;
    }
    public int getColor(){
        return color;
    }
    
    //METODO ABSTRACTO
    public abstract void dibujar();
}
