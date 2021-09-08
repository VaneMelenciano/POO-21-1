/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzeria;

/**
 *
 * @author Vanessa
 */
public abstract class Pedido {
    protected Cliente cliente;
    protected String fecha;
    protected int no_orden;
    protected Pizza pizzas[];
    
    public Pedido(){
        
    }
    public Pedido(Cliente c, String f, int no, Pizza[] p){
        cliente = c;
        fecha = f;
        no_orden = no;
        pizzas = p;
    }
    public void setCliente(Cliente c){
        cliente = c;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public void setFecha(String f){
        fecha = f;
    }
    public String getFecha(){
        return fecha;
    }
    public void setNoOrden(int no){
        no_orden = no;
    }
    public int getNoOrden(){
        return no_orden;
    }
    public void setPizzas(Pizza p[]){
        pizzas = p;
    }
    public Pizza[] getPizzas(){
        return pizzas;
    }
    public abstract float CalcularTotal();
}
