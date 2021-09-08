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
public class TestFiguras {
    public static void main(String args[]){
        Esfera esf = new Esfera(5);
        System.out.println("El volumen de la esfera es: " + esf.calcularVolumen());
        
        Cubo c = new Cubo(7);
        System.out.println("El volumen del cubo es: " + c.calcularVolumen());
        
        Piramide p = new Piramide(2, 5, 3);
        System.out.println("El volumen de la piramide es: " + p.calcularVolumen());
        
        Cuadrado cua = new Cuadrado(6);
        System.out.println("El area del cuadrado es: " + cua.calcularArea());
        System.out.println("El perimetro del cuadrado es: " + cua.calcularPerimetro());
        
        Circulo cir = new Circulo(2);
        System.out.println("El area del cuadrado es: " + cir.calcularArea());
        System.out.println("El perimetro del cuadrado es: " + cir.calcularPerimetro());
        
        Triangulo tri = new Triangulo(4, 7);
        System.out.println("El area del tringulo es: " + tri.calcularArea());
        System.out.println("El perimetro del tringulo es: " + tri.calcularPerimetro());
    }
}
