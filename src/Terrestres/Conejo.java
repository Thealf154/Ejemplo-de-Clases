package Terrestres;

public class Conejo extends Terrestres {

    private String alimento;
    private double peso;

    public Conejo(String sistemaDigestivo, String tiempoDeVida, String tipoDeRespiracion, boolean tienePatas,
            String alimento, double peso) {

        super(sistemaDigestivo, tiempoDeVida, tipoDeRespiracion, tienePatas);

        this.alimento = alimento;
        this.peso = peso;

    }

    protected void setAlimento(String alimento) {
        this.alimento = alimento.toLowerCase();
    }

    protected String getAlimento() {
        return alimento;
    }

    protected void setPeso(double peso) {
        this.peso = peso;
    }

    protected double getPeso() {
        return peso;
    }

    protected void saltar() {
        if (this.peso > 5) {
            System.out.println("Este conejo está muy gordo y no puede saltar.");
        } else {
            System.out.println("Este conejo es capaz de saltar.");
        }

    }

    protected void alimentar() {
        if (this.alimento.equals("zanahoria") || this.alimento.equals("zanahorias") || this.alimento.equals("lechuga")
                || this.alimento.equals("lechugas")) {
            System.out.println("Este conejo se está alimentando correctamente");
        } else {
            System.out.println("No puedes alimentar a un conejo con esto. Ellos comen zanahorias.");
        }

    }

}
