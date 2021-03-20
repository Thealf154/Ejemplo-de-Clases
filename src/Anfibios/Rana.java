package  Anfibios ;

 public class Rana  extends  Anfibios {

    Rana(String  sistemaDigestivo, String  tiempoDeVida, boolean  oviparo , boolean  pielhumeda , boolean  esqueletooseo) {
        super (sistemaDigestivo, tiempoDeVida, oviparo, pielhumeda, esqueletooseo);
    }

    protected void saltar () {
        System.out.println ( " La rana esta saltando " );
    }
    
}