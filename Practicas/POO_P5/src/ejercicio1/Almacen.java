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
public class Almacen {
    public ArrayList<Cliente> clientesList;
    public Cuentas cuenta;
    public String clave;
    public String direccion;
    public String encargado;
    
    Almacen(){
       clientesList = new ArrayList();
       cuenta = new Cuentas("Mariano Perea", 89278);
    }
    Almacen(ArrayList<Cliente> clien, Cuentas cuent, String clav, String dir, String nom){
        clientesList = new ArrayList();
        clientesList = clien;
        cuenta = cuent;
        clave = clav;
        direccion = dir;
        encargado = nom;
    } 
    Almacen(String clav, String dir, String nom){
        clientesList = new ArrayList();
        clave = clav;
        direccion = dir;
        encargado = nom;
        cuenta = new Cuentas("Mariano Perea", 89278);
    }
    public void setClientes(ArrayList<Cliente> cli){
        clientesList = cli;
    }
    public ArrayList<Cliente> getClientes(){
        return clientesList;
    }
    public void setCuenta (Cuentas cuent){
        cuenta = cuent;
    }
    public void setCuenta(float saldo){
        cuenta = new Cuentas("Mariano Perea", saldo);
    }
    public void setCuenta(){
        cuenta = new Cuentas("Mariano Perea", 89278);
    }
    public Cuentas getCuenta(){
        return cuenta;
    }
    public void setDireccion (String dir){
        direccion = dir;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setEncargado (String encargadoNom){
        encargado = encargadoNom;
    }
    public String getEncargado(){
        return encargado;
    }
    
    public void agregarCliente(String no, String te, String di, String fechaN, String CU){
        Cliente clientt = new Cliente(no, te, di, fechaN, CU);
        clientesList.add(clientt);
    }
    
    public void eliminarCliente(int indice){
        clientesList.remove(indice);
        
    }
    public void eliminarCliente(String nom, String CU){
        for(Cliente c:clientesList){
            if(c.getNombre().equals(nom) && c.getCURP().equals(CU)){
                clientesList.remove(c);
                break;
            }
        }
    }
    public void mostrar(){
        System.out.println("\n");
        for(int i=0; i<clientesList.size(); i++){
           if(clientesList.get(i) !=null){
                System.out.println("Nombre: " + clientesList.get(i).getNombre() + "   CURP:  " + clientesList.get(i).getCURP() + "   Direccion:  " + clientesList.get(i).getDireccion());
                System.out.println("      Fecha de nacimiento: " + clientesList.get(i).getFechaNac() + "    Telefono:  " + clientesList.get(i).getTelefono());
            } 
        }
    }
    public void abonos(int c){
        cuenta.deposito(c);
        System.out.println("\nSe ha depositado " + c + " a la cuenta");
        System.out.println("Saldo actual: " + saldo());
    }
    public void retirar(float c){  
        cuenta.retiro(c);
        System.out.println("\nSe ha retirados " + c + " de la cuenta");
        System.out.println("Saldo actual: " + saldo());
    }
    public float saldo(){
        return cuenta.getSaldo();
    }
    public void movimientos(){
        System.out.println("\n ---- Movimientos ---- ");
        for(int i=0; i<cuenta.movimientos.size(); i++){
            if(cuenta.movimientos.get(i) !=null){
                System.out.println(cuenta.movimientos.get(i));
            }
        }
        System.out.println("Saldo actual: " + saldo());
    }
}

