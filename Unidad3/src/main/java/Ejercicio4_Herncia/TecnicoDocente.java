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
public class TecnicoDocente extends EmpleadoUPIIZ{
    private int laboratorio;
    public TecnicoDocente(){
    }
    public TecnicoDocente(int lab){
        laboratorio = lab;
    }
    public TecnicoDocente(String nom, int ne){
        super(nom, ne);//mandamos llamar al constructor de empleado, que recibe 2 paramentros
    }
    public void setLab(int lab){
        laboratorio = lab;
    }
    public int getLab(){
        return laboratorio;
    }
    public String mostrar(){
        return "nombre " + getNombre() + "\t NoEmpleado: " + getNoEmpleado()+ "\t Lboratorio: " + getLab();
    }
}
