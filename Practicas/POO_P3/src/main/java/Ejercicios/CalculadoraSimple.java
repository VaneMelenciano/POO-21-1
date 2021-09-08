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
    private double num1;
    private double num2;
    
CalculadoraSimple(){
    
}
CalculadoraSimple(double n1, double n2){
    setN1(n1);
    setN2(n2);
}

void setN1 (double nu1){
    if(nu1>0){
        num1=nu1;
    }
    else{
        num1=0;
    }
}
void setN2(double nu2){
    if(nu2>0){
        num2=nu2;
    }
    else{
        num2=0;
    }
}
double getN1(){
    return num1;
}
double getN2(){
    return num2;
}
    public static double sumar(double a, double b){
        return a+b;
    }
    public static double restar(double a, double b){
        return a-b;
    }
    public static double multiplicar(double a, double b){
        return a*b;
    }
    public static double dividir(double a, double b){
        return a/b;
    }
    public static double reciprocoo(double a){
        return 1/a;
    }
    public static double reciprocoo1(double b){
        return 1/b;
    }
    public static double cambiarSigno(double a){
        return a*(-1);
    }
    public static double cambiarSigno1(double b){
        return b*(-1);
    }
    public static double elevarAlCuadrado(double a){
        return Math.pow(a, 2);
    }
    public static double elevarAlCuadrado1(double b){
        return Math.pow(b, 2);
    }
    public static double sacarRaizCuadrada(double a){
        return Math.sqrt(a);
    }
    public static double sacarRaizCuadrada1(double b){
        return Math.sqrt(b);
    }
    public static double sacarPorcentaje(double a, double b){
        return (100.0*a)/b;
    }
    public static double sacarPorcentaje1(double a, double b){
        return (100.0*b)/a;
    }
    
    public static void main(String []args){
        double u1 = PruebaAcceso.solicitarDouble();
        double u2 = PruebaAcceso.solicitarDouble();
        System.out.println("La suma de los numeros es: " + CalculadoraSimple.sumar(u1, u2));
        System.out.println("La resta de los numeros es: " + CalculadoraSimple.restar(u1, u2));
        System.out.println("El numero " + u1 + " con signo contrario, es " + CalculadoraSimple.cambiarSigno(u1));
        System.out.println("El numero " + u2 + " con signo contrario, es " + CalculadoraSimple.cambiarSigno1(u2));
        System.out.println("La division entre los dos numeros es " + CalculadoraSimple.dividir(u1, u2));
        System.out.println("La multiplicacion de los numeros es: " + CalculadoraSimple.multiplicar(u1, u2));
        System.out.println("El reciproco del numero " + u1 + " es " + CalculadoraSimple.reciprocoo(u1));
        System.out.println("El reciproco del numero " + u2 + " es " + CalculadoraSimple.reciprocoo1(u2));
        System.out.println(u1 + "es el %" + CalculadoraSimple.sacarPorcentaje(u1, u2) + " de "+ u2 );
        System.out.println(u2 + "es el %" + CalculadoraSimple.sacarPorcentaje1(u1, u2) + " de "+ u1);
        System.out.println("La raiz cuadrada del numero " + u1 + " es " + CalculadoraSimple.sacarRaizCuadrada(u1));
        System.out.println("La raiz cuadrada del numero " + u2 + " es " + CalculadoraSimple.sacarRaizCuadrada1(u2));
        System.out.println("El numero " + u1 + " elevado a cuadrado, es " + CalculadoraSimple.elevarAlCuadrado(u1));
        System.out.println("El numero " + u2 + " elevado a cuadrado, es " + CalculadoraSimple.elevarAlCuadrado1(u2));
    }
}