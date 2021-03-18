package Marinos;

public class Tiburón extends Marinos{
    Tiburón(String sistemaDigestivo, String tiempoDeVida, boolean tieneAletas, Double temperatura, Double presión) {
        super(sistemaDigestivo, tiempoDeVida, tieneAletas, temperatura, presión);
    }

    protected void jaws(){
        System.out.println("Dun dun dun dundun");
    }
}
