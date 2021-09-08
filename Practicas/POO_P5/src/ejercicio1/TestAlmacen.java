/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 * Nobre: Vanessa Melenciano Llamas
 * Tema del programa: Relaciones entre objetos
 * Descripcion: Relacion entre objetos del mismo tipo
 * Fecha: 03/10/20
 */
public class TestAlmacen {
    public static void main(String args[]){
        Almacen alm = new Almacen("789638A", "Avenida Lopez Velarde, Numero 34A", "Pancho Perez");
        alm.agregarCliente("Maria Mendoza Salazar", "492-182-24-34", "REVOLUCION MEXICANA 60, EJIDAL , GUADALUPE , ZAC", "13/11/1997", "MESM971113MZSNLR00");
        alm.agregarCliente("Mario Rodarte de la Rosa", "(493)932-1570", "OLIVO 206, CENTRO , FRESNILLO , ZAC , C.P.99000", "18/01/1995", "RORM950118HZSSSR02");
        alm.agregarCliente("Sonia Solis Perez", "( 492) 924 2795", "CLL TRAFICO 113, CENTRO , ZACATECAS , ZAC , C.P.98000", "31/01/1997", "SOPS970131MZSLRN07");
        alm.agregarCliente("Sebastian Trejo Gonzales", "( 492) 768 1216", "CALLE TRANSITO PESADO 16, CENTRO , ZACATECAS , ZAC ,", "19/01/1989", "TEGS890119HZSRNB03");
        alm.agregarCliente("Ana Balderas Mejia", "(492)927-7180", "REVOLUCION MEXICANA 60, EJIDAL , GUADALUPE , ZAC ,", "21/08/1986", "BAMA860821MZSLJN01");
        System.out.println("Saldo actual: " + alm.saldo());
        alm.retirar(11800);
        alm.abonos(1350);
        alm.mostrar();
        alm.movimientos();
    }
}
