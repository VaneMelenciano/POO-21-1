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
public class CalculadoraSimple {
    double num1;
    double num2;
    
    double suma(){
        return(num1+num2);
    }
    double resta(){
        return(num1-num2);
    }
    double multiplicacion(){
        return(num1*num2);
    }
    double division(){
        return(num1/num2);
    }
    double reciproco(){
        return(1/num1);
    }
    double reciproco1(){
        return(1/num2);
    }
    double cambiarSig(){
        return(num1*(-1));
    }
    double cambiarSig1(){
        return(num2*(-1));
    }
    double elevarCuadrado(){
        return(Math.pow(num1,2));
    }
    double elevarCuadrado1(){
        return(Math.pow(num2,2));
    }
    double raizCuadrada(){
        return(Math.sqrt(num1));
    }
    double raizCuadrada1(){
        return(Math.sqrt(num2));
    }
    double porcentaje(){
        return((100.0*num1)/num2);
    }
    double porcentaje1(){
        return((100.0*num2)/num1);
    }
    void mostrar(){
        System.out.println("El numero 1 es: " + num1);
        System.out.println("El numero 2 es: " + num2);
        System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma());
        System.out.println("La resta entre " + num1 + " y " + num2 + " es " + resta());
        System.out.println("La multiplicacion de " + num1 + " por " + num2 + " es " + multiplicacion());
        System.out.println("La division de " + num1 + " entre " + num2 + " es " + division());
        System.out.println("El reciproco de " + num1 + " es " + reciproco());
        System.out.println("El reciproco de " + num2 + " es " + reciproco1());
        System.out.println("El numero " + num1 + " es " + cambiarSig() + " con signo contrario");
        System.out.println("El numero " + num2 + " es " + cambiarSig1() + " con signo contrario");
        System.out.println("La raiz cuadra de " + num1 + " es " + raizCuadrada());
        System.out.println("La raiz cuadra de " + num2 + " es " + raizCuadrada1());
        System.out.println("El numero " + num1 + " elevado al cuadrado, es " + elevarCuadrado());
        System.out.println("El numero " + num2 + " elevado al cuadrado, es " + elevarCuadrado1());
        System.out.println(num1 + "es el %" + porcentaje() + " de "+ num2);
        System.out.println(num2 + "es el %" + porcentaje1() + " de "+ num1);
    }
    public static void main(String []args){
        CalculadoraSimple cs = new CalculadoraSimple();
        cs.num1=3.0;
        cs.num2=9.0;
        cs.mostrar();
    }
}
