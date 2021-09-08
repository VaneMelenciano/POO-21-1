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
public class main {
    public static void main(String args[]){
        Cliente c = new Cliente("Pancha Perez", "Calle aguilas #56 D");
        String ingredientes[] = {"queso", "mostaza", "champiñones"};
        String ingredientes2[] = {"queso", "tomate", "piña"};
        Pizza p1 = new Pizza("original", ingredientes, "grande", 230);
        Pizza p2 = new Pizza("hawaiana", ingredientes2, "chica", 160);
        Pizza pizzas[] = {p1, p2};
        PedidoEspecial MiPedido = new PedidoEspecial("manzanita", 20, 2, 26, c, "11-01-21", 546, pizzas);
        System.out.println( MiPedido.CalcularTotal());
    }
}
