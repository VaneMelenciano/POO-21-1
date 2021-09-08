/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Vanessa
 */
//import java.util.Scanner;
import java.util.Scanner;

public class PruebaAcceso {
    public static void main(String arg[]){
    }
    
    public static Scanner scan = new Scanner(System.in);
    
    public static int solicitarEntero(){    
        System.out.println("Ingrese un valor entero: ");
        int val = scan.nextInt();
        return val;
    }
    public static float solicitarFlotante(){    
        System.out.println("Ingrese un valor flotante: ");
        float val = scan.nextFloat();
        return val;
    }
    public static String solicitarString(){    
        System.out.println("Ingrese un valor String: ");
        String val = scan.next();
        return val;
    }
    public static double solicitarDouble(){    
        System.out.println("Ingrese un valor Double: ");
        double val = scan.nextDouble();
        return val;
    }
}
