/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperAgenda86;

import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.JFrame;
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import javax.swing.*;


/**
 * Nobre: Vanessa Melenciano Llamas
 * Tema del programa: Herencia multiple
 * Descripcion: herencia simple e interfaces de usuario
 * Fecha: 02/12/20
 */

public class VentanaAgenda extends JFrame implements ActionListener{
    private JLabel eti_nom;
    private JLabel eti_dir;
    private JLabel eti_tel;
    private JLabel eti_cel;
    private JLabel eti_imagen;
    private JTextField a_nom;
    private JTextField a_dir;
    private JTextField a_tel;
    private JTextField a_cel;
    private JButton boton_guardar;
    private JButton boton_cancelar;
    private JTextArea cuadro_datos;
    public Agenda agenda;
    
    public VentanaAgenda(){
        agenda = new Agenda();
        setTitle("SUPER AGENDA");
        setSize(650, 580);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        
        eti_nom = new JLabel("Nombre");
        eti_nom.setBounds(30,80 , 70, 30);
        add(eti_nom);
        eti_dir= new JLabel("Dirección");
        eti_dir.setBounds(30,120 , 70, 30);
        add(eti_dir);
        eti_tel= new JLabel("Teléfono");
        eti_tel.setBounds(30,160 , 70, 30);
        add(eti_tel);
        eti_cel= new JLabel("Celular");
        eti_cel.setBounds(30,200 , 70, 30);
        add(eti_cel);
    
        a_nom = new JTextField();
        a_nom.setBounds(100, 80, 290, 30);
        add(a_nom); 
        a_dir = new JTextField();
        a_dir.setBounds(100, 120, 290, 30);
        add(a_dir); 
        a_tel = new JTextField();
        a_tel.setBounds(100, 160, 290, 30);
        add(a_tel); 
        a_cel = new JTextField();
        a_cel.setBounds(100, 200, 290, 30);
        add(a_cel); 
        
        eti_imagen = new JLabel(new ImageIcon("imagen3.jpg"));
        eti_imagen.setBounds(405, 72, 148, 181);
        add(eti_imagen);
        
        boton_guardar = new JButton();
        boton_guardar.setText("Guardar");
        boton_guardar.setBounds(90, 260, 85, 20);
        boton_guardar.addActionListener(this);
        add(boton_guardar);
        boton_cancelar= new JButton();
        boton_cancelar.setText("Cancelar");
        boton_cancelar.setBounds(260, 260, 85, 20);
        boton_cancelar.addActionListener(this);
        add(boton_cancelar);
        
        cuadro_datos = new JTextArea();
        cuadro_datos.setBounds(40, 310, 550, 200);
        add(cuadro_datos);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
         if(e.getSource()==boton_guardar){
             Contacto c = new Contacto(); 
             int tel, cel;
             
             try{ 
             c.setNombre(a_nom.getText());
             c.setDireccion(a_dir.getText());
             tel = Integer.parseInt(a_tel.getText());
             c.setTel(tel);
             cel = Integer.parseInt(a_cel.getText());
             c.setCel(cel);
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Ingrese datos correctamente");
            }
             agenda.agregarContacto(c);
             cuadro_datos.setText(agenda.mostar());
             a_nom.setText(null);
             a_dir.setText(null);
             a_tel.setText(null);
             a_cel.setText(null);
         }
         else if(e.getSource()==boton_cancelar){
             a_nom.setText(null);
             a_dir.setText(null);
             a_tel.setText(null);
             a_cel.setText(null);
         }
    }
    public static void main(String args[]){
        VentanaAgenda VG = new VentanaAgenda();
    }
}
