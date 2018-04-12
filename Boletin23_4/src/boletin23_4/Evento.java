package boletin23_4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JPanel;

public class Evento implements ActionListener{
    JFrame marco1 = new JFrame("Boletin 23, Ej 4 -- VENTANA 1");
    JPanel panel1  = new JPanel();
    JButton boton1 = new JButton("Ir a Ventana 2");
    JFrame marco2 = new JFrame("Boletin 23, Ej 4 -- VENTANA 2");
    JPanel panel2  = new JPanel();
    JButton boton2 = new JButton("Ir a Ventana 1");
   
    
    public Evento(){
        marco1.setSize(300,250);
        
        panel1.add(boton1);
        marco1.add(panel1);
        
        boton1.addActionListener(this);

        marco1.setLocationRelativeTo(marco1);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.setVisible(true);
    }
    
    public void ventana2(){
        marco2.setSize(300,250);
        
        panel2.add(boton2);
        marco2.add(panel2);
        
        boton2.addActionListener(this);

        marco2.setLocationRelativeTo(marco2);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        if (boton==boton1){
            marco1.setVisible(false);
            ventana2();
        }else{
            marco2.setVisible(false);
            marco1.setVisible(true);
        }
    }
}
