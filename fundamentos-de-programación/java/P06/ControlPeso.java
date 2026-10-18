import static javax.swing.JOptionPane.*;

public class ControlPeso {

    public static void main(String[] args) {
        float paquete1, paquete2, paquete3;

        paquete1 = Float.parseFloat(showInputDialog("¿Cual es el valor del primer paquete?"));
        paquete2 = Float.parseFloat(showInputDialog("¿Cual es el valor del segundo paquete?"));
        paquete3 = Float.parseFloat(showInputDialog("¿Cual es el valor del tercer paquete?"));

        if (validation(paquete1, paquete2, paquete3)) {
            showMessageDialog(null, "alguno de los numeros introducidos es incorrecto");
        } else {
            showMessageDialog(null, comparacion(paquete1, paquete2, paquete3));
        }
    } 

    public static String comparacion(float paquete1, float paquete2, float paquete3) {
        if (paquete1 == paquete2 && paquete3 == paquete1) {
            return "Sus paquetes pesan lo mismo";
        }

        float[] paquetes = {paquete1, paquete2, paquete3};
        
        float haviest = paquetes[0]; 
        int i = 1;                   
        boolean unfinished = true;   

        while (unfinished) {
            if (paquetes[i] > haviest) {
                haviest = paquetes[i];
            }

            i++;

            if (i >= paquetes.length) {
                unfinished = false;
            }
        }

        return "El paquete más pesado pesa: " + haviest;
    }

    public static boolean validation(float paquete1, float paquete2, float paquete3) {
        if (paquete1 < 0 || paquete2 < 0 || paquete3 < 0) {
            return true;
        }
        return false;
    }
}