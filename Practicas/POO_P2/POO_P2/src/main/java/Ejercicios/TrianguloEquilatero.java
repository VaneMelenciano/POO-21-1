/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Vanessa
 */
public class TrianguloEquilatero {
    double lado;
    double calcularArea(){
       double k = (Math.sqrt(3.0))/4.0;
       double m = Math.pow(lado, 2.0);
       return (k*m);
    }
    double calcularPerimetro(){
         return (lado*3);       
    }
    void Mostrar(){
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Area: " + calcularArea());
    }
    public static void main(String []args){
        //Crear objetos
        TrianguloEquilatero te1=new TrianguloEquilatero();
        te1.lado=15;
        te1.Mostrar();
    }
}