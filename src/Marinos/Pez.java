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
        Pez Pez = new Pez("Herbivoro", "10 años", true, 70.0, 70.0, "Dorado", true);
        Pez.Nadar();
        Pez.reproducirse();
        Pez.beberDelRío();
        System.out.println(Pez.getTieneAletas());
    }

}