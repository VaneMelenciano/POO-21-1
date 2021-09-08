
// EJERCICIO 7
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
public class Estudiante {
    double dep1;
    double dep2;
    double dep3;
    String nombre;
    
    double calcularCalFinal(){
        double calTotal = (dep1+dep2+dep3)/3;
        return calTotal;
    }
    void mostrar(){
        System.out.println("El alumno es " + nombre);
        System.out.println("Sus calificaciones son:");
        System.out.println( "Departamental 1 :" + dep1);
        System.out.println( "Departamental 2 :" + dep2);
        System.out.println( "Departamental 3 :" + dep3);
        System.out.println( "Calificacion total:" + calcularCalFinal());
    }
    
    public static void main(String []args){
        Estudiante e = new Estudiante();
        e.dep1=8;
        e.dep2=9;
        e.dep3=9;
        e.nombre="Vanessa";
        e.mostrar();
    }
}
