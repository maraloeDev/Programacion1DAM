package TEMA6.Herencia;

public class aMotor extends Barco {

    private int potencia;

    public aMotor(String matricula, int eslora, int potencia) {
        super(matricula, eslora);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "aMotor{" +
                "potencia=" + potencia +
                '}';
    }
}
