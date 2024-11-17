package GridLayout;
import java.awt.GridLayout;

import javax.swing.*;
//layout manager = Define la disposición natural de los componentes dentro de un contenedor.
//GridLayout = coloca los componentes en una cuadrícula de celdas. Cada componente ocupa todo el espacio disponible dentro de su celda, y cada celda tiene el mismo tamaño

public class Main {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        //Aplicamos el Grid
        //primer número filas, segundo columnas, tercero espacio horizontal, cuarto espacio vertical
        //podría usarse para crear los números de las calculadoras digitales
        frame.setLayout(new GridLayout(3, 3 , 10, 10 ));

        //Crearemos botones
        //Forma 1 de crear botones
        //JButton button1 = new JButton("1");
        //frame.add(button1);

        //Forma 2: 
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        //En caso de tener un número impar, se crean espacios para lo demás. Creamos el 10 y faltaran dos espacios para llenar
        frame.add(new JButton("10"));

        frame.setVisible(true);
    }
}
