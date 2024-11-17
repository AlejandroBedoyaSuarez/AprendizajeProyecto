package Buttons;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class myFrame extends JFrame implements ActionListener{
    //Hacemos el botón global
    JButton button;
    //Hacemos el label global
    JLabel label;
    
    //Constructor
    myFrame(){

        //Crearemos un icon
        ImageIcon icon = new ImageIcon("Buttons/xbox.png");
        ImageIcon wasap= new ImageIcon("Buttons/wasap.png");

        label= new JLabel();
        label.setIcon(wasap);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);


        //Creamos el botón
        //JButton button = new JButton(); //Manera local
        button = new JButton(); //manera global
        button.setBounds(200, 100, 100, 50); 
        //No saldrá nada en el botón hasta añadir esto
        button.addActionListener(this);

        //La otra manera de hacer esta función es:
        /*
         1) Retiramos el implemento y lo que está desde el override para abajo
         2)modificamos el button.addActionListener(this); por button.addActionListener(e -> System.out.println("Alejandro"));
         3) Esto hará exactamente lo mismo
         */

        //Vamos a meter texto en el botón
        //Por default aparecera como una cajita dentro del texto, para quitarle necesitamos hacer
        button.setText("Im a button");
        //Necesitamos hacer esto para quitar la cajita
        button.setFocusable(false);
        //tamaño del botón
        button.setBounds(200, 100, 150, 100);
        //añadimos la imagen realizada al botón
        button.setIcon(icon);
        //Cambiamos la posición del texto
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setFont(new Font("Comic Sans" , Font.BOLD, 14));
        //En caso de querer modificar el icono para que no se vea tan cercano se hace
        //button.setIconTextGap(45);
        //En caso de querer cambiar el color de la letra, se hace así:
        button.setForeground(Color.red);
        //Ahora vamos a cambiar el fondo del botón
        button.setBackground(Color.yellow);
        //Si le queremos añadir un borde
        //este borde es para que se vea como 3D
        button.setBorder(BorderFactory.createEtchedBorder() );
        //En caso de querer desactivar la función del botón click
        //button.setEnabled(false);

        //opciones principales
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setLayout(null);
         this.setSize(500, 500);
         this.setVisible(true);
         //añadimos el botón 
         this.add(button); 
         //añadimos el label
         this.add(label);
    }
    //Esto es para eventos
    //Se necesita esto si queremos añadir implementos y su tipo
    //En este caso es ActionListener
    @Override
    public void actionPerformed(ActionEvent e){
        //Al principio saldrá error en "button" porque el botón está en manera local, hay que hacerlo global
        if(e.getSource()== button){
            //System.out.println("Alejandro");

            //En caso de que después de un click quieres que el botón se desactive, hacer esto
            //button.setEnabled(false);

            //sirve para que cuando de click, salga la imagen
            label.setVisible(true);
        }
    }
}
