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
public class TestFiguras {
    //POLIMORFISMO
    public static void dibuja(Figura fig){ //metodo que permite hacer el polmorfismo
       fig.dibujar(); //es un metodo polimorfico, dependiendo del objeto que se trate, se implementa el metodo correcto en cada clase
    }
    public static void main(String args[]){
        Esfera esf = new Esfera(5); //enlace estatico
        System.out.println(esf.toString());
//        esf.dibujar();
        //enlace estatico //asignacion de manera directa de una variable y su valor, de un metodo que realiza una funcion en concreto
//        TestFiguras.dibuja(esf);
        Esfera esf2 = new Esfera(8);
        System.out.println(esf.toString());
//        TestFiguras.dibuja(esf2);
//        System.out.println("El volumen es: " + esf.calcularVolumen());
//        esf.setColor(1);
//        esf.setGrosorBorde(3);
//        esf.setNombre("Estrella de la muerte");
//        
        Cubo c = new Cubo(7);
        System.out.println(esf.toString());
//        TestFiguras.dibuja(c);
        Cubo cubito = new Cubo(11);
        System.out.println(cubito.toString());
//        TestFiguras.dibuja(cubito);
        Cuadrado cua = new Cuadrado(6);
        System.out.println(cua.toString());
//        System.out.println("El volumen es: " + cu.calcularVolumen());
//        System.out.println("Area superficil: " +cu.calcularAreaSuperficial());
//        cu.setColor(2);
//        cu.setGrosorBorde(4);
//        cu.setNombre("Cubo");
//        
//        Piramide p = new Piramide(7, 8);
//        System.out.println("El volumen es: " + p.calcularVolumen());
//        p.setColor(2);
//        p.setGrosorBorde(4);
//        p.setNombre("Cubo");
        
        //casteo hacia arriba
        /*Figura f = (Figura)cu;
        Figura3D f3d = (Figura3D)cu;*/
        
        
    }
}
