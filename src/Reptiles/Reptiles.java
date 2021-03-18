package Reptiles;
import Animales.*;

class reptiles extends Animales {

    private double temperaturaCorporal;
    private boolean exoesqueleto;
    private String texturadepiel;
    private boolean esOviparo;

    public reptiles(String sistemaDigestivo, String tiempoDeVida, boolean esOviparo, Double temperatura,
            boolean exoesqueleto, String textura) {
        super(sistemaDigestivo, tiempoDeVida);
        this.esOviparo = esOviparo;
        this.temperaturaCorporal = temperatura;
        this.exoesqueleto = exoesqueleto;
    }

    @Override
    public void reproducirse() {
        System.out.println("Un reptil se está reproduciendo");
    }

    @Override
    public void respirar() {
        System.out.println("Un reptil está respirando");
    }

    public void arrastrarse() {
        System.out.println("Esta arrastrandose");
    };

    public void setEsOviparo(boolean tiene) {
        this.esOviparo = tiene;
    }

    protected boolean getviviparo() {
        return this.esOviparo;
    }

    protected void setTexturaDePiel(String textura){
        this.texturadepiel = textura;
    }

    protected String getTexturaDePiel(){
        return this.texturadepiel;
    }

    protected void setTemperaturaCorporal(Double temperatura) {
        this.temperaturaCorporal = temperatura;
    }

    protected double getTemperaturaCorporal(Double temperatura) {
        return this.temperaturaCorporal;
    }

    protected void tieneExoesqueleto() {
        if (this.exoesqueleto) {
            System.out.println("Esta animal tiene exoesqueleto");
        } else {
            System.out.println("Este animal no es de hueso exoesqueleto");
        }
    }

}
