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
public class Turismo extends Vehiculo{
    private int puertas, CapacidadPasajeros;
    
    public Turismo(){
        
    }
    public Turismo(String marca, String modelo, String matricula, int puer, int capPas){
        super(marca, modelo, matricula);
        this.CapacidadPasajeros=capPas;
        this.puertas=puer;
    }
    public void setCapacidadCarga(int capCar){
        this.CapacidadPasajeros = capCar;
    }
    public int getCapacidadCarga(){
        return this.CapacidadPasajeros;
    }
    public void setPuertas(int puer){
        this.puertas = puer;
    }
    public int getPuertas(){
        return this.puertas;
    }
    public String ToString(){
        return super.toString() + "\n Capacidad de pasajeros: " + this.CapacidadPasajeros +"\n Puertas: " + this.puertas;
    }
}
