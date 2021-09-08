/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vanessa
 */
import javax.swing.JOptionPane; 
public class CuadroDialogo{
	public static void main(String args[]){
		String nombre =  JOptionPane.showInputDialog("Escribe tu nombre");
		JOptionPane.showMessageDialog(null, "Hola "+nombre.toUpperCase()+" Bienvenido a NetBeans");
	}
}
