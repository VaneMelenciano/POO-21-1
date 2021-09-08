/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Vanessa
 */
public class Contacto {
    private String nombre;
    private String direccion;
    private int tel;
    private int cel;
    public Contacto(){
        
    }
    public Contacto(String nom, int tc){
        nombre = nom;
        cel=tc;
    }
    public void setNombre(String n){
        nombre = n;
    }
    public String getNombre(){
        return nombre;
    }
    public void setDireccion(String d){
        direccion = d;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setTel(int t){
        tel = t;
    }
    public int getTel(){
        return tel;
    }
    public void setCel(int t){
        cel = t;
    }
    public int getCel(){
        return cel;
    }
}
