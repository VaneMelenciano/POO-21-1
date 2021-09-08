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
public class PedidoNormal extends Pedido{
    public PedidoNormal(){
        super();
    }
    public PedidoNormal(Cliente c, String f, int no, Pizza[] p){
        super(c, f, no, p);
    }
    @Override
    public float CalcularTotal(){
        float total=0;
        for(Pizza pi:pizzas){
            total+=pi.getPrecio();
        }
        return total;
    }
}
