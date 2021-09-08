/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo2;
import java.util.ArrayList;
/**
 * Nobre: Vanessa Melenciano Llamas
 * Tema del programa: Relaciones entre objetos
 * Descripcion: Herencia entre clases
 * Fecha: 19/11/20
 */
public class Test {
    public static void main(String args[]){
        ArrayList<Empleados> emp = new ArrayList();
        
        Mecanico me = new Mecanico("RMP7832", "Juan Luna", "hcbsdj", "hsdch");
        me.agregarTrabajo(1900);
        
        Mecanico me2 = new Mecanico("RMP7832", "Juan Luna", "jhsvxjh", "djsbckj");
        me2.agregarTrabajo(1900);
        
        Vendedor v = new Vendedor("POSAJ4553", "Pancho Lopez", "ahsvxjh", "ashxvjhas");
        v.setComision(6000);
        
        Vendedor v2 = new Vendedor("POSAJ4553", "Pancho Lopez", "dshcvhs", "dhcvhs");
        v2.setComision(6000);
        
        //Administrativo ad = new Administrativo("YOIU872", "Laura Montiel");
        //ad.setSueldoMensual(18000);
        
        //Administrativo ad2 = new Administrativo("YOIU872", "Laura Montiel");
        //ad2.setSueldoMensual(18000);
          emp.add(me);
          emp.add(v);
          //emp.add(ad);
          emp.add(me2);
          emp.add(v2);
          //emp.add(ad);
          
          for(Empleados em: emp){
                  System.out.println(em.toString() + em.calcularQuincena());
          }
    }
}

//parte grafica