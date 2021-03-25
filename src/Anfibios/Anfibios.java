package  Anfibios ;

import  Animales.* ;

class  Anfibios  extends  Animales {

    protected  boolean oviparo ;
    protected  boolean pielhumeda;
    protected  boolean esqueletooseo;

    protected  Anfibios( String sistemaDigestivo , String tiempoDeVida , boolean oviparo, boolean piel , boolean esqueleto) {
        super (sistemaDigestivo, tiempoDeVida);
        this.oviparo = oviparo;
        this.pielhumeda = piel;
        this.esqueletooseo = esqueleto;
    }

    public void respirar (){
        System.out.println("Un anfibio está respirando");
    }

    public void reproducirse (){
        System.out.println("Un anfibio esta reproduciendose");
    }

    protected  void  comer () {
        System.out.println ( " Un anfibio esta comiendo un insecto " );
    }

     protected void temperatura () {
        System.out.println ( " Un anfibio esta controlando su temperatura " );
    }

     protected void cambiarpiel () {
        System.out.println ( "Un anfibio esta cambiando de piel .  .  . " );
    };

    protected  void  set ( boolean  es ) {
        this.oviparo = es;
    }

    protected  boolean  getOviparo () {
        return  this.oviparo;
    }

     protected void setPielhumeda ( boolean  piel ) {
        this.pielhumeda = piel;
    }

    protected  boolean  getPielhumeda () {
        return this.pielhumeda;
    }

    protected void setEsqueletooseo  ( boolean  esqueleto) {
        this.esqueletooseo = esqueleto;
    }

    protected boolean getEsqueletooseo () {
        return this.esqueletooseo;
    }
}