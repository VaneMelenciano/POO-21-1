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
    public float calcularArea(){
        float f=0;
        f=(float)(lado*lado);
        return f;
    }
    public float calcularPerimetro(){
        float p=0;
        p=(float)(lado*4);
        return p;
    }
    public void dibujar(){
        System.out.println("|");
    }
    
    public float cambiarTamanio(){
        lado *=3;
        return lado;
    }
    
    
    public String toString(){
        return super.toString() + "\n lado: "+ lado;
    }
}
