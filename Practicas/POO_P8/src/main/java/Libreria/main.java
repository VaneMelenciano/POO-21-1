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
public class main {
    public static void main(String args[]){
        Libreria MiLibreria = new Libreria();
        
        Libro MiLibro1 = new Libro("Antón Chéjov","Los mejores cuentos");
        Libro MiLibro2 = new Libro("Nicholas Sparks","Un paseo para recordar");
        Libro MiLibro3 = new Libro("Young","La cabaña");
        
        Revista MiRevista1 = new Revista(23, "Investigación y Ciencia");
        Revista MiRevista2 = new Revista(25, "Mente y Cerebro");
        Revista MiRevista3 = new Revista(29, "Temas IyC");

        MiLibreria.agregarTitulo(MiLibro1);
        MiLibreria.agregarTitulo(MiLibro2);
        MiLibreria.agregarTitulo(MiLibro3);
        MiLibreria.agregarTitulo(MiRevista1);
        MiLibreria.agregarTitulo(MiRevista2);
        MiLibreria.agregarTitulo(MiRevista3);
        
        MiLibreria.listaTitulos();
        
        System.out.println( "\n" + MiLibreria.buscarPorNombre("Investigación y Ciencia"));
        System.out.println( "\n" + MiLibreria.buscarPorNombre("La cabaña"));
        
        MiLibreria.retirarTitulo(MiLibro2);
        MiLibreria.listaTitulos();
    }
}
