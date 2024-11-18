package TextFields;
import javax.swing.*;
import Buttons.myFrame;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    // Constructor

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        //textfield
        JTextField textfield= new JTextField();
        textfield.setPreferredSize(new Dimension(250, 40));
        





        this.add(textfield);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
