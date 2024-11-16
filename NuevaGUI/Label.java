package NuevaGUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class Label extends JFrame{
  
    final private Font mainFont= new Font("Segoe print" , Font.BOLD, 18);
    JTextField tfFirstName;
    JTextField tfLastName;

    public void iniciar(){
        
        JLabel lbFirstName= new JLabel("First Name");
        lbFirstName.setFont(mainFont);

        tfFirstName= new JTextField();
        tfFirstName.setFont(mainFont);

        //Ahora vamos con el apellido
        JLabel lbLastName= new JLabel("Last Name");
        lbLastName.setFont(mainFont);

        tfLastName= new JTextField();
        tfLastName.setFont(mainFont);

       
        JPanel formPanel= new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(lbLastName);
        formPanel.add(tfLastName);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.add(formPanel, BorderLayout.NORTH);

        setTitle("Bienvenido Sapo");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        Label panelWelcome= new Label();
        panelWelcome.iniciar(); 
    }  
}
