/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Herencia3;

/**
 *
 * @author Vanessa
 */
public class Cubo extends Figura3D{
    private Cuadrado cuad ;
    //private float lado;
    public Cubo(){
        cuad = new Cuadrado();
    }
    public Cubo(float l){
        cuad = new Cuadrado(l);
    }
    public void setLado(Cuadrado l){
        cuad = l;
    }
    public Cuadrado getLado(){
        return cuad;
    }
    public float calcularVolumen(){
        float f=0;
        f=(float)(cuad.calcularArea()*cuad.getLado());
        // f = Math.pow(cuad.getLado(), 3);
        return f;
    }
    public float calcularAreaSuperficial(){
        return cuad.calcularArea()*6;
    }
    public void dibujar(){
        System.out.println("[]");
    }
}
