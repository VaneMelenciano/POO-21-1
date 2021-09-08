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
public class Piramide extends Figura3D{
    private float altura;
    private Triangulo tri;
    public Piramide(){
        tri = new Triangulo();
    }
    public Piramide(float a, float b, float a2){
        tri = new Triangulo(a, b);
        altura = a2;
    }
    public Piramide(float a, Triangulo t){
        tri = t;
    }
    public float calcularVolumen(){
        float f=0;
        f=(float)((1/3)*(tri.calcularArea()*altura));
        return f;
    }
    public float calcularAreaSuperficial(){
        return tri.calcularArea()*3;
    }
    public void dibujar(){
        System.out.println("OO");
    }
}
