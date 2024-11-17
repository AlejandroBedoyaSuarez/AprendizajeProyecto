package Frames;
import java.awt.Color;

import javax.swing.*;
public class myFrame extends JFrame{
    
    myFrame(){
        
        this.setTitle("Titutlo App"); //Crea el titulo para poner el nombre del proyecto
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);; //Sirve para poder hacer la acción del cuadro (ejemplo el de ahora dice que se puede cerrar)     //DO_NOTHING_ON_CLOSE no puede cerrar el archivo
        this.setResizable(false); //sirve para que no puedas extender el cuadrito de la respuesta
        this.setSize(420, 420); //Sirve para poner las dimensiones del cuadro
        this.setVisible(true); //Sirve para que el cuadro se vea 

        //para poner la imagen: ImageIcon variable = objeto(dirección de la imagen.tipo de imagen)
        //en visual, debes poner primero la carpeta donde esta la imagen y luego el nombre de la imágen
        ImageIcon image= new ImageIcon("Frames/logito.png"); //Se crea el objeto para poder modificar el logo
        this.setIconImage(image.getImage()); // Modifica el logo en el cuadro
        //cambia el color del fondo a verde
        //frame.getContentPane().setBackground(Color.green);

        //En caso de querer hacer rgb, se hace con new Color (r: g: b: )
        this.getContentPane().setBackground(new Color(12,45,10));
        
    }
}
