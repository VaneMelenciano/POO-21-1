/// Ejercicio 5
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Vanessa
 */

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Hora(){}

    Hora(int h, int m, int s){
        cambiarHora(h);
        cambiarMinuto(m);
        cambiarSegundo(s);
    }

    void cambiarHora(int h){
        if(h>=0 && h<24){
            hora = h;
        }else{
            hora=0;
        }
    }
    void cambiarMinuto(int m){
        if(m>=0 && m<60){
                minuto = m;
            }else{
                minuto=0;
            }
    }
    void cambiarSegundo(int s){
        if(s>=0 && s<60){
                segundo = s;
            }else{
                segundo=0;
            }
    }
    int devolverHora(){
        return hora;
    }
    int devolverMinuto(){
        return minuto;
    }
    int devolverSegundo(){
        return segundo;
    }
    void cambiarHora(int h, int m, int s){
        cambiarHora(12);
        cambiarMinuto(21);
        cambiarSegundo(44);
    }
    /*void mostrarHora(){
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }*/
    String mostrar(){
        return hora+":"+minuto+":"+segundo;
    }
    public static void main(String []args){
        //convertir de string a entero
          
        /*int h=Integer.parseInt(args[0]);
        int m=Integer.parseInt(args[1]);
        int s=Integer.parseInt(args[2]);*/

        Hora h=new Hora(13, 05, 13);
        System.out.println(h.mostrar());
        h.cambiarHora(230);

        //Hora h1 = new Hora();
        //h1.cambiarHora();
        //h1.mostrar();
    }
    
}
