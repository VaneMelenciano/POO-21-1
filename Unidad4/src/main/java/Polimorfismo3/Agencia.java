/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo3;
import java.util.ArrayList;
/**
 *
 * @author Vanessa
 */
public class Agencia {
    private ArrayList<Vehiculo> vehiculos;
    int contA, contD, contC, contT;
    public Agencia(){
        vehiculos= new ArrayList();
        contA = 0;
        contD = 0; 
        contC = 0;
        contT = 0;
        
    }
    public void registrarVehiculo(Vehiculo ve){
        if(ve!=null){
            vehiculos.add(ve);
        }
    }
    public Vehiculo busquedaVehiculo(String matricula){
        Vehiculo ve = null;
        for(Vehiculo vehi:vehiculos){
            if(vehi.getMatricula().compareTo(matricula) == 0){ //para comparar dos Strings
                ve = vehi;
                break;
            }
        }
        return ve;
    }
    public void mostrar(){
        for(Vehiculo vehi: vehiculos){
            System.out.print(vehi.toString() + "\n");
        }
    }
    public void contarAutos(){
        for(Vehiculo vehi: vehiculos){
            if(vehi instanceof Auto){
                contA++;
            }
            else if(vehi instanceof Deportivo){
                contD++;
            }
            else if(vehi instanceof Turismo){
                contT++;
            }
            else if(vehi instanceof Camioneta){
                contC++;
            }
        }
    }
    public void setContA(int ca){
        contA=ca;
    }
    public int getContA(){
        return contA;
    }
    public void setContD(int cd){
        contD=cd;
    }
    public int getContD(){
        return contD;
    }
    public void setContT(int ct){
        contT=ct;
    }
    public int getContT(){
        return contT;
    }
    public void setContC(int cc){
        contC=cc;
    }
    public int getContC(){
        return contC;
    }
}
