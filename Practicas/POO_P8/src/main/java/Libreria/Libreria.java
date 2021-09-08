/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;
import java.util.ArrayList;

/**
 *
 * @author Vanessa
 */
public class Libreria {
    public ArrayList<Titulo> todosLosTitulos;
    
    public Libreria(){
        todosLosTitulos = new ArrayList();
    }
    public void agregarTitulo(Titulo titulo){
        /*if(titulo instanceof Revista){        
            Revista revista = new Revista();
            titulo = (Titulo)revista;
            todosLosTitulos.add(revista);
        }
        else{
            Libro libro = new Libro();
            titulo = (Titulo)libro;*/
            todosLosTitulos.add(titulo);
        //}
        
    }
    public void retirarTitulo(Titulo titulo){
        for(Titulo t:todosLosTitulos){
            if(t.leerNombre().equals(titulo)){
                todosLosTitulos.remove(t);
                break;
            }
        }
    }
    public String buscarPorNombre(String nombre){
        String tit = "";
        for(Titulo t:todosLosTitulos){
            if(t.leerNombre().equals(nombre)){
                    tit+= t.dameDescripcion();
            } 
        }
        return tit;
    }
    public void listaTitulos(){
        String datos = "";
        for(Titulo t: todosLosTitulos){
                System.out.println("\n" + t.dameDescripcion() + "\n");
        }
    }
}
