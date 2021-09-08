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
public class RegistroCalificaciones {
    private Estudiante misalumnos[];
    
    public RegistroCalificaciones(){
        misalumnos = new Estudiante[23];
    }
    public RegistroCalificaciones(int c){
        misalumnos = new Estudiante[c];
    }
    public void registroAlumno(int mat, String nom){
        Estudiante est = new Estudiante(mat, nom);
        for(int i=0; i<misalumnos.length; i++){
            if(misalumnos[i]==null){
                misalumnos[i]=est;
                break;
            }
        }
    }
    public void registroAlumno(Estudiante e){
        for(int i=0; i< misalumnos.length; i++){
            if(misalumnos[i]==null){
                misalumnos[i]=e;
                break;
            }
        }
    }
    public void asignarExamen(int matr, float exam, int d){
        for(Estudiante est: misalumnos){
            if(est.getMatricula()==matr){
                est.registarExamen(exam, d);
                break;
            }
        }
    }
    public void asignarPracticas(int matr, float p[], int d){
        for(Estudiante est: misalumnos){
            if(est.getMatricula()==matr){
                est.registrarPracticas(p, d);
                break;
            }
        }
    }
    public void asignarTareas(int matr, float t[], int d){
        for(Estudiante est: misalumnos){
            if(est.getMatricula()==matr){
                est.registrarTareas(t, d);
                break;
            }
        }
    }
    public Estudiante[] getMisAlumnos(){
        return misalumnos;
    }
    
}
