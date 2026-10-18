import static javax.swing.JOptionPane.*;
import java.util.HashMap;

public class NivelesDeAcceso{

    public static void main(String[] args){
        short metodo = Short.parseShort(showInputDialog("Que metodo deseas utilizar? 
        1-metodo por ifs anidados
        2-Metodo optimizado
        "));

        if (validation(userLevel, 0, 5)){
            (metodo == 1 ? primerMetodo() : segundoMetodo());
        } else{
            System.out.println("llegue aqui");
            showMessageDialog(null, "El numero ingresado es incorrecto");
        }
    }

    public static boolean validation(byte userLevel, short minNumber, short maxNumber){
        if (userLevel>minNumber && userLevel < maxNumber){
            return true;
        }
        return false;
    }

    void primerMetodo(byte userLevel) {

    }

    void segundoMetodo(byte userLevel) {
        HashMap<Byte, String> map = new HashMap<>();
        byte userLevel = Byte.parseByte(showInputDialog("¿Cuál es tu nivel de permisos?")); 
        map.put((byte)1, "invitado");
        map.put((byte) 2, "empleado");
        map.put((byte) 3, "supervisor");
        map.put((byte) 4, "administrador");
    }

}