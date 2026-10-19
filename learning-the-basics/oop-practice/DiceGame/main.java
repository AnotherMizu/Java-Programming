import static javax.swing.JOptionPane.*;

void main(){
    int numCaras = Integer.parseInt(showInputDialog("Que numero de caras tendra su dado?(tiene que ser mayor o igual a 2)"));
    DiceGame dado3 = new DiceGame(numCaras);
    showMessageDialog(null, dado3.lanzar());
    showMessageDialog(null, dado3.lanzar());
    showMessageDialog(null, dado3.lanzar());
    showMessageDialog(null, dado3.lanzar());
    showMessageDialog(null, dado3.lanzar());
    showMessageDialog(null, dado3.lanzar());

}