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
public class Vendedor extends Empleados{
    private float comision;
    private float salariominimo;
    
    public Vendedor(){
    }
    public Vendedor(String rfc, String nom){
        super(rfc, nom);
    }
    public void setComision(float com){
        comision = com; 
    }
    public float getComision(){
        return comision;
    }
    public void setSalarioMinimo(float SM){
        salariominimo=SM;
    }
    public float getSalarioMinimo(){
        return salariominimo;
    }
    public void agregarComision(float cantidad){
        if(cantidad>0){
            comision+=cantidad;//todas las ventas realizadas
        }
    }
    @Override //SOBREESCRITURA DE METODOS
    public float calcularQuincena(){
        return salariominimo+(comision*0.02f);
    }
    
}
