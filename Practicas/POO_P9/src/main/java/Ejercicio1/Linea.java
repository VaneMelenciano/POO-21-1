/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;
import java.lang.Math;

/**
 *
 * @author Vanessa
 */
public class Linea implements Relacionable{
    private int x1,y1,x2,y2;
    public Linea(int n1, int n2, int n3, int n4){
        x1=n1;
        y1=n2;
        x2=n3;
        y2=n4;
    }
    public float longitud(){
        float num1 = (float)Math.pow(y1-x1, 2);
        float num2 = (float)Math.pow(y2-x2, 2);
        float d = (float)Math.sqrt(num1+num2);
        return d;
    }
    @Override
    public boolean esMayorQue(Object a){
        if ( a == null){
            return false;
        }
        if(!(a instanceof Linea)){
            return false;
        }
        double lon = ((Linea) a).longitud();
        return longitud() > lon;
    }
    @Override
    public boolean esMenorQue(Object a){
        if ( a == null){
            return false;
        }
        if(!(a instanceof Linea)){
            return false;
        }
        double lon = ((Linea) a).longitud();
        return longitud() < lon;
    }
    @Override
    public boolean esIgualQue(Object a){
        if ( a == null){
            return false;
        }
        if(!(a instanceof Linea)){
            return false;
        }
        double lon = ((Linea) a).longitud();
        return longitud() == lon;
    }
    @Override
    public String ToString(){
        String resultado = "Coordenadas del punto de inicio de la línea: (" + x1 + "," + y1 + ")\n" + "Coordenadas del punto del final de la línea: ("  + x2 + "," + y2 + ")\n" + "Distancia de la línea: " + longitud();
        return resultado;
    }
    
}
