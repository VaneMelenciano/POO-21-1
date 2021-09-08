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
public class Triangulo extends Figura2D{
    private float base;
    private float altura;
    public Triangulo(){
        base = 9;
        altura = 6;
    }
    public Triangulo(float b, float a){
        base = b;
        altura = a;
    }
    public void setBase(float b){
        base = b;
    }
    public float getBase(){
        return base;
    }
    public void setAltura(float a){
        altura = a;
    }
    public float getAltura(){
        return altura;
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
    public float cambiarTamanio(){
        base *=2;
        return base;
    }
}

