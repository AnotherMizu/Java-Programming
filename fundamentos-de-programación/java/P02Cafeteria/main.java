import static javax.swing.JOptionPane.*;

public class main{
    
    public static void main(String[] args) {

        float precioCafe, precioRebana, subTotal, subTotalConCargoFijo, subTotalConDescuento;
        
        precioCafe = Float.parseFloat(showInputDialog("¿Cuál es el precio del café?")); 
        precioRebana = Float.parseFloat(showInputDialog("¿Cúanto cuesta su rebanada de pastel?"));
        subTotal = precioCafe + precioRebana;
        subTotalConDescuento = subTotal * 0.95f;
        subTotalConCargoFijo = subTotalConDescuento + 15.0f;
        
        
        System.out.println("Ticket de compra");
        System.out.println("----------------");
        System.out.println("Precio del café: " + precioCafe);
        System.out.println("Precio de la rebanada: " + precioRebana);
        System.out.println("El subtotal con descuento es: " + subTotalConDescuento);
        System.out.println("Total: " + subTotalConCargoFijo);

        

    }

}