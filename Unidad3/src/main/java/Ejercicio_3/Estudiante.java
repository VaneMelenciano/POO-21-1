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
public class Estudiante {
    private int matricula;
    private String nombre;
    private Departamental dep1, dep2, dep3;
    
    public Estudiante(int mat, String nom){
        matricula = mat;
        nombre = nom;
        dep1 = new Departamental();
        dep2 = new Departamental();
        dep3 = new Departamental();
    }
    public void registarExamen(float e, int d){
        if(d==1){
            dep1.setExamen(e);
        }
        else if(d==2){
            dep2.setExamen(e);
        }
        else if(d==3){
            dep1.setExamen(e);
        }else{}
    }
    public void registrarPracticas(float p[], int d){
        if(d==1){
            dep1.setPracticas(p);
        }
        else if(d==2){
            dep2.setPracticas(p);
        }
        else if(d==3){
            dep1.setPracticas(p);
        }else{}
    }
    public void registrarTareas(float t[], int d){
        if(d==1){
            dep1.setTareas(t);
        }
        else if(d==2){
            dep2.setTareas(t);
        }
        else if(d==3){
            dep1.setTareas(t);
        }else{}
    }
    public float calcularFinal(){
        return (dep1.calificarDepartamental()*30/100)+(dep2.calificarDepartamental()*30/100)+(dep3.calificarDepartamental()*40/100);
    }
    public int getMatricula(){
        return matricula;
    }
    public Departamental getDep1(){
        return dep1;
    }
}
