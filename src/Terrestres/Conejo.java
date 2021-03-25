package Terrestres;

import java.util.Scanner;

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
            System.out.println("Este conejo pesa" + getPeso() + "kg. Está muy gordo y no puede saltar.");
        } else {
            System.out.println("Este conejo pesa" + getPeso() +  "kg. Es capaz de saltar.");
        }

    }

    protected void alimentar() {
        if (this.alimento.equals("zanahoria") || this.alimento.equals("zanahorias") || this.alimento.equals("lechuga")
                || this.alimento.equals("lechugas")) {
            System.out.println("Este conejo se está alimentando correctamente");
        } else {
            System.out.println("No puedes alimentar a un conejo con " +  getAlimento() + ". Ellos comen zanahorias o lechuga.");
        }

    }

    public void public static void main(String[] args) {

        String feed;
        Scanner teclado1 = new Scanner (System.in);
        System.out.println("Mostrando al conejo:");
        System.out.println("Ingrese un alimento que quiera darle al conejo: ");
        feed = teclado1.next();
        
        Conejo conejo1 = new Conejo("herbívoro", "9 años", "Pulmonar", true, feed, 8);

        conejo1.alimentar();
        conejo1.saltar();
    }

}
