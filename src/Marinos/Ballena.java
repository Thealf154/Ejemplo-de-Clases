package Marinos;

public class Ballena extends Marinos {
    private long cantidadDePlanktonComido;

    Ballena(String sistemaDigestivo, String tiempoDeVida, boolean tieneAletas, Double temperatura, Double presión,
            long cantidadDePlanktonComido) {
        super(sistemaDigestivo, tiempoDeVida, tieneAletas, temperatura, presión);
        this.cantidadDePlanktonComido = cantidadDePlanktonComido;
    }

    protected void setCantidadDePlanktonComido(long plankton) {
        this.cantidadDePlanktonComido = plankton;
    }

    protected long getCantidadDePlanktonComido() {
        return this.cantidadDePlanktonComido;
    }

    protected void comePlankton(){
        this.cantidadDePlanktonComido += 1000000;
        System.out.println("Comí 1000000 de plankton");
    }
}