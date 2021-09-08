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
public class Piramide extends Figura3D{
    private float altura;
    private float lado;
    public Piramide(){
    }
    public Piramide(float a, float l){
        altura = a;
        lado = l;
    }
    @Override
    public float calcularVolumen(){
        float f=0;
        f=(float)(lado*lado*altura*(1/3));
        return f;
    }
    @Override
    public void dibujar(){
        System.out.println("/");
    }
}
