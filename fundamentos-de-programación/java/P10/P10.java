import static javax.swing.JOptionPane.*;

void main() {
    byte opcion;
    double monto, pago, diff;
    String menu;
    showMessageDialog("");
    monto = Double.parseDouble(showInputDialog("Monto a pagar: "));
    if (monto > 0){
        menu = "Métodos de pago \n" + 
        "-----------------\n" + 
        "1. Efectivo. \n" + 
        "2. Tarjeta de credito. \n" + 
        "3. transferencia \n " + 
        "Elige una opción: ";
        opcion = Byte.parseByte(showInputDialog(menu));

        switch(opcion) {
            case 1:
                //efectivo.
                pago = Double.parseDouble(showInputDialog("Con cuánto va a pagar?"));
                if (pago > 0) {
                    diff = pago - monto;
                    if(diff >= 0) {
                        showMessageDialog(null, "Monto pagado." + diff > 0 ? "Su cambio es de " + diff : "no le sobra");
                    }
                    else {
                        showMessageDialog(null, "pago insuficiente");
                    }
                }

            case 2:
                //tarjeta de credito.
            case 3:
                //transferencia bancaria.
            default:
                showMessageDialog(null, "Opción no valida");
        }
    }   else {
        showMessageDialog(null, "El monto a pagar debe ser mayor a 0");
    }

}