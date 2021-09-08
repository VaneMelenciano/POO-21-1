/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vanessa
 */
import java.util.*;
public class Ejercicio2{
	public static void Main (String[] args){
		Scanner reader = new Scanner(System.in);
		int n1;
		int n2;
		int suma;
		
		System.out.println("Ingrese el 1er numero: ");
		n1=reader.nextInt();

		System.out.println("Ingrese el 2do numero: ");
		n2=reader.nextInt();

		suma = n1 + n2;

		System.out.println("suma de " + n1 + " y " + n2 + " es " + suma);
		System.exit(0);
	}
}