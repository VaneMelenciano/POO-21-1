/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Vanessa
 */
public class ConvesionTemperaturas {
    private double valorTemperatura;
   
    public ConvesionTemperaturas(){
        valorTemperatura = 0;
    }
    public void setValor(double v){
        valorTemperatura = v;
    } 
    public double getValor(){
        return valorTemperatura;
    }
    public double fahrenheit_a_celsius(){
        return (5*(valorTemperatura-32))/9;
    }
    public double celsius_a_fahrenheit(){
        return ((9*valorTemperatura)/5)+32;
    }
    public double kelvin_a_celsius(){
        return valorTemperatura - 273.15;
    }
    public double celsius_a_kelvin(){
        return valorTemperatura+273.15;
    }
    public double kelvin_a_fahrenheit(){
        return (9*(valorTemperatura-273.15)/5)+32;
    }
    public double fahrenheit_a_kelvin(){
        return (5*(valorTemperatura-32)/9) + 273.15;
    }
    public void mostrar()
    {
        System.out.println("De Fahrenheit a Celcius es "+ fahrenheit_a_celsius());
        System.out.println("De celcius a Fahrenheit es "+ celsius_a_fahrenheit());
        System.out.println("De Kelvin a Celcius es "+ kelvin_a_celsius());
        System.out.println("De Celcius a Kelvin es "+ celsius_a_kelvin());
        System.out.println("De Kelvin a Fahrenheit es "+ kelvin_a_fahrenheit());
        System.out.println("De Fahrenheit a Kelvin es "+ fahrenheit_a_kelvin());
    }
    public static void main(String[] args)
    {
        ConvesionTemperaturas ct = new ConvesionTemperaturas();
        ct.valorTemperatura = 45;
        ct.mostrar();
    }
}
