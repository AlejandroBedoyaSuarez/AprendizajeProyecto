package JOptionPane;
//JOptionPane = abrir un cuadro de diálogo estándar que pide a los usuarios un valor o les informa de algo
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        //MENSAJES DE LA APP

        //JOptionPane.showMessageDialog(null, "This some useless info", "title" , JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This some useless info", "title" , JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This some useless info", "title" , JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "This some useless info", "title" , JOptionPane.WARNING_MESSAGE);
       // JOptionPane.showMessageDialog(null, "This some useless info", "title" , JOptionPane.ERROR_MESSAGE);

       //PREGUNTA INTERACTIVA CON EL USUARIO
        //int answer= JOptionPane.showConfirmDialog(null, "bro, do you even code?", "this is my tittle", JOptionPane.YES_NO_CANCEL_OPTION);

        //Hace escribir al usuario (input)
        /*String name= JOptionPane.showInputDialog("What is your name? ");
        System.out.println("Hello " + name);*/
        String [] responses = {"No, you are awesome", "Thank you" , "*blush*"};
        ImageIcon icon = new ImageIcon("JOptionPane/discord.png");
        //valores en orden: componente, mensaje, titulo, modo, tipo, imagen, opciones
        JOptionPane.showOptionDialog(null, "You are awesome", 
        "secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
    }
}
