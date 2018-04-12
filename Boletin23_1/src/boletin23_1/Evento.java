package boletin23_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JPanel;

public class Evento implements ActionListener{
    JFrame marco = new JFrame("Boletin 23, Ejercicio 1");
    JPanel panel  = new JPanel();
    JButton boton = new JButton("Premer");
    JLabel etPremerBoton = new JLabel("Premiches o boton");
    
    public Evento(){
        marco.setSize(300,250);
        
        panel.add(boton);
        panel.add(etPremerBoton);
        etPremerBoton.setVisible(false);
        marco.add(panel);
        
        boton.addActionListener(this);

        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        etPremerBoton.setVisible(true);
    }
}
