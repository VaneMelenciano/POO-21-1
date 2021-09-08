/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4_Herncia;

/**
 *
 * @author Vanessa
 */
public class Docente extends EmpleadoUPIIZ{ // señala de que clase hereda
    private String academia;
    private String materias[];
    
    public Docente(){ // de forma implicita, manda llamar al constructor por defecto a la clase empleado
        //si no se pone super, toma el constructor por defecto del padre ( el que no recibe paramentros)
    }
    public Docente(String ac, String mat[]){
        academia=ac;
        materias=mat;
    }
    public Docente(String ac){
        academia = ac;
    }
    public Docente(String nom, int ne){
        super(nom, ne);//mandamos llamar al constructor de empleado, que recibe 2 paramentros
    }
    
    public void setAcademia(String ac){
        academia = ac;
    }
    public String getAcademia(){
        return academia;
    }
    public void setMaterias(String mat[]){
        materias = mat;
    }
    public String[] getMaterias(){
        return materias;
    }
    public String mostrar(){
        return "nombre " + getNombre() + "\t NoEmpleado: " + getNoEmpleado()+ "\t Academia: " + getAcademia() + "\t Materias: " + getMaterias();
    }
}
