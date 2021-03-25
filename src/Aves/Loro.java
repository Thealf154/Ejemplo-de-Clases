package Aves;

public class Loro extends Aves {

    private boolean Habla;
    private String Mup;

    Loro(String sistemaDigestivo, String tiempoDeVida, String tipodevuelo, boolean vuela, String plumaje, boolean habla,
            String mup) {
        super(sistemaDigestivo, tiempoDeVida, tipodevuelo, vuela, plumaje);
        this.Habla = habla;
        this.Mup = mup;
    }

    protected void setHabla(boolean habla) {
        this.Habla = habla;
    }

    protected boolean getHabla() {
        return this.Habla;
    }

    protected void setMup(String mup) {
        this.Mup = mup;
    }

    protected String getMup() {
        return this.Mup;
    }

    protected void Hablar() {
        if (getHabla() == true) {
            System.out.println("Este loro puede hablar");
        } else {
            System.out.println(getHabla());
            System.out.println("Este loro no puede hablar");
        }
    }

    public static void main(String[] args) {
        System.out.println("Mostrnado el loro");
        Loro loro1 = new Loro("Herviboro", "80 años", "Constante", true, "verde", true, "Zurdo");

        System.out.println("El loro es color " + loro1.getPlumaje());

        loro1.Hablar();

    }
}
