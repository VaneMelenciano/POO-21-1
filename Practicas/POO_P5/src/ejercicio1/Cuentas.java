/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.ArrayList;

/**
 * Nobre: Vanessa Melenciano Llamas
 * Tema del programa: Relaciones entre objetos
 * Descripcion: Relacion entre objetos del mismo tipo
 * Fecha: 03/10/20
 */
public class Cuentas {
    public String cliente;
    public float saldo;
    public ArrayList<String> movimientos;
    
    Cuentas(){
        movimientos = new ArrayList();
        saldo=89768;
    }
    Cuentas(String clien, float sal){
        movimientos = new ArrayList();
        cliente = clien;
        saldo=sal;
    }
    Cuentas(String clien){
        movimientos = new ArrayList();
        cliente = clien;
        saldo=56984;
    }
    public void setCliente(String clie){
        cliente = clie;
    }
    public String getCliente(){
        return cliente;
    }
    public void setSaldo(float sal){
        saldo = sal;
    }
    public float getSaldo(){
        return saldo;
    }
    public void deposito(float cantidad){
        saldo+=cantidad;
        String mov = "Deposito de " + cantidad;
        movimientos.add(mov); 
    }
    public void retiro(float cantidad){
        saldo-=cantidad;
        String mov ="Retiro de " + cantidad;
        movimientos.add(mov); 
    }
    public ArrayList<String> movimiento(){
        return movimientos;
    }
    
}
