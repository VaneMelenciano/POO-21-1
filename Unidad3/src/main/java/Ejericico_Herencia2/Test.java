/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejericico_Herencia2;

/**
 * Nobre: Vanessa Melenciano Llamas
 * Tema del programa: Relaciones entre objetos
 * Descripcion: Herencia entre clases
 * Fecha: 19/11/20
 */
public class Test {
    public static void main(String args[]){
        //Empleados em = new Empleados();
        //System.out.println(em.calcularQuincena());
        
        Mecanico me = new Mecanico("RMP7832", "Juan Luna");
        me.agregarTrabajo(1900);
        me.agregarTrabajo(400);
        me.agregarTrabajo(983);
        me.agregarTrabajo(890);
        System.out.println("Salario quincenal del mecanico: "+me.calcularQuincena());
        
        Vendedor v = new Vendedor("POSAJ4553", "Pancho Lopez");
        v.setComision(6000);
        v.setSalarioMinimo(16000);
        System.out.println("Salario quincenal del vendedor: "+v.calcularQuincena());
        
        Administrativo ad = new Administrativo("YOIU872", "Laura Montiel");
        ad.setSueldoMensual(18000);
        System.out.println("Salario quincenal del administrativo: "+ad.calcularQuincena());
        
    }
}
