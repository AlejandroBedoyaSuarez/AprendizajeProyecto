package GUI_Ejemplo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//esta importa solo la clase de JFrame de la master Swing
//esta exporta todas las clases del swing
import javax.swing.*;


public class PrimeraGUI extends JFrame {
    // constante que es del tipo de letra y tamaño
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    // variable para el text field
    // Form Panel variables
    JTextField JFFirstName, JFLastName;
    // welcome Panel variables
    JLabel Welcome;

    //Paso 1
    public void initialize() {

        // ************************************************Form Panel
        JLabel firstName = new JLabel("First Name");
        // usamos la constante de la mainFont
        firstName.setFont(mainFont);

        JFFirstName = new JTextField();
        JFFirstName.setFont(mainFont);

        JLabel LastName = new JLabel("Last Name");
        LastName.setFont(mainFont);

        JFLastName = new JTextField();
        JFLastName.setFont(mainFont);

        JPanel formPanel = new JPanel();
        // Filas, columnas, margen horizontal, margen vertical
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.add(firstName);
        formPanel.add(JFFirstName);
        formPanel.add(LastName);
        formPanel.add(JFLastName);

        // ----------------------------Welcome Label----------------------------------
        Welcome = new JLabel();
        Welcome.setFont(mainFont);

        // ------------------------------Buttons Panel
        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = JFFirstName.getText();
                String lastName = JFLastName.getText();
                Welcome.setText("Hello " + firstName + " " + lastName);
            }

        });

        JButton btnClear = new JButton("Clear");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JFFirstName.setText("");
                JFLastName.setText("");
                Welcome.setText("");
            }
            
        });

        //Panel que contiene a los botones
        JPanel buttonsPanel= new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,2,5,5));
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);

        //------------------------------------------Main Panel--------------------------------
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(Welcome, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);


        add(mainPanel);

        //Paso 2
        setTitle("First GUI Alejandro Bedoya");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        PrimeraGUI myFrame = new PrimeraGUI();
        myFrame.initialize();
    }
}
