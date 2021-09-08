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
public class Esfera extends Figura3D{
    private float radio;
    public Esfera(){
    }
    public Esfera(float r){
        radio=r;
    }
    @Override
    public float calcularVolumen(){
        float f=0;
        f=(float)((4/3 )*Math.PI*Math.pow(radio, 3));
        return f;
    }
    @Override
    public void dibujar(){
        System.out.println("O");
    }
    public String toString(){
        return super.toString() + "\n radio: "+ radio;
    }
}
