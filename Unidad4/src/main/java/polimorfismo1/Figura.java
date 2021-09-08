/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo1;

/**
 *
 * @author Vanessa
 */
//clas clases abstractas no se pueden crear ovjetos de est
// Figura f = new Figura(); NOOOOO
public abstract class Figura extends Object{
    protected String nombre;
    protected int grosorBorde;
    protected int color;
    // protegidos, lo mismo que privados, no se pueden acceder desde fuera, pero estos si se pueden desde las hijas
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
    
    public String toString(){
        return "nombre: " + nombre + "\n Grosor borde: " + grosorBorde + " \n Color: " + color;
    }
}
