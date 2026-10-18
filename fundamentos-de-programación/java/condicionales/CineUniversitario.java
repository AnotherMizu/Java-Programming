import javax.swing.*;

public class CineUniversitario {
    public static void main(String[] args) {
        
        byte edad;
        String nombre;

        nombre = JOptionPane.showInputDialog("¿Cómo te llamas?: ");
        
        edad = Byte.parseByte(JOptionPane.showInputDialog("Dime tu edad: "));

        JOptionPane.showMessageDialog(null, Validation(edad));
    }

    public static String Validation(byte edad) {
        if (edad < 0) {
            return "La edad debe ser un valor mayor que 0.";
        }
        
        if (edad < 18) {
            return "Debes ser mayor de edad.";
        }

        return "Puedes entrar.";
    } 
}