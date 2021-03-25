package Aves;

import Animales.*;

class Aves extends Animales {

    protected String TipoDeVuelo;
    protected boolean Vuela;
    protected String Plumaje;

    public Aves(String sistemaDigestivo, String tiempoDeVida, String tipoDeVuelo, boolean vuela, String plumaje) {
        super(sistemaDigestivo, tiempoDeVida);
        this.TipoDeVuelo = tipoDeVuelo;
        this.Vuela = vuela;
        this.Plumaje = plumaje;

    }

    protected void setTipoDeVuelo(String tipodevuelo) {
        this.TipoDeVuelo = tipodevuelo;
    }

    protected String getTipoDeVuelo() {
        return this.TipoDeVuelo;
    }

    protected void setVuela(boolean vuela) {
        this.Vuela = vuela;
    }

    protected boolean getVuela() {
        return this.Vuela;
    }

    protected void setPlumaje(String plumaje) {
        this.Plumaje = plumaje;
    }

    protected String getPlumaje() {
        return this.Plumaje;
    }

    protected void volar() {
        if (getVuela() == true) {
            System.out.println("El ave esta volando ");
        } else {
            System.out.println("Este ave no vuela ");
        }
    }

    public void respirar() {
        System.out.println("Una ave está respirando");
    }

    public void reproducirse() {
        System.out.println("Una ave se está reproduciendo ");
    }

}
