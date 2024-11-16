package LabelJava;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class JavaLabel {
    public static void main(String[] args) {
        
        //Crearemos la imagen en el Label
        ImageIcon image = new ImageIcon("LabelJava/imagenLabel.png");

        //Crearemos un borde
        Border border= BorderFactory.createLineBorder(Color.green, 3);
        
         
        
        //Creamos el Label
        JLabel label = new JLabel("Bro, do you even code?"); //Creamos el Label
        //Forma 2 : label.setText("Bro, do you even code?");  // Sirve para poner texto dentro del label
        //Como la imagen va dentro del label, lo ponemos aquí
        label.setIcon(image);
        //En caso de querer alinear el texto, usamos
        //3 opciones con horizontal position: centro, derecha e izquierda
        label.setHorizontalTextPosition(JLabel.CENTER);
        //si queremos hacer arriba o abajo, necesitamos el vertical
        label.setVerticalTextPosition(JLabel.TOP);
        
        //Esto le da color a las letras
        label.setForeground(Color.green);
        //Cambiar el tipo de letra
        label.setFont(new Font("MV Boli" , Font.PLAIN, 20));
        //Posición del texto según la imagen. Si el valor es positivo se aleja de la imagen mientras más alto
        //Si el valor es negativo, se acerca a la imagen mientras más alto
        label.setIconTextGap(0);
        //pone el color de fondo pero va de conjunto con la de abajo
        label.setBackground(Color.red);
        label.setOpaque(true);// esto hace que se active

        //activar el borde
        label.setBorder(border);

        //para posicionar el texto y la imágen
        label.setVerticalAlignment(JLabel.CENTER); //posición vertical (top, center, bottom)
        label.setHorizontalAlignment(JLabel.CENTER); // posición horizontal (left, center, right)
        //label.setBounds(100, 50, 800, 900); //posición x , y. También el tamaño del contenedor
        
        
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        //
        frame.setLayout(null);
        frame.setVisible(true);
        //añadimos el label al frame
        frame.add(label);

        //https://www.youtube.com/watch?v=Kmgo00avvEw  min 28.01
    }
}
