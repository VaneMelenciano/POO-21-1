/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Vanessa
 */
public class Departamental {
    public float examen;
    private float[] practicas; //4
    private float practica = 0;
    private float[] tareas; //7
    private float tarea = 0;
    
    public Departamental(){
        
    }
    public Departamental(float e, float[] p, float[] t){
        practicas = p;
        tareas = t;
        examen = e;
    }
    public Departamental(float e, float p1, float p2, float p3, float p4, float t1, float t2, float t3, float t4, float t5, float t6, float t7){
      int i = 0, j=0;
      examen = e;
      practicas[j] = p1; j++;
      practicas[j] = p2; j++;
      practicas[j] = p3; j++;
      practicas[j] = p4; j++;
      tareas[i]= t1; i++;
      tareas[i]= t2; i++;
      tareas[i]= t3; i++;
      tareas[i]= t4; i++;
      tareas[i]= t5; i++;
      tareas[i]= t6; i++;
      tareas[i]= t7; i++;
    }
    public void setExamen(float exa){
        examen = exa;
    }
    public float getExamen(){
        return examen;
    }
    
    public void setPracticas(float[] prac){
        practicas = prac;
    }
    public void setPracticas(float p1, float p2, float p3, float p4){
        int j=0;
      practicas[j] = p1; j++;
      practicas[j] = p2; j++;
      practicas[j] = p3; j++;
      practicas[j] = p4; j++;
    }
    public void calcularPracticas(){
        for(int i=0; i<3; i++){
            practica+=practicas[i];
        }
        practica/=4;
    }
    public float getPractica(){
        return practica;
    }
   
    public void setTareas(float[] tar){
        tareas = tar;
    }
    public void setTareas(float t1, float t2, float t3, float t4, float t5, float t6, float t7){
        int i=0;
      tareas[i]= t1; i++;
      tareas[i]= t2; i++;
      tareas[i]= t3; i++;
      tareas[i]= t4; i++;
      tareas[i]= t5; i++;
      tareas[i]= t6; i++;
      tareas[i]= t7; i++;
    }
    public void calcularTarea(){
        for(int i=0; i<3; i++){
            tarea+=tareas[i];
        }
        tarea/=7;
    }
    public float getTarea(){
        return tarea;
    }
}
