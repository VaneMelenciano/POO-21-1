/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperAgenda86;

/**
 * Nobre: Vanessa Melenciano Llamas
 * Tema del programa: Herencia multiple
 * Descripcion: herencia simple e interfaces de usuario
 * Fecha: 02/12/20
 */
public class Contacto {
    private String nombre;
    private String direccion;
    private int tel;
    private int cel;
    public Contacto(){
        
    }
    public Contacto(String nom, String dir, int tc, int ce){
        nombre = nom;
        cel=ce;
        tel=tc;
        direccion=dir;
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