package Aves;
    
public class Buho extends Aves{
    
    private boolean Ulular;
    private boolean Giracabeza; 
    
    Buho(String sistemaDigestivo, String tiempoDeVida,String tipodevuelo, boolean vuela, String plumaje, boolean ulular, boolean giracabeza) {
        super(sistemaDigestivo, tiempoDeVida, tipodevuelo, vuela, plumaje);
        this.Ulular = ulular;
        this.Giracabeza = giracabeza;
    }

    public void setUlular(boolean ulular){
        this.Ulular = ulular;
    }
    
    public boolean getUlular(){
        return this.Ulular;
    }
    
    public void setGiracabeza(boolean giracabeza){
        this.Giracabeza = giracabeza;
    }
    
    public boolean getGiracabeza(){
        return this.Giracabeza;
    }

    public static void main(String[] args) {
       Buho buho1 = new Buho ("Carnivoro", "5 años", "Constante", true, "cafe", true, true);
       
       System.out.println("El buho es color " + buho1.getPlumaje());
       
       

}
}
