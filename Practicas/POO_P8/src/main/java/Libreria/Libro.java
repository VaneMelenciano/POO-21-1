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
public class Libro extends Titulo{
    private String autor;
    public Libro(){
        super();
        autor = "";
    }
    public Libro(String a, String n){
        super(n);
        autor = a;
    }
    public String leeAutor(){
        return autor;
    }
    public void cambiarAutor(String a){
        autor = a;
    }
    public String dameDescripcion(){
        return super.dameDescripcion() + "\n Autor: " + autor;
    }
}
