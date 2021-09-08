/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo2;

/**
 * Nobre: Vanessa Melenciano Llamas
 * Tema del programa: Relaciones entre objetos
 * Descripcion: Herencia entre clases
 * Fecha: 19/11/20
 */
public class Administrativo extends Empleados{
    private float sueloMensual;
    
    public Administrativo(){
    }
    public Administrativo(String rfc, String nom, String dep, String pue){
        super(rfc, nom, dep, pue);
    }
    public void setSueldoMensual(float SM){
        sueloMensual = SM;
    }
    public float getSueldoMensual (){
        return sueloMensual;
    }
    @Override //SOBREESCRITURA DE METODOS
    public String calcularQuincena(){
        return "\n Quincena: " + sueloMensual/2;
    }
    
}
