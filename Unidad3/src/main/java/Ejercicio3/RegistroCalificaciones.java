/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;
import java.util.ArrayList;

/**
 *
 * @author Vanessa
 */
public class RegistroCalificaciones {
    public ArrayList<Departamental> lista; //va almacenar elementos de tipo contacto
    
    public RegistroCalificaciones(){
        lista = new ArrayList();
    }
    
    public RegistroCalificaciones(int c){
        lista = new ArrayList(c);
    }
    
    public void agregarContacto(float e, float p1, float p2, float p3, float p4, float t1, float t2, float t3, float t4, float t5, float t6, float t7){
        Departamental d = new Departamental(e, p1, p2, p3, p4, t1, t2, t3, t4, t5, t6, t7);
        lista.add(d);
    }
   // public void agregarContacto()
}
