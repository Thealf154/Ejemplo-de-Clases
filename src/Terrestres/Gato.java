package Terrestres;

public class Gato extends Terrestres {

    private int vidas = 9;
    private String color;

    public Gato(String sistemaDigestivo, String tiempoDeVida, String tipoDeRespiracion, boolean tienePatas, int vidas,
            String color) {

        super(sistemaDigestivo, tiempoDeVida, tipoDeRespiracion, tienePatas);

        this.vidas = vidas;
        this.color = color;

    }

    protected void setVidas(int vidas) {
        this.vidas = vidas;
    }

    protected int getVidas() {
        return this.vidas;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    protected void maullar() {
        System.out.println(" ㅇㅅㅇ MIAUUUUUUUUUUU ㅇㅅㅇ");

    }

}