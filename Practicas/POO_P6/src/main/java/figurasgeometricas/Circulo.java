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
public class Circulo extends Figura2D{
    private float radio;
    public Circulo (){
        radio = 7;
    }
    public Circulo (float r){
        radio=r;
    }
    public void setRadio(float r){
        radio = r;
    }
    public float getRadio(){
        return radio;
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
    public float cambiarTamanio(){
        radio *=2;
        return radio;
    }
}

