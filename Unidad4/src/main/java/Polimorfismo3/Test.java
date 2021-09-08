/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo3;

/**
 *
 * @author Vanessa
 */
public class Test {
    public static void main(String args[]){
       Auto a1 = new Auto("RENAULT", "SEDAN", "PMK7754", 8, 4, 5, "pequeño");
       Auto a2 = new Auto("FORD", "MERCURY", "PLE9945", 4, 2, 5, "mediano");
       Auto a3 = new Auto("VW", "GOLF", "PMA1359", 8, 4, 5, "grande");
       Auto a4 = new Auto("NISSAN", "TSURU", "GGN3426", 4, 4, 5, "mediano");
       
       Deportivo d1 = new Deportivo("Nissan", "GT-R", "3WGK019", 6, "mediano", "315 km/h");
       Deportivo d2 = new Deportivo("Lamborghini", "Lamborghini Aventador", "AV8384", 6, "pequeño", "350 km/h");
       Deportivo d3 = new Deportivo("Ferrari", "812 Superfast", "S953FG", 12, "mediano", "340 km/h");
       
       Camioneta c1 = new Camioneta("Volkswagen", "Tiguan 2020", "AEF-717", "426 kg"); 
       Camioneta c2 = new Camioneta("Hyundai Motor Company", "Hyundai Creta", "P4908", "520 a 525 kg");
       Camioneta c3 = new Camioneta("Honda", "Honda CR-V", "CAL280", "450 kg");
       Camioneta c4 = new Camioneta("Lincoln Motor Company", "Lincoln Navigator", "1218XIY", "480 kg");
       Camioneta c5 = new Camioneta("Honda", "Honda Accord", "PP034", "400 kg");
       
       Turismo t1 = new Turismo("Mercedes-Benz ", "Clase E Coupé 2020", "YBU8066", 5, 8);
       Turismo t2 = new Turismo("Shooting Brake", "Porsche Panamera Sport", "UVE3100", 4, 6);
       
       Agencia MiAgencia = new Agencia();
       MiAgencia.registrarVehiculo(a1);
       MiAgencia.registrarVehiculo(a2);
       MiAgencia.registrarVehiculo(a3);
       MiAgencia.registrarVehiculo(a4);
       
       MiAgencia.registrarVehiculo(d1);
       MiAgencia.registrarVehiculo(d2);
       MiAgencia.registrarVehiculo(d3);
       
       MiAgencia.registrarVehiculo(c1);
       MiAgencia.registrarVehiculo(c2);
       MiAgencia.registrarVehiculo(c3);
       MiAgencia.registrarVehiculo(c4);
       MiAgencia.registrarVehiculo(c5);
       
       MiAgencia.registrarVehiculo(t1);
       MiAgencia.registrarVehiculo(t2);
       
       MiAgencia.mostrar();
       
       System.out.println("\n" + MiAgencia.busquedaVehiculo("PP034"));
       MiAgencia.contarAutos();
       System.out.println("\n Hay " + MiAgencia.getContA() + " autos ");
       System.out.println("\n Hay " + MiAgencia.getContD() + " autos deportivos ");
       System.out.println("\n Hay " + MiAgencia.getContA() + " camionetas ");
       System.out.println("\n Hay " + MiAgencia.getContA() + " de turismo ");
       
    }
}
