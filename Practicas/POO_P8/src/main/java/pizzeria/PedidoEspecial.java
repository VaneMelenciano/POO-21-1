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
public class PedidoEspecial extends Pedido{
    private String refresco;
    private int papasGajo;
    private float refrescoPrecio, papasPrecio;
    public PedidoEspecial(){
        super();
        refrescoPrecio=0;
        papasPrecio=0;
    }
    public PedidoEspecial(String r, float rp, int pg, float pp, Cliente c, String f, int no, Pizza p[]){
        super(c, f, no, p);
        refresco = r;
        papasGajo = pg;
        refrescoPrecio=rp;
        papasPrecio=pp;
    }
    public void setRefresco (String r){
        refresco = r;
    }
    public String getRefresco(){
        return refresco ;
    }
    public void setPapasGajo (int pg){
        papasGajo = pg;
    }
    public int getPapasGajo(){
        return papasGajo ;
    }
    public void setPapasPrecio (float pg){
        papasPrecio = pg;
    }
    public float getPapasPrecio(){
        return papasPrecio ;
    }
    public void setRefrescoPrecio (float pg){
        refrescoPrecio = pg;
    }
    public float getRefrescoPrecio(){
        return refrescoPrecio ;
    }
    @Override
    public float CalcularTotal(){
        float total=0;
        for(Pizza pi:pizzas){
            total+=pi.getPrecio();
        }
        total+= refrescoPrecio + papasPrecio;
        return total;
    }
}
