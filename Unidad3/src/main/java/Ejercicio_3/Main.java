/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

/**
 *
 * @author Vanessa
 */
public class Main {
    public static void main(String args[]){
        RegistroCalificaciones reg = new RegistroCalificaciones(23);
        reg.registroAlumno(2020670173, "Efraín Ibarra Belmonte");
        reg.asignarExamen(2020670173, 90, 1);
        float p[] = {80, 90f, 90, 100};
        float t[] = {90, 90, 90, 90, 90, 90, 90};
        reg.asignarPracticas(2020670173, p, 1);
        reg.asignarTareas(2020670173, t, 1);
        System.out.println(reg.getMisAlumnos()[0].getDep1().calificarDepartamental());
    }
}
