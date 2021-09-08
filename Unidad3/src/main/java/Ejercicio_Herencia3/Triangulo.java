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
public class Triangulo extends Figura2D{
    private float base;
    private float altura;
    public Triangulo(){
        base = 1;
        altura = 2;
    }
    public Triangulo(float b, float a){
        base = b;
        altura = a;
    }
    @Override
    public float calcularArea(){
        float f=0;
        f=(float)(base*altura*(1/2));
        return f;
    }
    @Override
    public float calcularPerimetro(){
        float p=0;
        p=(float)(base *3);
        return p;
    }
    @Override
    public void dibujar(){
        System.out.println("// ");
    }
    //public int cambiarTamaño()
}
