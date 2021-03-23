package Aves;

public class Gallina extends Aves {

    private String Colordepluma;
    private boolean Planea;

    Gallina(String sistemaDigestivo, String tiempoDeVida, String tipodevuelo, boolean vuela, String colordepluma,
            boolean planea) {
        super(sistemaDigestivo, tiempoDeVida, tipodevuelo, vuela);
        this.Colordepluma = colordepluma;
        this.Planea = planea;
    }

    protected void setColordepluma(String colordepluma) {
        this.Colordepluma = colordepluma;
    }

    protected String getColordepluma() {
        return this.Colordepluma;
    }

    protected void setPlanea(boolean planea) {
        this.Planea = planea;
    }

    protected boolean getPlanea() {
        return this.Planea;
    }

    protected void planear() {
        if (this.Planea) {
            System.out.println("La gallina esta planeando");
        } else {
            System.out.println("La gallina no puede planear");
        }
    }
}
