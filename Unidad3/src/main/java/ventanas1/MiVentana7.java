/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas1;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Set;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
//no se clean objetos de interfaces
/**
 *
 * @author Vanessa
 * CLASES INTERNAS ANONIMAS
 * MANEJO DE OTRA VENTANA
 */
public class MiVentana7 extends JFrame{
    //private JFrame ventana;
    private JLabel etiqueta; //lo que dice
    private JTextField cajatexto;
    private JButton boton, boton2;
    private JLabel etiqueta2;
    
    public MiVentana7(){
        super("Mi ventana 1"); //le pone titulo a la ventana
        setSize(300, 200);//tamaño a la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE); //se termine el programa al cerrar la ventana
        //definir el Latout en null
        setLayout(null);
        //CREAR COMPONENTES
            //el texto que aparece
        etiqueta = new JLabel();
        etiqueta.setText("Introduce texto: "); //lo que se va a mostarar
        //poner la ubicación del texto anterior
        etiqueta.setBounds(20, 40, 100, 40); //posiciona la etiqueta en la ventana
        add(etiqueta); //para que agregue la etiqueta, si no se pone, no sale la etiqueta en la ventana :(
            //caja de texto, para que ponga el usuario
        cajatexto = new JTextField();
        cajatexto.setBounds(130, 40, 150, 30);
        add(cajatexto);
            //crear boton
        boton = new JButton();
        boton.setText("OK");
        boton.setBounds(50, 80, 110, 25);
        boton.addActionListener( 
                new ActionListener(){ //crea una nueva clase en ActionListener
                    public void actionPerformed(ActionEvent ev){
                        if(ev.getSource()==boton){ //pregunta si el boton es el que causa la accion
                            String texto = cajatexto.getText().toUpperCase();// pone el texto en mayusculas
                            etiqueta2.setText(texto);
                        }  
                    }
        }
        ); //decirle que el boton es el que va a realizar la accion
        add(boton);
            //etiqueta en blanco, donde despues se imprima un texto
        boton2 = new JButton();
        boton2.setBounds(150, 10, 110, 25);
        boton2.setText("abrir");
        boton2.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent ev){
                        MiVentana5 v5 = new MiVentana5();
                        MiVentana1 v1 = new MiVentana1();
                        MiVentana3 v3 = new MiVentana3();
                        dispose(); // ocultar ventana //oculta la primer ventana abierta
                    }
                }
        );
        add(boton2);
        etiqueta2 = new JLabel();
        
        //etiqueta2.setText("HOLAAAAAA");
        etiqueta2.setBounds(25, 120, 100, 40);
        add(etiqueta2);
            //agregar lo de la caja de texto, en el cuadro anterior
        
        setVisible(true); // para que muestre la ventana // que sea hasta el final del método
    }
    
    /*public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton){ //pregunta si el boton es el que causa la accion
            String texto = cajatexto.getText().toUpperCase();// pone el texto en mayusculas
            //etiqueta2.setText(cajatexto.getText()); // le pasa la información de la caja de texto, lo que pone el usuario
            etiqueta2.setText(texto);
        }
    }
       */ 
    public static void main(String args[]){
        MiVentana7 vent = new MiVentana7();
    }
}
//diseñar una ventana para introducir dos numeros
// con cutro boloten, uno para sumar, uno para restar, multiplicar y dividir
//una para el resultado
