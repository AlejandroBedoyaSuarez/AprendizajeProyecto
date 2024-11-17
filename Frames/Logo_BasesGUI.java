package Frames;




public class Logo_BasesGUI{
    public static void main(String[] args) {
        //Método 1

       /*  JFrame frame = new JFrame(); //Crea un cuadro
        frame.setTitle("Titutlo App"); //Crea el titulo para poner el nombre del proyecto
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);; //Sirve para poder hacer la acción del cuadro (ejemplo el de ahora dice que se puede cerrar)     //DO_NOTHING_ON_CLOSE no puede cerrar el archivo
        frame.setResizable(false); //sirve para que no puedas extender el cuadrito de la respuesta
        frame.setSize(420, 420); //Sirve para poner las dimensiones del cuadro
        frame.setVisible(true); //Sirve para que el cuadro se vea 

        //para poner la imagen: ImageIcon variable = objeto(dirección de la imagen.tipo de imagen)
        //en visual, debes poner primero la carpeta donde esta la imagen y luego el nombre de la imágen
        ImageIcon image= new ImageIcon("Teoría_Practica/logito.png"); //Se crea el objeto para poder modificar el logo
        frame.setIconImage(image.getImage()); // Modifica el logo en el cuadro
        //cambia el color del fondo a verde
        //frame.getContentPane().setBackground(Color.green);

        //En caso de querer hacer rgb, se hace con new Color (r: g: b: )
        frame.getContentPane().setBackground(new Color(12,45,10));
        */

        //Método 2

        //Haremos una instancia de myFrame a esta
        //también se puede dejar solo el new myFrame();
        myFrame MyFrame= new myFrame();
    }
    
}
