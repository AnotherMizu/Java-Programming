

public class ValidadorRango {
    // Planteo los atributos del objeto
    private int numMin;
    private int numMax;

    // Creo el constructor con lo que son los limites
    public ValidadorRango(int numMin, int numMax) {
        this.numMin = numMin;
        this.numMax = numMax;
    }

    // Aqui valido si esta dentro del rango
    public boolean esValido(int num) {
        return num >= numMin && num <= numMax;
    }

    // Creo la forma de settear las variables o de obtenerlas
    public int getNumMax() {
        return numMax;
    }

    public void setNumMax(int numMax) {
        this.numMax = numMax;
    }

    public int getNumMin() {
        return numMin;
    }

    public void setNumMin(int numMin) {
        this.numMin = numMin;
    }
}