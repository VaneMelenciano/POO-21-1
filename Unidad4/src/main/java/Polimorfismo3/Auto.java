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
public class Auto extends Vehiculo{
    private int cilindros,  puertas, pasajeros;
    private String tamanio;
    public Auto(){
        
    }
    public Auto(String marca, String modelo, String matricula, int cili, int puer, int pasa, String tam){
        super(marca, modelo, matricula);
        this.cilindros = cili;
        this.puertas = puer;
        this.pasajeros = pasa;
        this.tamanio = tam;
    } 
    public void setCilindros(int cili){
        this.cilindros = cili;
    }
    public int getCilindros(){
        return this.cilindros;
    }
    public void setPuertas(int puer){
        this.puertas = puer;
    }
    public int getPuertas(){
        return this.puertas;
    }
    public void setPasajeros(int pas){
        this.pasajeros = pas;
    }
    public int getPasajeros(){
        return this.pasajeros;
    }
    public void setTamanio(String tam){
        this.tamanio = tam;
    }
    public String getTamanio(){
        return this.tamanio;
    }
    
    public String ToString(){
        return super.toString()+"\n Tamaño: " + this.tamanio + "\n No, Cilindros: " + this.cilindros + "\n No. puertas: " + this.puertas + "\n No. pasajeros: " + this.pasajeros;
    }
    
}
