package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;


public class PanelFormulario extends JFrame{
    //Creamos la constante que será la fuente. Esta tendrá: tipo de fuente, Características (negrilla) , tamaño de la letra)
    final private Font mainFont= new Font("Segoe print" , Font.BOLD, 18);
    //Creamos una nueva variable que es para el primer nombre
    JTextField tfFirstName;
    JTextField tfLastName;

    public void iniciar(){
        //Form Panel
        //Empezamos colocando para que se vea en la app "First Name"
        JLabel lbFirstName= new JLabel("First Name");
        lbFirstName.setFont(mainFont);

        tfFirstName= new JTextField();
        tfFirstName.setFont(mainFont);

        //Ahora vamos con el apellido
        JLabel lbLastName= new JLabel("Last Name");
        lbLastName.setFont(mainFont);

        tfLastName= new JTextField();
        tfLastName.setFont(mainFont);

        //Creamos el Panel que contenga todos los datos del Formulario
        JPanel formPanel= new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        //ahora añadimos el proceso
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        //añadimos nuestro formulario al main panel
        //Se coloca el add (nombre del panel, en donde va a estar ubicado el panel)
        mainPanel.add(formPanel, BorderLayout.NORTH);

        setTitle("Bienvenido Sapo");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
   
}