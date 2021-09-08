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
public class Trabajador {
    double sueldo;
    String nombre;
    
    double aumentoSueldo(){
        double nuevosueldo;
        if(sueldo>1000){
            nuevosueldo = sueldo+(sueldo*0.12);
        }
        else{
            nuevosueldo = sueldo+(sueldo*0.15);
        }
        return nuevosueldo;
    }
    void mostrar(){
        System.out.println("El trabajador " + nombre + " tenia un sueldo de " + sueldo + ", pero despues de su aumento tiene " + aumentoSueldo());
    }
    public static void main(String []args){
        Trabajador t = new Trabajador();
        t.sueldo=1500;
        t.nombre="Juan";
        t.aumentoSueldo();
        t.mostrar();
    }
}
