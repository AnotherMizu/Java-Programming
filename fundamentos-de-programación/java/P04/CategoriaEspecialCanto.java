import javax.swing.JOptionPane;

public class CategoriaEspecialCanto {

    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Hola ¿Como te llamas?");
        String gender = JOptionPane.showInputDialog("Para continuar con el registro, ¿Cual es tu sexo?");
        char validGender = gender.charAt(0);
        byte age = Byte.parseByte(JOptionPane.showInputDialog("Y para terminar el registro ¿cuántos años tienes?"));

        if (IsInvalid(validGender, age)) {
            JOptionPane.showMessageDialog(null, "Edad o sexo no validos, intente de nuevo");
        }
        else {
            JOptionPane.showMessageDialog(null, "Registro exitoso, ahora solo nos falta determinar en cual torneo entrara");
            String resultado = SeleccionadorDeTorneo(validGender, age);
            JOptionPane.showMessageDialog(null, resultado);
        }
        
    }

    public static boolean IsInvalid(char validGender, byte age){
        if (age<0 || age>100 || (validGender != 'F' && validGender != 'M')) {
            return true;
        }
        return false;
    }

    public static String SeleccionadorDeTorneo(char validGender, byte age) { 
        if (validGender == 'F' && age >= 18) {
            return "Felicidades entraste a la categoria especial";
        }
        if (validGender == 'M') {
            return "Queda registrado en el torneo Masculino de todas las edades";
        }
        if (validGender == 'F') {
            return "Quedas registrada en el torneo Femenino de todas las edades";
        }
        
        return "Esto es un bug, reportalo";
    }
}
