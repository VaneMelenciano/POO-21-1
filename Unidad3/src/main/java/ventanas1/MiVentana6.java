/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas1;import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.event.KeyAdapter;
/**
 *
 * @author Vanessa
 * CLASES INTERNAS Y EL USO DE CLASES ADAPTADORAS
 * DE LOS EVENTOS
 */
public class MiVentana6 extends JFrame{ // herencia simple //implement en herencia multiple
    private JTextField caja;
    private JLabel etiqueta;
    
    public MiVentana6(){
        super("Grupo 2CM2");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
         caja = new JTextField();
         caja.setBounds(30, 30, 150, 30);
         ///CREAR OBJETO DE TIPO EVENTOTECLADO
         EventoTeclado evt = new EventoTeclado();
         caja.addKeyListener(evt);
         etiqueta = new JLabel("texto");
         etiqueta.setBounds(30,70 , 150, 30);
         
         add(caja);
         add(etiqueta);
         setVisible(true);
    }
    public class EventoTeclado extends KeyAdapter{ //clases adaptadoras 
    
    /*public void keyPressed(KeyEvent e){
        
    }*/
    public void keyReleased(KeyEvent e){
         if(e.getSource()==caja){
            etiqueta.setText(caja.getText().toUpperCase());
        }
    }
    /*public void keyTyped(KeyEvent e){
        
    }*/
    }//termina clase interna
    public static void main(String args[]){
        MiVentana6 v3= new MiVentana6();
    }
}

