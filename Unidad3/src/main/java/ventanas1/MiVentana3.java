/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas1;import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
/**
 *
 * @author Vanessa
 */
public class MiVentana3 extends JFrame implements KeyListener{
    private JTextField caja;
    private JLabel etiqueta;
    
    public MiVentana3(){
        super("Grupo 2CM2");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
         caja = new JTextField();
         caja.setBounds(30, 30, 150, 30);
         caja.addKeyListener(this);
         etiqueta = new JLabel("texto");
         etiqueta.setBounds(30,70 , 150, 30);
         
         add(caja);
         add(etiqueta);
         setVisible(true);
    }
    
    public void keyPressed(KeyEvent e){
        
    }
    public void keyReleased(KeyEvent e){
         if(e.getSource()==caja){
            etiqueta.setText(caja.getText().toUpperCase());
        }
    }
    public void keyTyped(KeyEvent e){
        
    }
    
    public static void main(String args[]){
        MiVentana3 v3= new MiVentana3();
    }
}
