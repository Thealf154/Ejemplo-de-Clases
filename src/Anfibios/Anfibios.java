package Anfibios;

import Animales.*;

public class Anfibios extends Animales {

    protected boolean oviparo;
    protected boolean pielhumeda;
    protected boolean esqueletooseo;

    protected Anfibios(String sistemaDigestivo, String tiempoDeVida, boolean oviparo, boolean piel, boolean esqueleto) {
        super(sistemaDigestivo, tiempoDeVida);
        this.oviparo = oviparo;
        this.pielhumeda = piel;
        this.esqueletooseo = esqueleto;
    }

    public void respirar(){
        System.out.println("Reptil está respirando");
    }

    public void reproducirse(){
        System.out.println("Reptil esta reproduciendose");
    }

    public void dormir() {
        System.out.println(" Un anfibio esta en un sueño invernal ");
    }

    public void crecer() {
        System.out.println(" Un anfibio esta creciendo mediante metamorfosis ");
    }

    protected void cambiarpiel() {
        System.out.println("Un anfibio esta cambiando de piel .  .  . ");
    };

    protected void setOviparo(boolean es) {
        this.oviparo = es;
    }

    protected boolean getOviparo() {
        return this.oviparo;
    }

    protected void setPielhumeda(boolean piel) {
        this.pielhumeda = piel;
    }

    protected boolean getPielhumeda() {
        return this.pielhumeda;
    }

    protected void setEsqueletooseo(boolean esqueleto) {
        this.esqueletooseo = esqueleto;
    }

    protected boolean getEsqueletooseo() {
        return this.esqueletooseo;
    }
}