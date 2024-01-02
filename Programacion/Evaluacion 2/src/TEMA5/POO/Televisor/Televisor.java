package TEMA5.POO.Televisor;

import static TEMA5.POO.Televisor.App.scanner;

public class Televisor {

    private String numeroSerie;
    private double nPulgadas;
    private int nCanales;
    private int canal;
    private int volumen;
    private boolean encendido = false;
    private boolean silenciado;

    public Televisor(String numeroSerie, double nPulgadas, int nCanales) {
        this.numeroSerie = numeroSerie;
        this.nPulgadas = nPulgadas;
        this.nCanales = nCanales;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getnPulgadas() {
        return nPulgadas;
    }

    public void setnPulgadas(double nPulgadas) {
        this.nPulgadas = nPulgadas;
    }

    public int getnCanales() {
        return nCanales;
    }

    public void setnCanales(int nCanales) {
        this.nCanales = nCanales;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isSilenciado() {
        return silenciado;
    }

    public void setSilenciado(boolean silenciado) {
        this.silenciado = silenciado;
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "numeroSerie='" + numeroSerie + '\'' +
                ", nPulgadas=" + nPulgadas +
                ", nCanales=" + nCanales +
                ", canal=" + canal +
                ", volumen=" + volumen +
                ", encendido=" + encendido +
                ", silenciado=" + silenciado +
                '}';
    }

    public void menu() {
        System.out.println("""
                Opciones del televisor:\s
                 1- Encender Televisión
                 2- Apagar Televisión
                 3- Cambiar canal de televisión
                    a) Subir canal
                    b)Bajar canal
                    c)Directa
                    
                 4- Subir volumen
                 5- Bajar volumen
                 6- Silenciar
                 7- Datos del televisor""");

    }

    public void subMenu() {
        String opcion;
        do {

            System.out.println("3- Cambiar canal de televisión\n" +
                    "                        a) Subir canal\n" +
                    "                        b)Bajar canal\n" +
                    "                        c)Directa\n" +
                    "                         d) Volver al menu");
            opcion = scanner.next();
            switch (opcion) {
                case "a":
                    System.out.println(subirCanal());
                    break;
                case "b":
                    System.out.println(bajarCanal());
                    break;
                case "c":
                    System.out.println("Introduce un canal: ");
                    int canalCambiado = scanner.nextInt();
                    System.out.println("Canal " + cambiarCanal(canalCambiado));
                    break;
                case "d" :
                    menu();
            }
        } while ((opcion != "a") || (opcion != "b") || opcion != "c");
    }

    public String encenderTelevision() {

        if (!isEncendido()) {
            setEncendido(true);
            return "Encendiendo television...";
        } else {
            setEncendido(false);
            return "Apagando television...";
        }
    }

    public String cambiarCanal(int canalCambiado) {
        int canalMin = 1;
        int canalMax = 30;
        if ((canalCambiado < canalMin)) {
            return "El canal no existe " + getCanal();
        } else if (canalCambiado > 30) {
            return String.valueOf(canalMin);
        } else if (canalCambiado < 1) {
            return String.valueOf(canalMax);
        }
        canal=canalCambiado;
        return String.valueOf(canal);
    }

    public String subirCanal() {

        int canalMax = 30;

        if (getCanal() < canalMax) {
            canal++;
            return "Canal: " + canal;
        }
        if (canal==canalMax){
            canal=1;
            return "Canal" +canal;
        }
        return "Ya estas en el canal " + canal;
    }

    public String bajarCanal() {

        int canalMin = 1;

        if (getCanal() > canalMin) {
            canal--;
            return "Canal: " + canal;
        }

        return "Ya estas en el canal " + canal;
    }

    public String subirVolumen() {

        int volumenMax = 30;
        if (getVolumen() < volumenMax) {
            volumen++;
            return "Volumen: " + volumen;
        }
        return "Has alcanzado el volumen maximo... no puedes subir mas";
    }

    public String bajarVolumen() {

        int volumenMin = 0;
        if (getVolumen() > volumenMin) {
            volumen--;
            return "Volumen " + volumen;
        } else if (!silenciado().equals("0")) {

            return silenciado();
        }

        return "Volumen: " + volumen;
    }

    public String silenciado() {
        setVolumen(0);
        setSilenciado(true);
        return "Silenciado";
    }
}