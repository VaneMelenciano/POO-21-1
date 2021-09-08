///EJERCICIO 6
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
public class Persona {
    int dia;
    int mes;
    int ao;
    String nombre;
    
    void calcularEdad(){
        int edad_ao = 2020-ao;
        int edad_mes;
        if (mes > 10){
            edad_ao-= 1;
            int aux = Math.abs(10 - mes);
            edad_mes = 12-aux;
        }
        else{
            edad_mes = 10- mes;
        }
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su edad es de " + edad_ao + " años con " + edad_mes + " meses");
    }
    public static void main(String []args){
        Persona p = new Persona();
        p.ao=2001;
        p.mes=01;
        p.dia=11;
        p.nombre="Vanessa";
        p.calcularEdad();
    }
}
