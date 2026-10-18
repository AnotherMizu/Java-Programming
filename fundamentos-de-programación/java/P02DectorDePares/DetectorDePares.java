
import javax.swing.JOptionPane;

public class DetectorDePares {
    
    public static void main(String[] args){
        int idPaquete;

        idPaquete = Integer.parseInt(JOptionPane.showInputDialog("que numero vas a escoger?"));


        if (idPaquete<0){
            JOptionPane.showMessageDialog(null, "El identificador debe ser mayor que 0");

        }    
        else if (idPaquete % 2 == 0) {   
            JOptionPane.showMessageDialog(null, "el idPaquete es PAR.");

        }
        else {
            JOptionPane.showMessageDialog(null, "Tu numero es impar");

        }

    }
}