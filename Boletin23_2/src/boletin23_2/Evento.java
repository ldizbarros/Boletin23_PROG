package boletin23_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JPanel;

public class Evento implements ActionListener{
    JFrame marco = new JFrame();
    JPanel panel  = new JPanel();
    JButton bProgramacion = new JButton("Programacion");
    JButton bBases = new JButton("Bases");
    
    public Evento(){
        marco.setSize(300,250);
        marco.setTitle("Curso DAM");
        
        panel.add(bProgramacion);
        panel.add(bBases);
        marco.add(panel);
        
        bProgramacion.addActionListener(this);
        bBases.addActionListener(this);

        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        if (boton==bProgramacion){
            marco.setTitle("Programacion");
        }else{
            marco.setTitle("Bases");
        }
    }
}
