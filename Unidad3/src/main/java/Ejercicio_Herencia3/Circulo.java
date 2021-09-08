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
public class Circulo extends Figura2D{
    private float radio;
    public Circulo (){
    }
    public Circulo (float r){
        radio=r;
    }
    @Override
    public float calcularArea(){
        float f=0;
        f=(float)(Math.PI*Math.pow(radio, 2));
        return f;
    }
    @Override
    public float calcularPerimetro(){
        float p=0;
        p=(float)(2*Math.PI*radio);
        return p;
    }
    @Override
    public void dibujar(){
        System.out.println("|");
    }
    //public int cambiarTamaño()
}
