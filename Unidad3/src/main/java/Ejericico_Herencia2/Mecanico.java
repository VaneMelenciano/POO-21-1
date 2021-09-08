/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejericico_Herencia2;

/**
 * Nobre: Vanessa Melenciano Llamas
 * Tema del programa: Relaciones entre objetos
 * Descripcion: Herencia entre clases
 * Fecha: 19/11/20
 */
public class Mecanico extends Empleados{
    private float trabajos;
    public Mecanico(){
    }
    public Mecanico(String rfc, String nom){
        super(rfc, nom);
    }
    public void agregarTrabajo(float cantidad){
        if(cantidad>0){
            trabajos+=cantidad;
        }
    }
    public void setTrabajos(float t){
        trabajos = t;
    }
    public float getTrabajos(){
        return trabajos;
    }
    @Override //SOBREESCRITURA DE METODOS
    public float calcularQuincena(){
        return trabajos*0.04f;
    }
}
