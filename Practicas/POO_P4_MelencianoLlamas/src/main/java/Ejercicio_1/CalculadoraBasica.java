/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

/**
 *
 * @author Vanessa
 */
public class CalculadoraBasica {
    public double resultado;
    
    public CalculadoraBasica(){  
    }
   public double sumar(int n1, int n2){
        resultado = (double)(n1+n2);
        return resultado;
    }
    public double sumar(float n1, float n2){
        resultado = (double)(n1+n2);
        return resultado;
    }
    public double sumar(double n1, double n2){
        resultado = n1+n2;
        return resultado;
    }
    public double restar(int n1, int n2){
        resultado = (double)(n1-n2);
        return resultado;
    }
    public double restar(float n1, float n2){
        resultado = (double)(n1-n2);
        return resultado;
    }
    public double restar(double n1, double n2){
        resultado = n1-n2;
        return resultado;
    }
    public double multiplicar(int n1, int n2){
        resultado = (double)(n1*n2);
        return resultado;
    }
    public double multiplicar(float n1, float n2){
        resultado = (double)(n1*n2);
        return resultado;
    }
    public double multiplicar(double n1, double n2){
        resultado = n1*n2;
        return resultado;
    }
    public double dividir(int n1, int n2){
        resultado = (double)(n1/n2);
        return resultado;
    }
    public double dividir(float n1, float n2){
        resultado = (double)(n1/n2);
        return resultado;
    }
    public double dividir(double n1, double n2){
        resultado = n1/n2;
        return resultado;
    }
    public void mostrar(double r){
        System.out.println("El resultado es: " + r);
    }
    public static void main(String arg[]){
        CalculadoraBasica CB = new CalculadoraBasica();
        CB.mostrar(CB.sumar(3,6));
        CB.mostrar(CB.sumar(2.4f, 6.7f)); 
        CB.mostrar(CB.sumar(4.76, 8.967));
        CB.mostrar(CB.restar(6, 5));
        CB.mostrar(CB.restar(5.7f, 4.6f));
        CB.mostrar(CB.restar(34.76, 5.34));
        CB.mostrar(CB.multiplicar(9, 5));
        CB.mostrar(CB.multiplicar(4.4f, 2.7f));
        CB.mostrar(CB.multiplicar(8.976, 4.501));
        CB.mostrar(CB.dividir(6, 4));
        CB.mostrar(CB.dividir(3.4f, 9.0f));
        CB.mostrar(CB.dividir(3.234, 9.087));
    }
    
}
