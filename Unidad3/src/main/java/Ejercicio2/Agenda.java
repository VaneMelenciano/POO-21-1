/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;
import java.util.ArrayList;

/**
 *
 * @author Vanessa
 */
public class Agenda {
   // public Contacto lista[]; //COLECCIONES --ArrayList
    public ArrayList<Contacto> lista; //va almacenar elementos de tipo contacto
//    public int contador=0;
    
    public Agenda(){
        //lista= new Contacto[10];
        lista = new ArrayList();
    }
    public Agenda(int c){
        //lista= new Contacto[c];
        lista = new ArrayList(c);
    }
    public void agregarContacto(String nom, int tc){
        Contacto c = new Contacto(nom, tc);
        //lista[contador] = c;
        //contador++;
        lista.add(c);
    }
    public void agregarContacto(Contacto c[]){
       // lista = c;
       for(int i=0; i<c.length; i++){
           lista.add(c[i]);
       }
    }
    public void eliminarContacto(int indice){
        //lista[indice] = null;
        lista.remove(indice);
    } 
    public void eliminarContacto(String nom, int cel){
        /*for(int i=0; i<lista.length; i++){
            if((lista[i].getNombre())==nom && (lista[i].getCel()==tel)){
                lista[i]=null;
                break;
            }
        }*/
        for(Contacto c:lista){
            if(c.getNombre().equals(nom) && c.getCel()==cel){
                lista.remove(c);
                break;
            }
        }
    }
    public String mostar(){
       /* for(int i=0; i<lista.length; i++){
            if(lista[i]!=null){
                System.out.println("Nombre: " + lista[i].getNombre()+ "     Telefono: " + lista[i].getCel());
            }*/
       String datos = "";
        for(Contacto i: lista){
            if(i !=null){
                datos +="Nombre: " + i.getNombre() +
                        "Direccion: " + i.getDireccion() +
                        "Telefono: " + i.getTel() +
                        "Cel: " + i.getCel() + "/n";
            }
        }
        return datos;
    }
    public static void main(String args[]){
       // Agenda miagenda = new Agenda(5);
//        miagenda.agregarContacto("Eusebio Lopez", 545642);
//        miagenda.agregarContacto("Anastacia Helz", 8237409);
//        miagenda.mostar();
//        miagenda.eliminarContacto(1);
//        miagenda.mostar();
    } 
    
}
