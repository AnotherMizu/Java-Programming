/* 
    Estructura básica de un programa en Java.
*/

// Area para importación de librerias de codigo Java
// Import nombre_de_la_librería.paquete.código_especifico
import javax.swing.*; //acceso a todo el contenido de el paquete swing. 
import static javax.swing.JOptionPane.*;

// Clase principal del programa.(OBLIGATORIO)

public class BasicStructure {

    //Area para crear módulos (métodos o funciones) de usuario.(OPCIONAL)

    public static void main(String[] args){    //Método principal (main).C
        System.out.println("holaMundo");
        ValidadorRango validador = new ValidadorRango(0, 6);

        if (validador.esValido(-1)) {
            showMessageDialog(null, "Esta dentro de rango");
        }
        else { 
            showMessageDialog(null, "Esta fuera de rango");
        }


    }//main

    //Area para crear módulos (Método o funciones) de usuario. (OPCIONAL)

}//class