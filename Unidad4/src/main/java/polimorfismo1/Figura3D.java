/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo1;

/**
 *
 * @author Vanessa
 */
public abstract class Figura3D extends Figura{
    public Figura3D(){
    }
    public Figura3D(int color){
        super(color);
    }
    public abstract float calcularVolumen();
}
