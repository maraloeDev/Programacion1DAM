package TEMA6.Herencia.Ejercicio1;

public class Veleros extends Barco{

    private int nMastiles;

    public Veleros(String matricula, int eslora, int nMastiles) {
        super(matricula, eslora);
        this.nMastiles = nMastiles;
    }

    public int getnMastiles() {
        return nMastiles;
    }

    public void setnMastiles(int nMastiles) {
        this.nMastiles = nMastiles;
    }

    @Override
    public String toString() {
        return "Veleros{" +
                "nMastiles=" + nMastiles +
                '}';
    }
}
