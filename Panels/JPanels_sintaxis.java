package Panels;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class JPanels_sintaxis extends JFrame {
    public static void main(String[] args) {

        ImageIcon imagen= new ImageIcon("Panels/contextPanel.png");

        JLabel label= new JLabel("Hi");
        //añadimos la imagen
        label.setIcon(imagen);
        //El vertical y Horizontal se usan cuando usar en el layout el BorderLayout
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.RIGHT);
        //En caso de querer elegir libremente dónde puede estar ubicado, solo se pone las bounds y el layout en null
        
        


        // JPanel = un componente de GUI que funciona como un contenedor para contener otros componentes
        JPanel redpanel= new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0, 0, 750, 60);

        //Crearemos ahora uno a nuestra preferencia
        JPanel yellowPanel= new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        yellowPanel.setBounds(0, 60, 150, 750);

        //Creamos otro panel
        JPanel contextPanel = new JPanel();
        contextPanel.setBackground(Color.DARK_GRAY);
        contextPanel.setBounds(150, 60, 600, 750);
        //Se coloca para poder modificar los bordes y alineación
        contextPanel.setLayout(new BorderLayout());
        
        
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ponemos null ya que queremos editar a nuestro gusto los layouts
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        //añadimos el panel al frame
        frame.add(redpanel);
        //añadimos el panel creado por nosotros
        frame.add(yellowPanel);
        //añadimos la imagen al Panel Gris
        contextPanel.add(label);
        //Añadimos el otro panel creado
        frame.add(contextPanel);
    }
}