/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Herencia4;

/**
 *
 * @author Vanessa
 */
public class Fraccion extends Object implements Comparable{
    private int numerador;
    private int denominador;
    
    public Fraccion(){
        numerador=1;
        denominador=1;
    }
    public Fraccion(int n, int d){
        numerador=n;
        denominador=d;
    }
    public Fraccion(int n){
        numerador=n;
        denominador=n;
    }
    
    public void setNumerador(int n){
        if(n>0){
            numerador=n;
        }
        else{numerador=0;}
    }
    public int getNumerador(){
        return numerador;
    }
    
    public void setDenominador(int d){
         if(d>0){
            denominador = d;
        }
        else{denominador=0;}
    }
    public int getDenominador(){
        return denominador;
    }
    
    public Fraccion sumar(Fraccion f){
        Fraccion aux = new Fraccion();
        aux.numerador = numerador * f.denominador + denominador * f.numerador;
        aux.denominador = denominador * f.denominador;
        aux.simplificar();
        return aux;
    }
    public Fraccion resta(Fraccion f){
        Fraccion aux = new Fraccion();
        aux.numerador = numerador * f.denominador - denominador * f.numerador;
        aux.denominador = denominador * f.denominador;
        aux.simplificar();
        return aux;
    }
    public Fraccion multiplicacion(Fraccion f){
        Fraccion aux = new Fraccion();
        aux.numerador = numerador * f.numerador;
        aux.denominador = denominador * f.denominador;
        aux.simplificar();
        return aux;
    }
    public Fraccion division(Fraccion f){
        Fraccion aux = new Fraccion();
        aux.numerador = numerador * f.denominador;
        aux.denominador = denominador * f.numerador;
        aux.simplificar();
        return aux;
    }
    public int maximoComunDivisor(){
      int mcd = 1;
      int aux = 0;
      if(numerador<denominador){
            int a,b;
            a = numerador;
            b = denominador;
            b = b%a;
            while(b != 0){
                aux = b;
                b = a%b;
            }
            mcd = aux;
        }
      else if(numerador>denominador){
          int a,b;
            a = denominador;
            b = numerador;
            b = b%a;
            while(b != 0){
                aux = b;
                b = a%b;
            }
            mcd = aux;
      }
      return mcd;  
    }
    public void simplificar(){
        int mcd = maximoComunDivisor();
        numerador = numerador / mcd;
        denominador = denominador / mcd;
    }
    public boolean esMayorque(Fraccion f){
        if(f==null){
            return false;
        }
        else if(numerador>f.getNumerador() && denominador>f.getDenominador()){
            return true;
        }
        return false;
    }
    public boolean esMenorque(Fraccion f){
        if(f==null){
            return false;
        }
        else if(numerador<f.getNumerador() && denominador<f.getDenominador()){
            return true;
        }
        return false;
    }
    public boolean esIgual(Fraccion f){
        if(f==null){
            return false;
        }
        else if(numerador==f.getNumerador() && denominador== f.getDenominador()){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Fraccion f1 = new Fraccion(74, 34);
        Fraccion f2 = new Fraccion(13, 89);
        Fraccion f3 = f1.sumar(f2);
        /*System.out.println("Suma: ");
        System.out.println("f3.numerador: " + f3.getNumerador());
        System.out.println("f3.denominador: " + f3.getDenominador());
        Fraccion f4 = f1.resta(f2);
        System.out.println("Resta: ");
        System.out.println("f3.numerador: " + f4.getNumerador());
        System.out.println("f3.denominador: " + f4.getDenominador());
        Fraccion f5 = f1.multiplicacion(f2);
        System.out.println("Multiplicacion: ");
        System.out.println("f3.numerador: " + f5.getNumerador());
        System.out.println("f3.denominador: " + f5.getDenominador());
        Fraccion f6 = f1.division(f2);
        System.out.println("Division: ");
        System.out.println("f3.numerador: " + f6.getNumerador());
        System.out.println("f3.denominador: " + f6.getDenominador());*/
        System.out.println(f1.esIgual(f3));
        System.out.println(f1.esMayorque(f2));
        System.out.println(f1.esMenorque(f2));
    }  
}
