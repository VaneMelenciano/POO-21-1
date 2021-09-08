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
public class Departamental {
    private float examen;
    private float practicas[];
    private float tareas[];
    
    public Departamental(){
        practicas = new float[4];
        tareas = new float[7];
    }
    public Departamental(float e, float p[], float t[]){
        examen = e;
        practicas = p;
        tareas = t;
    }
    public float sumarTareas(){
        float tarea = 0;
        for(float dato: tareas){
            tarea+=dato;
        }
        return tarea/7;
    }
    public float sumarPracticas(){
        float pract = 0;
        for(float dato: practicas){
            pract+=pract;
        }
        return pract/4;
    }
    public float calificarDepartamental(){
        float calif = 0;
        calif = (examen*40/100)+(sumarPracticas()*40/100)+(sumarTareas()*20/100);
        return calif;
    }
    public void setExamen(float e){
        examen = e;
    }
    public float getExamen(){
        return examen;
    }
    public void setTareas(float t[]){
        tareas = t;
    }
    public float[] getTareas(){
       return tareas;
    }
    public void setPracticas(float p[]){
        practicas = p;
    }
    public float[] getPracticas(){
       return practicas;
    }
    
    
}
