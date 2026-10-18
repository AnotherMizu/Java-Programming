import javax.swing.JOptionPane.*;

public class ClassWork{
    public static void main(String[] args){
        
        byte edad;
        String nombre;

        nombre = showInputDialog("¿Como te llamas?: ");
        edad = Byte.parseByte(showInputDialog("Dime tu edad: "));

        if (edad < 0){
            showMessageDialog(null, "La edad debe ser mayor a 0.");
        }
        else if (edad >= 18) {
            showMessageDialog(null, "Acceso concedido. \n " + "Disfruta la función, " + nombre);                
        }
        else {
            showMessageDialog(null, "No puedes entrar al cine porque eres menor de edad");
        }
    }

}
