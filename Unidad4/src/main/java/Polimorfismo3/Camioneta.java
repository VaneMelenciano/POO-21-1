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
public class Camioneta extends Vehiculo{
    private String capacidadCarga;
    
    public Camioneta(){
        
    }
    public Camioneta(String marca, String modelo, String matricula, String capCar){
        super(marca, modelo, matricula);
        this.capacidadCarga = capCar;
    }
    public void setCapacidadCarga(String capCar){
        this.capacidadCarga = capCar;
    }
    public String getCapacidadCarga(){
        return this.capacidadCarga;
    }
    public String ToString(){
        return super.toString() + "\n Capacidad de carga: " + this.capacidadCarga;
    }
}
