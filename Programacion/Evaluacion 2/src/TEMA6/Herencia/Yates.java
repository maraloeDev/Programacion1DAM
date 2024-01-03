package TEMA6.Herencia;

public class Yates extends Barco {

    private int potenciaYates;
    private int nCamarotes;

    public Yates(String matricula, int eslora, int potenciaYates) {
        super(matricula, eslora);
        this.potenciaYates = potenciaYates;
        this.nCamarotes = nCamarotes;
    }

    public int getPotenciaYates() {
        return potenciaYates;
    }

    public void setPotenciaYates(int potenciaYates) {
        this.potenciaYates = potenciaYates;
    }

    public int getnCamarotes() {
        return nCamarotes;
    }

    public void setnCamarotes(int nCamarotes) {
        this.nCamarotes = nCamarotes;
    }

    @Override
    public String toString() {
        return "Yates{" +
                "potenciaYates=" + potenciaYates +
                ", nCamarotes=" + nCamarotes +
                '}';
    }
}
