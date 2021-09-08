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
public class Cuadrado extends Figura2D {
    private float lado;
    public Cuadrado(){
    }
    public Cuadrado(float l){
        lado=l;
    }
    public void setLado(float lad){
        lado = lad;
    }
    public float getLado(){
        return lado;
    }
    //sobreescribir los metodos abstractos que se heredan en las clases padre
    @Override
    public float calcularArea(){
        float f=0;
        f=(float)(lado*lado);
        return f;
    }
    @Override
    public float calcularPerimetro(){
        float p=0;
        p=(float)(lado*4);
        return p;
    }
    @Override
    public void dibujar(){
        System.out.println("|");
    }
    
    public float cambiarTamanio(){
        lado *=3;
        return lado;
    }
}
