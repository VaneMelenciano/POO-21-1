/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Herencia3;

/**
 *
 * @author Vanessa
 */
public abstract class Figura2D extends Figura{
    public Figura2D(){
    }
    public Figura2D(int color){
        super(color);
    }
    public abstract float calcularArea();
    public abstract float calcularPerimetro();
}
