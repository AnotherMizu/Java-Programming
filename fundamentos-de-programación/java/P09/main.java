import static javax.swing.JOptionPane.*;


void main(){
    byte userLevel;
    userLevel = Byte.parseByte(showInputDialog("¿Cual es su nivel de acceso?"));
    saludar();

    segun(userLevel);
}

void saludar(){
    System.out.println("hola");
}

void segun(byte userLevel){
    String levelMessage = "";
    switch(userLevel){
        case 1:
            levelMessage = "Nivel de acceso es: invitado\n";
            break;
        case 2:
            levelMessage = "Nivel de acceso es: empleado\n";
            break;
        case 3:
            levelMessage =  "Nivel de acceso es: supervisor\n";
            break;
        case 4:
            levelMessage =  "Nivel de acceso es: administrador\n";
            break;
        default:
            showMessageDialog(null, "sucedio un error, reportalo");
    }

    switch(userLevel){
        case 1, 2:
            showMessageDialog(null, levelMessage + "categoria de acceso básico" );
            break;
        case 3, 4:
            showMessageDialog(null, levelMessage + "categoria de acceso avanzado" );
            break;

    }
}