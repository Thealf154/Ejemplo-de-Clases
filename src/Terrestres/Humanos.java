package Terrestres;

public final class Humanos extends Terrestres {

    private String nombre;
    private String sexo;

    public Humanos(String sistemaDigestivo, String tiempoDeVida, String tipoDeRespiracion, boolean tienePatas,
            String nombre, String sexo) {

        super(sistemaDigestivo, tiempoDeVida, tipoDeRespiracion, tienePatas);
        this.nombre = nombre;
        this.sexo = sexo;

    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getNombre() {
        return this.nombre;
    }

    protected void setSexo(String sexo) {
        this.sexo = sexo;
    }

    protected String getSexo() {
        return this.sexo;
    }

    protected void hablar() {
        System.out.println(this.nombre + " está hablando");
    }

    public static void main(String[] args) {
        
        System.out.println("Mostrando al humano: ");

        Humanos h1 = new Humanos("Omnivoros", "80 años", "Pulmonar", true, "Juan", "Masculino");

        System.out.println("Este humano se llamas " + h1.getNombre() + ". Su sexo es " + h1.getSexo());

        h1.hablar();
    }

}
