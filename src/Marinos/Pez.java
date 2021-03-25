package Marinos;

public class Pez extends Marinos {
    private String tipoDePez;
    private boolean esDeAguaSalada;

    Pez(String sistemaDigestivo, String tiempoDeVida, boolean tieneAletas, Double temperatura, Double presión,
            String tipoDePez, boolean esDeAguaSalada) {
        super(sistemaDigestivo, tiempoDeVida, tieneAletas, temperatura, presión);
    }

    protected void setTipoDePez(String tipo) {
        this.tipoDePez = tipo;
    }

    protected String getTipoDePez() {
        return this.tipoDePez;
    }

    protected void setEsDeAguaSalada(boolean aguaSalada) {
        this.esDeAguaSalada = aguaSalada;
    }

    protected boolean getEsDeAguaSalada() {
        return this.esDeAguaSalada;
    }

    protected void beberDelRío() {
        System.out.println("El pez esta bebiendo del río");
    }

    public static void main(String[] args) {
        Pez pez = new Pez("Herbivoro", "3 años", true, 70.0, 70.0, "Dorado", true);
        System.out.println("Tiene aletas: " + pez.getTieneAletas());
        System.out.println("Temperatura: " + pez.getTemperaturaCorporal());
        System.out.println("Presión: " + pez.getPresiónAgua());
        System.out.println("Tiene Aletas: " + pez.getTiempoDeVida());
        pez.Nadar();
        pez.reproducirse();
        pez.beberDelRío();
    }

}