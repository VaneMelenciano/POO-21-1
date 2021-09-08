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
public class Rectangulo {
    //DEFINIR ATRIBUTOS
    float ancho;
    float alto;
    
    //DEFINIR METODOS
    float calcularArea(){
        float area; //variable local al metodo
        area = ancho * alto;
        return area;
        // 0
        //return (ancho * alto);
    }
    float calcularPerimetro(){
        float perimetro;
        perimetro = (alto*2)+(ancho*2);
        return perimetro;
    }
    void Mostrar(){ //void cuando no hay return
        System.out.println("Ancho; " + ancho);
        System.out.println("Alto; " + alto);
        System.out.println("Perimetro; " + calcularPerimetro());
        System.out.println("Area; " + calcularArea());
    }
    public static void main(String []args){
        //Crear objetos
        Rectangulo r1=new Rectangulo();
        r1.alto=15;
        r1.ancho=25;
        r1.Mostrar();
    }
}
