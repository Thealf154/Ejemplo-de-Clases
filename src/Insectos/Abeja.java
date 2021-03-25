package Insectos;

public class Abeja extends Insectos {

    private boolean tieneAguijon;
    private double tamañocm;

    public Abeja(String sistemaDigestivo, String tiempoDeVida, boolean pellilloAdherente, boolean tieneAlas,
            boolean tieneAguijon, double tamañocm) {

        super(sistemaDigestivo, tiempoDeVida, pellilloAdherente, tieneAlas);

        this.tieneAguijon = tieneAguijon;
        this.tamañocm = tamañocm;

    }

    public void setTieneAguijon(boolean tieneAguijon) {
        this.tieneAguijon = tieneAguijon;
    }

    public boolean getTieneAguijon() {
        return tieneAguijon;
    }

    public void setTamañocm(double tamañocm) {
        this.tamañocm = tamañocm;
    }

    public double getTamañocm() {
        return tamañocm;
    }

    public void estraton() {

        if (this.tamañocm <= 0.55 && this.tieneAguijon == true) {
            System.out.println("Este ejemplar es una abeja obrera");
        }

        else if ((this.tamañocm <= 1.7 & this.tamañocm > 0.55) && this.tieneAguijon == false) {
            System.out.println("Esta abeja es un ejemplar zángano.");
        }

        else if ((this.tamañocm <= 3 & this.tamañocm > 1.7) && this.tieneAguijon == false) {
            System.out.println("Este ejemplar es una abeja reina");
        }

    }

    public static void main(String[] args) {
    }

}
