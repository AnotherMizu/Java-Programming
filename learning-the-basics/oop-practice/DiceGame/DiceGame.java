import java.util.Random;

public class DiceGame{
    //tengo este como constructor
    private int numCaras;

    public DiceGame(int numCaras){
        this.numCaras = numCaras;
    }
    //Deuvelvo el numero de caras del dado
    public int getNumCaras(){
        return numCaras;
    }
    //setteo el numero de caras(agrego esto por si quiero cambiar el numero de caras de un mismo dado)
    public void setNumCaras(int numCaras){
        this.numCaras = numCaras;
    } 

    //lanzo
    public String lanzar(){
        Random random = new Random();
        int dice = 1 + random.nextInt(numCaras);

        ValidadorRango validacion = new ValidadorRango(1, numCaras);
        if (validacion.esValido(dice)) {
            return "El numero es " + dice;
        }
        else {
            return "Numero no es valido";
        }
    }

    
}