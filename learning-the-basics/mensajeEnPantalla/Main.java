import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        String resolucion = "Resolución: " + (int)screenSize.getWidth() + " x " + (int)screenSize.getHeight();
        JOptionPane.showMessageDialog(null, resolucion);
    }
}   