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
public class Deportivo extends Vehiculo{
    private int cilindros;
    private String tamanio;
    private String velocidadmaxima;
    
    public Deportivo(){
        
    }
    public Deportivo(String marca, String modelo, String matricula, int cilin, String tam, String vm){
        super(marca, modelo, matricula);
        this.cilindros=cilin;
        this.tamanio = tam;
        this.velocidadmaxima = vm;
    }
    public void setCilindros(int cili){
        this.cilindros = cili;
    }
    public int getCilindros(){
        return this.cilindros;
    }
    public void setTamanio(String tam){
        this.tamanio = tam;
    }
    public String getTamanio(){
        return this.tamanio;
    }
    public void setVelocidadMax(String vm){
        this.velocidadmaxima = vm;
    }
    public String getVelocidadMax(){
        return this.velocidadmaxima;
    }
    public String ToString(){
        return super.toString() + "\n No. ciindros: " + this.cilindros + "\n Tamaño: " + this.tamanio + "\n Velocidad maxima: " + this.velocidadmaxima;
    }
}
