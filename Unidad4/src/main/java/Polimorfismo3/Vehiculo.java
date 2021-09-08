/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo3;

/**
 *
 * @author Vanessa
 */
public abstract class Vehiculo { //abstract, aunque no tenga clases abstractas
    protected String marca, modelo, matricula;
    
    public Vehiculo(){
        
    }
    public Vehiculo(String marca, String modelo, String matricula){
        this.marca=marca;
        this.modelo=modelo;
        this.matricula=matricula;
    }
    public void setMarca(String marc){
        marca = marc;
    }
    public String getMarca(){
        return marca;
    }
    public void setModelo(String mode){
        modelo = mode;
    }
    public String getModelo(){
        return modelo;
    }
    public void setMatricula(String matri){
        matricula = matri;
    }
    public String getMatricula(){
        return matricula;
    }
    public String toString(){
        return "Matricula: " + this.matricula + "\n Marca: " + this.marca + "\n Modelo: " + this.modelo;
    }
}
