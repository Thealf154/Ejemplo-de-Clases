package Marinos;

public class Tiburón extends Marinos {
    private boolean haComidoHumanos;
    private boolean esAgresivo;

    Tiburón(String sistemaDigestivo, String tiempoDeVida, boolean tieneAletas, Double temperatura, Double presión,
            boolean haComidoHumanos, boolean esAgresivo) {
        super(sistemaDigestivo, tiempoDeVida, tieneAletas, temperatura, presión);
        this.haComidoHumanos = haComidoHumanos;
        this.esAgresivo = esAgresivo;
    }

    protected void setHaComidoHumanos(boolean comer){
        this.haComidoHumanos = comer;
    }

    protected boolean getHaComidoHumanos(){
        return this.haComidoHumanos;
    }

    protected void setEsAgresivo(boolean agresivo){
        this.esAgresivo = agresivo;
    }

    protected boolean getEsAgresivo(){
        return this.esAgresivo;
    }

    protected void jaws() {
        System.out.println("Dun dun dun dundun");
    }
}
