/// EJERCICIO 4
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
public class Punto {
    float valorX;
    float valorY;
    void Mostrar(){  //  (x,y).
        System.out.println("(" + valorX + "," + valorY + ")");
    }
    public static void main(String []args){
        //Crear objetos
        Punto p=new Punto();
        p.valorX=15;
        p.valorY=5;
        p.Mostrar();
    }
}
