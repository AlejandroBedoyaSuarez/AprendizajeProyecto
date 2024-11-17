package openNewWindow.howToOpenNewWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LaunchPage implements ActionListener{
    
    //2) Creamos los siguientes dos objetos
    //Esta clase solo contendrá el botón
    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");


    LaunchPage(){

        myButton.setBounds(100, 160, 200, 40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        frame.add(myButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        //le damos que null ya que quieres modificar todo
        frame.setLayout(null);
        frame.setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== myButton){
            //Si se hace esto, solo abrira una ventana aunque pulse muchas veces
            frame.dispose();
            //si se deja solo esto, cada vez que se pulse se abrira una nueva ventana
            NewWindow myWindow = new NewWindow();
        }
    }
}
