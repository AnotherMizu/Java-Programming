import javax.swing.JOptionPane;


public class BalanceDeProduccion{

    public static void main(String[] args) {
        int unidadesProducidas;
        int diferencia;
        int unidadesDefectuosas;
        unidadesProducidas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas unidades producieron?"));
        unidadesDefectuosas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas unidades salieron mal?"));
        diferencia = unidadesProducidas - unidadesDefectuosas;
        if (diferencia >= 3) {

            JOptionPane.showMessageDialog(null, "tu producción fue sobresaliente");

        }
        if (diferencia == 0 ) {
            JOptionPane.showMessageDialog(null, "Su producción es equilibrada");
        }
        if (diferencia <= -3) {
            JOptionPane.showMessageDialog (null, "falla critica de producción");
        }
    }

}