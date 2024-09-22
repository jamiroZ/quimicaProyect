package cuerpo;
import javax.swing.WindowConstants;

import igu.Pantalla;
public class Main {
    public static void main(String[] args) {
        Pantalla pantalla=new Pantalla();     
        pantalla.setSize(500, 500);
        pantalla.setTitle("TABLA PERIODICA");
        pantalla.setVisible(true);//abre pantalla
        pantalla.setLocationRelativeTo(null);//centra la pantalla 
        pantalla.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//cerrar ventana
         pantalla.initialize();
    }
}

