package Terrestres;

import java.util.Scanner;

public class Gato extends Terrestres {

    private int vidas;
    private String color;

    public Gato(String sistemaDigestivo, String tiempoDeVida, String tipoDeRespiracion, boolean tienePatas, int vidas,
            String color) {

        super(sistemaDigestivo, tiempoDeVida, tipoDeRespiracion, tienePatas);

        this.vidas = vidas;
        this.color = color;

    }

    protected void setVidas(int vidas) {
        this.vidas = vidas;
    }

    protected int getVidas() {
        return this.vidas;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    protected void maullar() {
        
        System.out.println("Este gato está maullando: \n ㅇㅅㅇ MIAUUUUUUUUUUU ㅇㅅㅇ");

    }

    public static void main(String[] args) {

        System.out.println("Mostrando al gato:");

        Gato gato1 = new Gato("Canívoro", "16 años", "Pulmonar", true, 9, "negro");

        System.out.println("Este gato tiene " + gato1.getVidas() + " vidas");

        System.out.println("Este gato es de color " + gato1.getColor());

        gato1.maullar();
    }

}