/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Vanessa
 */
public class Fraccion implements Relacionable{
    private int numerador, denominador;
    public Fraccion(int n, int d){
        numerador = n;
        denominador = d;
    }
    public Fraccion(){
        
    }
    public Fraccion(int n){
        numerador = n;
        denominador = 1;
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
    @Override
    public String ToString(){
        return numerador + "/" + denominador;
    }
    
    @Override
    public boolean esMayorQue(Object a){
        if ( a == null){
            return false;
        }
        if(!(a instanceof Fraccion)){
            return false;
        }
        Fraccion f = (Fraccion)a;
        this.simplificar();
        f.simplificar();
        if((numerador/(double)denominador)<(f.numerador/(double)f.denominador)){
            return false;
        }
        return true;
    }
    @Override
    public boolean esMenorQue(Object a){
        if ( a == null){
            return false;
        }
        if(!(a instanceof Fraccion)){
            return false;
        }
        Fraccion f = (Fraccion)a;
        this.simplificar();
        f.simplificar();
        if((numerador/(double)denominador)>(f.numerador/(double)f.denominador)){
            return false;
        }
        return true;
    }
    @Override
    public boolean esIgualQue(Object a){
        if ( a == null){
            return false;
        }
        if(!(a instanceof Fraccion)){
            return false;
        }
        Fraccion f = (Fraccion)a;
        this.simplificar();
        f.simplificar();
        if((numerador/(double)denominador)==(f.numerador/(double)f.denominador)){
            return false;
        }
        return true;
    }
}
