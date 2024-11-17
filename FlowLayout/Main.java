package FlowLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Layout Manager = Define el diseño natural para los componentes dentro de un
// contenedor
// FlowLayout = Coloca los componentes en una fila, ajustados a su tamaño
// preferido.
// Si el espacio horizontal en el contenedor es demasiado pequeño, la clase FlowLayout utiliza la siguiente fila disponible.

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        // para usar el flow, necesitamos tener esto
        // Leading: se alinea a la izquierda y cuando se reduce el tamaño también lo
        // hace en esa dirección
        // Trailing: se alinea a la derecha y cuando se reduce el tamaño también lo hace
        // en esa dirección
        // primer número es el espacio horizontal, segundo número es el espacio
        // vertical,
        // primer número: se separa horizontalmente, crea espacio entre los botones
        // segundo número: se separa verticalmente, crea espacio entre la parte superior
        // e inferior
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        // frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout());

        // Se cambia por panel y añadimos al frame
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);

        // Creamos el botón dentro del mismo add
        // a veces no se ve cuando se agrega esto, pero solo es cuestión de poner el
        // setVisible abajo del frame.add
        /*
         * frame.add(new JButton("1"));
         * frame.add(new JButton("2"));
         * frame.add(new JButton("3"));
         * frame.add(new JButton("4"));
         * frame.add(new JButton("5"));
         * frame.add(new JButton("6"));
         * frame.add(new JButton("7"));
         * frame.add(new JButton("8"));
         * frame.add(new JButton("9"));
         * frame.setVisible(true);
         */

    }
}
