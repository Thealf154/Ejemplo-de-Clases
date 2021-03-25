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

    public static void main(String[] args) {
        System.out.println("Mostrando a la ballena");
        Ballena ballena = new Ballena("Carnivoro", "50 años", true, 40.0, 10.0, 10000);
        System.out.println("Tiene aletas: " + ballena.getTieneAletas());
        System.out.println("Temperatura: " + ballena.getTemperaturaCorporal());
        System.out.println("Presión: " + ballena.getPresiónAgua());
        System.out.println("Cantidad de Plankton Comido: " + ballena.getCantidadDePlanktonComido());
    }
}