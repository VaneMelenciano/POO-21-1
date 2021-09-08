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
public class Cilindro {
    private double pi;
    private double diametro;
    private double altura;
    
/*float getAltura(){
    return altura;
}*/
//float   
double calcularArea(){
        double area;
        area=2*pi*(diametro/2)*altura;
        return area;
    }
    double calcularVolumen(){
        double volumen;
        double r2;
        r2 = (diametro/2)*(diametro/2);
        volumen=pi*r2*altura;
        return volumen;
    }
    void Mostrar(){
        System.out.println("Volumen: " + calcularVolumen());
        System.out.println("Area: " + calcularArea());
    }
    public static void main(String []args){
        Cilindro c1=new Cilindro(); 
        c1.diametro=15.5;
        c1.altura=42.3;
        c1.pi=3.1416;
        c1.Mostrar();
    }
}
