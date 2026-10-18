// Algoritmo A01 - Creando un Avatar de Videojuegos

//Importar el paquete swing, para usar cuadros de diálogo
//para entrada de datos

import javax.swing.*;

public class main {

    public static void main (String[] args) {

        String nombreJugador;
        short nivelJugador;
        int monedasOro;
        boolean paseDeBatalla;
        float promMonedasNivel;

        //lectura de datos de entrada.
        nombreJugador = JOptionPane.showInputDialog("Dime tu nombre o apodo: ");
        nivelJugador = Short.parseShort(JOptionPane.showInputDialog("¿Que nivel de jugador tienes?"));
        monedasOro = Integer.parseInt(JOptionPane.showInputDialog("¿Que nivel de jugador tienes?"));
        paseDeBatalla = Boolean.parseBoolean(JOptionPane.showInputDialog("¿Tienes pase de batalla activo?"));

        promMonedasNivel = monedasOro / nivelJugador;

        System.out.println("Datos del jugador ");
        System.out.println("---------------------");
        System.out.println("Nombre/Apodo: " + nombreJugador);
        System.out.println("Nivel: " + nivelJugador);
        System.out.println("Dinero total: " + monedasOro);
        System.out.println("Tiene pase de batalla activo: " + paseDeBatalla);
        System.out.println("Su cantidad de monedas por nivel es de: " + promMonedasNivel);
        
        



    }//main

}//class