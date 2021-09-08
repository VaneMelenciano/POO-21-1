/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Herencia4;

/**
 *
 * @author Vanessa
 */
/*
SOLO PERMITE METODOS ABSTRACTOS
NO PODEMOS PONER ATRIBUTOS
SI SE PUEDE PONER CONSTANTES
NO PODEMOS PONER CONTRUSTORES
*/
public interface Comparable {
    public boolean esMayorque(Fraccion f);
    public boolean esMenorque(Fraccion f);
    public boolean esIgual(Fraccion f);
    
    
}
