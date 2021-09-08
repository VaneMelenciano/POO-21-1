/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas1;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseEvent;
/**
 *
 * @author Vanessa
 */
public class MiVentana4 extends JFrame implements MouseListener{
    private JButton boton;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JPanel centro; //tiene comportamiento similar al JFrame
    public MiVentana4(){
        setTitle("Border Layout");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //crear layaut
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        
        boton = new JButton();
        boton.setText("Click me!");
        boton.addMouseListener(this);
        boton2 = new JButton();
        boton2.setText("Cambiar color");
        boton2.addMouseListener(this);
        boton3 = new JButton("cuantos clics");
        //boton3.addMouseListener(this);
        boton4 = new JButton("contador");
        boton4.addMouseListener(this);
        boton5 = new JButton("quinto");
        boton5.addMouseListener(this);
        
        centro = new JPanel();
        centro.setSize(100, 100);
        centro.add(boton);
        centro.addMouseListener(this);
        
        add(centro, BorderLayout.CENTER);
        add(boton2, BorderLayout.NORTH);
        add(boton3, BorderLayout.SOUTH);
        add(boton4, BorderLayout.EAST);
        add(boton5, BorderLayout.WEST);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent ev){ //si le dan click
        if(ev.getSource()==boton){
            boton.setText("clicked");
        }else if(ev.getSource()==centro){ // centro es el panel
            if(ev.getButton()==MouseEvent.BUTTON1){ //MouseEvent es el mouse
                //boton izquierdo
                boton.setText("Boton izquierdo");
            }else if(ev.getButton()==MouseEvent.BUTTON2){
                //boton scroll
                boton.setText("Boton del scroll");
            }else if(ev.getButton()==MouseEvent.BUTTON3){
                //boton derecho
                boton.setText("Boton derecho");
            }
        }
    }
    public void mouseEntered(MouseEvent ev){ //cuando el mouse entra sobre algun elemento
        if(ev.getSource()==boton2){
            boton2.setBackground(Color.MAGENTA);
            Font f = new Font(Font.SANS_SERIF, Font.BOLD,12);
            boton2.setFont(f);
            //boton2.setBackground(new Color(45, 67, 89));
            
        }
    }
    public void mouseExited(MouseEvent ev){ // cuando el mouse sale del boton
        if(ev.getSource()==boton4){ //lo que va hacer si
            boton4.setText("salió el mouse");
            //col = boton4.getForeground();
        }else if(ev.getSource()==boton2){ //hace que regrese al color original después de quitar el mouse de ahí
            boton2.setBackground(col);
        }
    }
    public void mousePressed(MouseEvent ev){ //cuando se queda presionado el mouse, y cundo se deja de presinar otra cosa
        if(ev.getSource()==boton5){
            boton5.setText("Presionando...");
            boton5.setForeground(Color.red);
        }
    }
        Color col;
    public void mouseReleased(MouseEvent ev){
        
    }
    public static void main(String args[]){
        MiVentana4 v = new MiVentana4();
    }
}
