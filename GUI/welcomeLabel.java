package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class welcomeLabel extends JFrame{
  
    final private Font mainFont= new Font("Segoe print" , Font.BOLD, 18);
    JTextField tfFirstName;
    JTextField tfLastName;
    //Declaramos variable para Label
    JLabel lbWelcome; 

    public void iniciar(){
        
        JLabel lbFirstName= new JLabel("First Name");
        lbFirstName.setFont(mainFont);

        tfFirstName= new JTextField();
        tfFirstName.setFont(mainFont);

        
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

        //-----------------------------------------Welcome Label----------------------
        lbWelcome= new JLabel();
        lbWelcome.setFont(mainFont);

        //Creamos los botones
        //-----------------------------------------Panel de Botones------------------------------------------------
        JButton btnOK= new JButton("OK");
        btnOK.setFont(mainFont);
        //Añadimos el listener
        //Le damos click en fix en la parte del objeto "new ActionListener"
        btnOK.addActionListener(new ActionListener() {

            @Override
            //Borramos el texto del fix dentro del evento y añadimos lo nuestro
            public void actionPerformed(ActionEvent e) {
                //Aquí empieza nuestro texto
                String firstName= tfFirstName.getText();
                String lastName= tfLastName.getText();
                lbWelcome.setText("Hello " + firstName + lastName);
            }
            
        });

        JButton btnClear= new JButton();
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstName.setText("");
                tfLastName.setText("");
                lbWelcome.setText("");
            }
            
        });
        //Creamos el Panel de Botones
        JPanel buttonsPanel= new JPanel();
        
        buttonsPanel.setLayout(new GridLayout(1, 2, 5,5 ));
        //añadimos los botones
        buttonsPanel.add(btnOK, btnClear);




         


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        //Añadimos el Welcome al panel principal
        mainPanel.add(lbWelcome, BorderLayout.CENTER);
        //añadimos el panel de botones botones al panel principal
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        
        add(mainPanel);

        setTitle("Bienvenido Sapo");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
