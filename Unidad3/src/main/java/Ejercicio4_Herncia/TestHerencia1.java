/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4_Herncia;

/**
 *
 * @author Vanessa
 */
public class TestHerencia1 extends Object{
    public static void main (String ags[]){
        EmpleadoUPIIZ em = new EmpleadoUPIIZ("Pancha Perez", 3542);
        System.out.println("Empleaodo: " + em.getNombre());
        
        Docente doc = new Docente();
        doc.setNombre("Juancho Lopez");
        doc.setAcademia("Computacion");
        doc.setNoEmpleado(4623);
        //doc.setMaterias("POO");
        //System.out.println("Docente: " + doc.getNombre());
        System.out.println("\nDocente\n " + doc.mostrar());
        
        TecnicoDocente TD = new TecnicoDocente();
        TD.setNombre("Juancho Lopez");
        TD.setLab(4);
        TD.setNoEmpleado(4623);
//        try{
//        TD.wait(1000);
//        }catch(InterruptedException e){}
        System.out.println("\n Tecnico\n "+TD.mostrar());
        
        ///Comparar dos clases:
        //System.out.println(em.equels(doc));
        ///Mustra la clase padre, y el codigo a
        //System.out.println(em.toString());
        ///Clase a la que pertenece un objeto
        //System.out.println(
        
        
        
        //entre dos
        //personal mecanico: 
    }
}
