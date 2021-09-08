/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 * Nobre: Vanessa Melenciano Llamas
 * Tema del programa: Relaciones entre objetos
 * Descripcion: Relacion entre objetos del mismo tipo
 * Fecha: 03/10/20
 */
public class Cliente {
    public String nombre;
    public String telefono;
    public String CURP;
    public String direccion;
    public String fechaNac;
    Cliente(){
        nombre = "Pedro";
        telefono = "4565";
        CURP = "YYDB647";
        direccion = "Av. Lopez Num. 786";
        fechaNac = "786/fg/gtr";
    }
    Cliente(String nom, String tel, String dir, String fecha, String C){
        nombre = nom;
        telefono = tel;
        CURP = C;
        direccion = dir;
        fechaNac = fecha;
    }
    public void setNombre(String nom){
        nombre = nom;
    }
    public String getNombre(){
        return nombre;
    }
    public void setCURP(String C){
        CURP = C;
    }
    public String getCURP(){
        return CURP;
    }
    public void setDireccion(String dir){
        direccion = dir;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setFechaNac(String fecha){
        fechaNac = fecha;
    }
    public String getFechaNac(){
        return fechaNac;
    }
    public void setTelefono(String tel){
        telefono = tel;
    }
    public String getTelefono(){
        return telefono;
    }
    
}
