/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 * Nobre: Vanessa Melenciano Llamas
 * Tema del programa: Herencia
 * Descripcion: Relacion entre objetos
 * Fecha: 25/11/20
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

