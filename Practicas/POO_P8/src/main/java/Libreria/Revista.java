/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

/**
 *
 * @author Vanessa
 */
public class Revista extends Titulo{
    private int numero;
    public Revista(){
        super();
    }
    public Revista(int n, String nom){
        super(nom);
        numero = n;
    }
    public int leerNumero(){
        return numero;
    }
    public void cambiarNumero(int n){
        numero = n;
    }
    public String dameDescripcion(){
        return super.dameDescripcion() + "\n Numero: " + numero;
    }
}
