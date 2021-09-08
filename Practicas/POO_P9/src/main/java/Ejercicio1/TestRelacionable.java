/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Vanessa
 */
public class TestRelacionable {
    
    public static void main(String args[]){
      Relacionable[] array = new Relacionable[4];
      
      array[0] = new Linea(2, 2, 4, 1);
      array[1] = new Linea(5, 3, 1, 3);
      array[2] = new Fraccion(3, 8);
      array[3] = new Fraccion(7, 5);
      
      for(Relacionable r: array){          
          System.out.println(r.ToString());
      }
    }
}
