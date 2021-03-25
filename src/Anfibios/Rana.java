package Anfibios;

public class Rana extends Anfibios {
    Rana(String sistemaDigestivo, String tiempoDeVida, boolean oviparo, boolean pielhumeda, boolean esqueletooseo) {
        super(sistemaDigestivo, tiempoDeVida, oviparo, pielhumeda, esqueletooseo);
    }

    private void saltar() {
        System.out.println(" La rana esta saltando ");
    }

    public static void main(String[] args) {
        System.out.println("Presentado a la rana");
        Rana Rana = new Rana(" Omnivoro ", " 11 años ", true, true, true);
        Rana.comer();
        Rana.temperatura();
        Rana.cambiarpiel();
        Rana.saltar();
        System.out.println(Rana.getOviparo());
    }
}