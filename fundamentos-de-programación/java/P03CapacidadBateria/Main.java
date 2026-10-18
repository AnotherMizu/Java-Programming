import static javax.swing.JOptionPane.*;


public class Main{
    public static void main(String[] args) {

        double capacidadBateria, consumoPorHora, horasCarga;

        capacidadBateria = Float.parseFloat(showInputDialog("capacidad de la batería(miliamperios): "));
        consumoPorHora = Float.parseFloat(showInputDialog("Consumo promedio por hora: "));

        horasCarga = capacidadBateria/consumoPorHora;

        System.out.println("owo");

        IO.println("A tu dispositivo le restan " + horasCarga + "de carga");

    }
}