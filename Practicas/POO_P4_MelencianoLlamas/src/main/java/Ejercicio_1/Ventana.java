/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;


import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author Vanessa
 */
public class Ventana extends JFrame implements ActionListener{
    //private JLabel calculadora; //lo que dice
    private JLabel numm1; //lo que dice
    private JLabel numm2; //lo que dice
    private JTextField num2;
    private JTextField num1;
    private JButton boton_sumar;
    private JButton boton_restar;
    private JButton boton_multiplicar;
    private JButton boton_dividir;
    private JLabel resultado;
    
    public Ventana(){
        super("Calculadora");
        setSize(500, 260);//tamaño a la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE); //se termine el programa al cerrar la ventana
        setLayout(null);
        
        //Decir numero 1
        numm1 = new JLabel();
        numm1.setText("Primer numero: "); //lo que se va a mostarar
        //poner la ubicación del texto anterior
        numm1.setBounds(25, 20, 200, 30); //posiciona la etiqueta en la ventana
        add(numm1); //para que agregue la etiqueta, si no se pone, no sale la etiqueta en la ventana :(
        //Decir numero 2
        numm2 = new JLabel();
        numm2.setText("Segundo numero: ");
        numm2.setBounds(220, 20, 200, 30);
        add(numm2);
        
        //caja de texto, num1
        num1 = new JTextField();
        num1.setBounds(25, 55, 150, 30);
        add(num1);
        //caja de texto, num2
        num2 = new JTextField();
        num2.setBounds(220, 55, 150, 30);
        add(num2);  //no quiere
        
        //Suma
        boton_sumar = new JButton();
        boton_sumar.setText("Suma");
        boton_sumar.setBounds(20, 100, 100, 25);
        boton_sumar.addActionListener(this); //decirle que el boton es el que va a realizar la accion
        add(boton_sumar);
        //Resta
        boton_restar = new JButton();
        boton_restar.setText("Resta");
        boton_restar.setBounds(125, 100, 100, 25);
        boton_restar.addActionListener(this); //decirle que el boton es el que va a realizar la accion
        add(boton_restar);
        //Multiplicacion
        boton_multiplicar = new JButton();
        boton_multiplicar.setText("Multiplicacion");
        boton_multiplicar.setBounds(230, 100, 120, 25);
        boton_multiplicar.addActionListener(this); //decirle que el boton es el que va a realizar la accion
        add(boton_multiplicar);
        //Division
        boton_dividir = new JButton();
        boton_dividir.setText("Division");
        boton_dividir.setBounds(355, 100, 100, 25);
        boton_dividir.addActionListener(this); //decirle que el boton es el que va a realizar la accion
        add(boton_dividir);
        
        //Resultado
        resultado= new JLabel();
        //resultado.setText("HOLAAAAAA");
        resultado.setBounds(190, 130, 100, 40);
        add(resultado);
            //agregar lo de la caja de texto, en el cuadro anterior
        
        setVisible(true); // para que muestre la ventana // que sea hasta el final del método
    }
    
    public void actionPerformed(ActionEvent e){
        CalculadoraBasica Cal = new CalculadoraBasica();
        double n1, n2;
        try{
            n1 = Double.parseDouble(num1.getText());// pone el texto en mayusculas
            n2 = Double.parseDouble(num2.getText());
        }catch (NumberFormatException ex){
            //JOptionPane.showMessageDialog(null, "Se requieren datos numericos");
            }
    
        
        if(e.getSource()==boton_sumar){ //pregunta si el boton es el que causa la accion
                String r= Double.toString(Cal.sumar(n1, n2));
                resultado.setText(r);
        }
        else if(e.getSource()==boton_multiplicar){ //pregunta si el boton es el que causa la accion
           // double n1 = Double.parseDouble(num1.getText());// pone el texto en mayusculas
           // double n2 = Double.parseDouble(num2.getText());
            String r= Double.toString(Cal.multiplicar(n1, n2));
            resultado.setText(r);
        }
        else if(e.getSource()==boton_dividir){ //pregunta si el boton es el que causa la accion
           // double n1 = Double.parseDouble(num1.getText());// pone el texto en mayusculas
           // double n2 = Double.parseDouble(num2.getText());
            String r= Double.toString(Cal.dividir(n1, n2));
            resultado.setText(r);
        }
        else if(e.getSource()==boton_restar){ //pregunta si el boton es el que causa la accion
           // double n1 = Double.parseDouble(num1.getText());// pone el texto en mayusculas
           // double n2 = Double.parseDouble(num2.getText());
            String r= Double.toString(Cal.restar(n1, n2));
            resultado.setText(r);
        }
    }
    
    public static void main(String args[]){
        Ventana v = new Ventana();
    }
}
