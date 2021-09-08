/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperAgenda86;
import java.util.ArrayList;

/**
 * Nobre: Vanessa Melenciano Llamas
 * Tema del programa: Herencia multiple
 * Descripcion: herencia simple e interfaces de usuario
 * Fecha: 02/12/20
 */
public class Agenda {
    public ArrayList<Contacto> lista;
    
    public Agenda(){
        lista = new ArrayList();
    }
    public Agenda(int c){
        lista = new ArrayList(c);
    }
    public void agregarContacto(String nom, String dir, int tc, int ce){
        Contacto c = new Contacto(nom, dir, tc, ce);
        lista.add(c);
    }
    public void agregarContacto(Contacto cont){
           if(cont.getTel() != 0 && cont.getCel() != 0 && cont.getNombre() != ""){
               lista.add(cont);
           }
       
    }
    public void eliminarContacto(int indice){
        lista.remove(indice);
    } 
    public void eliminarContacto(String nom, int cel){
        for(Contacto c:lista){
            if(c.getNombre().equals(nom) && c.getCel()==cel){
                lista.remove(c);
                break;
            }
        }
    }
    public String mostar(){
       String datos = "";
        for(Contacto i: lista){
            if(i !=null){
                datos +="Nombre: " + i.getNombre() +
                        "    Direccion: " + i.getDireccion() +
                        "\n    Telefono: " + i.getTel() +
                        "    Cel: " + i.getCel() + " \n\n";
            }
        }
        return datos;
    }
    
}
