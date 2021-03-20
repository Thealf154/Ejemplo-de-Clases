package Terrestres;

public class gato extends Terrestres {

    private int vidas = 9;
    private String color;

    public gato (String sistemaDigestivo, String tiempoDeVida,String tipoDeRespiracion,boolean tienePatas,
    int vidas, String color) {

        super(sistemaDigestivo, tiempoDeVida, tipoDeRespiracion, tienePatas);

        this.vidas = vidas;
        this.color = color;

    }

    public void setVidas (int vidas){
        this.vidas = vidas;
    }

        public int getVidas (){
            return vidas;
        }
    
    public void setColor (String color){
        this.color = color;
    }

        public String getColor (){
            return color;
        }
    
}
