package JLayeredPane;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;
//JLayeredPane= Contenedor Swing que proporciona una tercera dimensión para posicionar componentes Ej. Profundidad, z- index


public class Main {
    public static void main(String[] args) {
        
        //Creamos label 
        JLabel label1 = new JLabel();
        //hace que se vea
        label1.setOpaque(true);
        label1.setBackground(Color.RED);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(150, 150, 200, 200);

        //JlayeredPane variable = Objeto
        JLayeredPane layeredPane = new JLayeredPane();
        //añadimos tamaño al layered
        layeredPane.setBounds(0, 0, 500, 500);
        //añadimos los label
        layeredPane.add(label1, Integer.valueOf(2));
        layeredPane.add(label2, Integer.valueOf(0));
        layeredPane.add(label3, Integer.valueOf(1));


        JFrame frame = new JFrame("JLayeredPane");
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.setVisible(true);
    }    
}
