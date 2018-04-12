package boletin23_3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JPanel;

public class Evento implements ActionListener{
    JFrame marco = new JFrame("Boletin 23, Ejericio 3");
    JPanel panel  = new JPanel();
    JButton bSaudo = new JButton("Saudo");
    JButton bDespedida = new JButton("Despedida");
    JLabel etSaudo = new JLabel("Un saudo a DAM");
    JLabel etDespedida = new JLabel("Fin do programa");
    
    public Evento(){
        marco.setSize(300,250);
        
        panel.add(bSaudo);
        panel.add(bDespedida);
        panel.add(etSaudo);
        etSaudo.setVisible(false);
        panel.add(etDespedida);
        etDespedida.setVisible(false);
        marco.add(panel);
        
        bSaudo.addActionListener(this);
        bDespedida.addActionListener(this);

        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton = e.getSource();
        if (boton==bSaudo){
            etDespedida.setVisible(false);
            etSaudo.setVisible(true);
        }else{
            etSaudo.setVisible(false);
            etDespedida.setVisible(true);
        }
    }
}
