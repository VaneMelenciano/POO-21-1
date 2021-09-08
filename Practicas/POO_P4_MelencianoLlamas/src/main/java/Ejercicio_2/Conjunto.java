/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

/**
 *
 * @author Vanessa
 */
public class Conjunto {
    private int[] datos;
    
    public Conjunto(){
        datos=new int[10];
    }
    public Conjunto(int[] a){
        datos = a;
    }
    public Conjunto(char[] a){
        datos = new int[a.length];
        for(int i=0; i<datos.length; i++){
            datos[i]=a[i];
        }
    }
    public Conjunto(byte[] nums){
        datos = new int[nums.length];
        for(int i=0; i<datos.length; i++){
            datos[i]=nums[i];
        }
    }
    public void mostrar(){
       for(int i=0; i<datos.length; i++){
            System.out.println (datos[i]);
        } 
    }
    public void mostrar(int[]d){
       for(int i=0; i<d.length; i++){
            System.out.println (d[i]);
        } 
       System.out.println();
    }
    public int[] sacarRango(int n1){ //muestra datos desde 0 hasta n1
        int arr[]=null;
        if(n1>0 && n1<= datos.length){
            arr = new int [n1];
            for(int i=0; i<n1; i++){
                 arr[i]=datos[i];
            }
        }
        return arr;
    }
    public int[] sacarRango(int n1, int n2){ // empieza a mostrar desde n1 hasta n2
        int arr[]=null;
        if(n1>=0 && n1< datos.length && n2>0 
                && n2<=datos.length && n2>n1){
            int lon; //posición
            lon = n2+1;
            int lonArr = n2-n1+1; //lugares en el arreglo
            arr = new int [lonArr]; 
            int i,j=0;
            
            for(i=n1; i<lon; i++){
                arr[j]=datos[i];
                j++;
            }
        }
        return arr;
    }
    public int[] sacarRango(int n1, int n2, int n3){ //n1=inicio, n2=inicio, y n3=factor a multimplicar ejemplo: desde 3 a 7 = (4, 5, 6, 7, 9) = 4*3, 5*3, 5*3, 6*3, 7*3, 9*3
        int arr[]=null;
        if(n1>=0 && n1< datos.length && n2>0 
                && n2<=datos.length && n2>n1){
            int lon; 
            lon = n2+1;
            int lonArr = n2-n1+1;
            arr = new int [lonArr]; 
            int i,j=0; 
            for(i=n1; i<lon; i++){
                arr[j]=(n3)*(datos[i]);
                j++;
            }
        }
        return arr;
    }
    public static void main(String arg[]){
        Conjunto c1 = new Conjunto();
        c1.mostrar();
        
        int[] enteros = {1, 11, 45, 82, 77, 40, 89, 23};
        Conjunto c2 = new Conjunto(enteros);
        c2.mostrar();
        c2.mostrar(c2.sacarRango(3));
        c2.mostrar(c2.sacarRango(1, 7));
        c2.mostrar(c2.sacarRango(2, 5, 6));
        
        char[] chares = {'a', 'e', 'i', 'o', 'u'};
        Conjunto c3 = new Conjunto(chares);
        c3.mostrar();
        c3.mostrar(c3.sacarRango(2));
        c3.mostrar(c3.sacarRango(2, 4));
        c3.mostrar(c3.sacarRango(0, 3, 7));
        
        byte[] bytes = {1, 3, 5, 7, 9, 8, 98, 87};
        Conjunto c4 = new Conjunto(bytes);
        c4.mostrar(c4.sacarRango(5));
        c4.mostrar(c4.sacarRango(1, 3));
        c4.mostrar(c4.sacarRango(2, 4, 3));
    }
    
}
